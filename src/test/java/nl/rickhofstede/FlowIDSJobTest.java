package nl.rickhofstede;

import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.cep.PatternSelectFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.streaming.util.StreamingMultipleProgramsTestBase;

import org.junit.Test;

import nl.rickhofstede.model.Flow;
import nl.rickhofstede.model.FlowDataSet;
import nl.rickhofstede.pattern.IPv6PingSweep;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Test cases for `FlowIDSJob`.
 * @author Rick Hofstede
 */
public class FlowIDSJobTest extends StreamingMultipleProgramsTestBase {

    @Test
    public void readStaticFlowDataTest() throws Exception {
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        /* Clear output sink */
        FlowSink.values.clear();

        /* Process input data */
        env.fromElements(FlowDataSet.DATA).addSink(new FlowSink());
        env.execute();

        assertEquals(50, FlowSink.values.size());
    }

    @Test
    public void ipv6PingSweepPatternTest() throws Exception {
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        /* Clear output sink */
        IPv6PingSweepSink.values.clear();

        /* Fetch input data */
        DataStream<Flow> input = env.fromElements(FlowDataSet.DATA);

        /* Apply CEP */
        PatternStream<Flow> patternStream =
                CEP.pattern(input, IPv6PingSweep.pattern);

        /* Write results to output sink */
        DataStream<IPv6PingSweep> detections = patternStream.select(new PatternSelectFunction<Flow, IPv6PingSweep>() {
            @Override
            public IPv6PingSweep select(Map<String, List<Flow>> pattern) throws Exception {
                return new IPv6PingSweep();
            }
        });

        detections.addSink(new IPv6PingSweepSink());
        env.execute();

        assertEquals(1, IPv6PingSweepSink.values.size());
    }

    /**
     * Sink to be used for collecting test results.
     */
    private static class FlowSink implements SinkFunction<Flow> {

        public static final List<Flow> values = new ArrayList<>();

        @Override
        public synchronized void invoke(Flow f) throws Exception {
            values.add(f);
        }
    }

    private static class IPv6PingSweepSink implements SinkFunction<IPv6PingSweep> {

        public static final List<IPv6PingSweep> values = new ArrayList<>();

        @Override
        public synchronized void invoke(IPv6PingSweep p) throws Exception {
            values.add(p);
        }
    }
}
