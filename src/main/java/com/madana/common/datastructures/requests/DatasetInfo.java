package com.madana.common.datastructures.requests;

import com.madana.common.datastructures.SignedData;

public class DatasetInfo extends SignedData
{
	String size;
	String creationdate;
	String hash;
	String fingerprint;
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}

}
