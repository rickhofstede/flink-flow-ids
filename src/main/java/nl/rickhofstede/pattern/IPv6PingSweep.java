package nl.rickhofstede.pattern;

import org.apache.flink.cep.pattern.conditions.SimpleCondition;
import org.apache.flink.cep.pattern.Pattern;

import nl.rickhofstede.model.Flow;

/**
 * Pattern that represents an IPv6 Ping Sweep.
 *
 * @author Rick Hofstede
 */

public class IPv6PingSweep {

    public static Pattern<Flow, ?> pattern = Pattern.<Flow>begin("ipv6PingSweep-begin").where(
        new SimpleCondition<Flow>() {
            @Override
            public boolean filter(Flow flow) {
                return flow.getIPVersion() == 6
                    && flow.getProtocol() == 58
                    && flow.getPackets() <= 3;
            }
        }
    ).timesOrMore(10);
}
