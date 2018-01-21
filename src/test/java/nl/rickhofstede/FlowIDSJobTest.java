package nl.rickhofstede;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.streaming.util.StreamingMultipleProgramsTestBase;

import org.junit.Test;

import nl.rickhofstede.model.Flow;
import nl.rickhofstede.model.FlowDataSet;

import java.util.ArrayList;
import java.util.List;

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
}
