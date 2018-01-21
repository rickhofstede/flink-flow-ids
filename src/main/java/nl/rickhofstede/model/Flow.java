package nl.rickhofstede.model;

/**
 * POJO that represents a network traffic flow as typically
 * exported by a flow export device (e.g., a router or probe).
 *
 * @author Rick Hofstede
 */
public class Flow {

    private String srcIPAddr, dstIPAddr;
    private int srcPort, dstPort, protocol, tcpFlags, ipVersion;
    private long startTime, endTime, packets, bytes;

    public Flow(String srcIPAddr, int srcPort, String dstIPAddr, int dstPort,
            long startTime, long endTime, long packets, long bytes,
            int protocol, int tcpFlags, int ipVersion) {
        this.srcIPAddr = srcIPAddr;
        this.srcPort = srcPort;
        this.dstIPAddr = dstIPAddr;
        this.dstPort = dstPort;
        this.startTime = startTime;
        this.endTime = endTime;
        this.protocol = protocol;
        this.tcpFlags = tcpFlags;
        this.ipVersion = ipVersion;
    }

    public String getSrcIPAddr() {
        return this.srcIPAddr;
    }

    public int getSrcPort() {
        return this.srcPort;
    }

    public String getDstIPAddr() {
        return this.dstIPAddr;
    }

    public int getDstPort() {
        return this.dstPort;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getPackets() {
        return this.packets;
    }

    public long getBytes() {
        return this.bytes;
    }

    public int getProtocol() {
        return this.protocol;
    }

    public int getTcpFlags() {
        return this.tcpFlags;
    }

    public int getIPVersion() {
        return this.ipVersion;
    }

}
