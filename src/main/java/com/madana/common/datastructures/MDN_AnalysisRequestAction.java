package com.madana.common.datastructures;

public class MDN_AnalysisRequestAction 
{
	String user;
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
	
}
