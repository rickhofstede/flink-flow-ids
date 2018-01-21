package nl.rickhofstede;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

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

        env.execute("Flow-based IDS based on Apache Flink");
    }
}
