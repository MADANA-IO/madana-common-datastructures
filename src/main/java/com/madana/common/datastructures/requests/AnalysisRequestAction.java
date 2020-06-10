package com.madana.common.datastructures.requests;

public class AnalysisRequestAction 
{
	String user;
	String application;
	String connection;
	String fingerprint;
	String signature;
	String date;
	String action;
	String details;
	String requestID;
	
	public String getRequestID() {
		return requestID;
	}
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	public String getUser() 
	{
		return user;
	}
	public void setUser(String string) {
		this.user = string;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public boolean equals(Object o)
	{
	    if(o instanceof AnalysisRequestAction)
	    {
	    	AnalysisRequestAction compareMe = (AnalysisRequestAction) o;
	    	if(this.date.equals(compareMe.date))
	    		if(this.action.equals(compareMe.action))
	    			if(this.user.equals(compareMe.user))
	    				return true;
	    }
	    return false;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	
}
