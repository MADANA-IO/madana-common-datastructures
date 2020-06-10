package com.madana.common.datastructures;



public class SignedData 
{
	String data;
	protected String signature;
	String fingerpint;

	public String getSignature() 
	{
		return signature;
	}

	public void setSignature(String signature) 
	{
		this.signature = signature;
	}

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public String getFingerpint() {
		return fingerpint;
	}

	public void setFingerpint(String fingerpint) {
		this.fingerpint = fingerpint;
	}	

}
