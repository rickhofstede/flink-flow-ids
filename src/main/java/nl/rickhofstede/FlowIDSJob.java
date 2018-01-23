package nl.rickhofstede;

import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import nl.rickhofstede.model.Flow;
import nl.rickhofstede.model.FlowDataSet;
import nl.rickhofstede.pattern.*;

/**
 * This class forms the core of the flow-based IDS, as it
 * is the Flink job that will eventually be executed using
 * the Flink runtime environment.
 *
 * @author Rick Hofstede
 */
public class FlowIDSJob {

    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env =
                StreamExecutionEnvironment.getExecutionEnvironment();

        /* Get input data */
        DataStream<Flow> input = env.fromElements(FlowDataSet.DATA);

        PatternStream<Flow> patternStream =
                CEP.pattern(input, IPv6PingSweep.pattern);

        env.execute("Flow-based IDS based on Apache Flink");
    }
}
