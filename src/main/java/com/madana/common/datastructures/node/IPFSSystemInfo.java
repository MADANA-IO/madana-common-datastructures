package com.madana.common.datastructures.node;

public class IPFSSystemInfo {
	String id;
	String publicKey;
	String agentVersion;
	String protocolVersion;
	String swarmConnection;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getAgentVersion() {
		return agentVersion;
	}
	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
	}
	public String getProtocolVersion() {
		return protocolVersion;
	}
	public void setProtocolVersion(String protocolVersion) {
		this.protocolVersion = protocolVersion;
	}
	public String getSwarmConnection() {
		return swarmConnection;
	}
	public void setSwarmConnection(String swarmConnection) {
		this.swarmConnection = swarmConnection;
	}

}
