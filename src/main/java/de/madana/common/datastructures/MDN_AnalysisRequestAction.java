package de.madana.common.datastructures;

public class MDN_AnalysisRequestAction 
{
	MDN_SimpleUserProfile user;
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
	public MDN_SimpleUserProfile getUser() 
	{
		return user;
	}
	public void setUser(MDN_SimpleUserProfile user) {
		this.user = user;
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
