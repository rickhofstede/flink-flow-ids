package nl.rickhofstede;

import org.apache.flink.streaming.api.functions.sink.SinkFunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Sink to be used in tests.
 * @param <IN> type of the item to be sinked
 */
public class TestSink<IN> implements SinkFunction<IN> {

    public final List<IN> values = new ArrayList<IN>();

    @Override
    public synchronized void invoke(IN item) throws Exception {
        values.add(item);
    }
}
