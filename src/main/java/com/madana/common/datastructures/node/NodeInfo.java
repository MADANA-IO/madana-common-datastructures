package com.madana.common.datastructures.node;

import java.util.List;

public class NodeInfo 
{
	String operatingSystem;
	Long operatingSystemUptime;
	
	String hardwareFirmware;
	String hardwareBaseboard;
	String owner;
	String status;
	String memory;
	String publicKey;
	String connectionURL;
	String cpuModel;
	String cpuFamily;
	String cpuFrequency;
	int cpuPhysicalCores;
	int cpuLogicalCount;
	
	IPFSSystemInfo ipfsInfo;
	SGXInfo sgxInfo;
	
	List<String> processors;
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public Long getOperatingSystemUptime() {
		return operatingSystemUptime;
	}
	public void setOperatingSystemUptime(Long operatingSystemUptime) {
		this.operatingSystemUptime = operatingSystemUptime;
	}

	public String getHardwareFirmware() {
		return hardwareFirmware;
	}
	public void setHardwareFirmware(String hardwareFirmware) {
		this.hardwareFirmware = hardwareFirmware;
	}
	public String getHardwareBaseboard() {
		return hardwareBaseboard;
	}
	public void setHardwareBaseboard(String hardwareBaseboard) {
		this.hardwareBaseboard = hardwareBaseboard;
	}
	public String getCpuModel() {
		return cpuModel;
	}
	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}
	public String getCpuFamily() {
		return cpuFamily;
	}
	public void setCpuFamily(String cpuFamily) {
		this.cpuFamily = cpuFamily;
	}
	public int getCpuPhysicalCores() {
		return cpuPhysicalCores;
	}
	public void setCpuPhysicalCores(int cpuPhysicalCores) {
		this.cpuPhysicalCores = cpuPhysicalCores;
	}
	public int getCpuLogicalCount() {
		return cpuLogicalCount;
	}
	public void setCpuLogicalCount(int cpuLogicalCount) {
		this.cpuLogicalCount = cpuLogicalCount;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getConnectionURL() {
		return connectionURL;
	}
	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}
	public String getCpuFrequency() {
		return cpuFrequency;
	}
	public void setCpuFrequency(String cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}
	public void setMemory(String valueOf) {
	this.memory=valueOf;
		
	}
	public String getMemory() {
		return memory;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getProcessors() {
		return processors;
	}
	public void setProcessors(List<String> processors) {
		this.processors = processors;
	}
	public IPFSSystemInfo getIpfsInfo() {
		return ipfsInfo;
	}
	public void setIpfsInfo(IPFSSystemInfo ipfsInfo) {
		this.ipfsInfo = ipfsInfo;
	}
	public SGXInfo getSgxInfo() {
		return sgxInfo;
	}
	public void setSgxInfo(SGXInfo sgxInfo) {
		this.sgxInfo = sgxInfo;
	}
	
}
