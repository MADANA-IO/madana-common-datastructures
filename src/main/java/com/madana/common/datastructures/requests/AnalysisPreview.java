package com.madana.common.datastructures.requests;

public class AnalysisPreview extends AnalysisRequest
{
	String uuid;
	String creator;
	String created;
	String views;
	String participants;
	String status;
	



	public String getViews() 
	{
		return views;
	}
	public void setViews(String views)
	{
		this.views = views;
	}

	public String getUuid() 
	{
		return uuid;
	}
	public void setUuid(String uuid) 
	{
		this.uuid = uuid;
	}
	public String getCreator() 
	{
		return creator;
	}
	public void setCreator(String creator) 
	{
		this.creator = creator;
	}
	public String getCreated() 
	{
		return created;
	}
	public void setCreated(String created) 
	{
		this.created = created;
	}
	public String getParticipants() {
		return participants;
	}
	public void setParticipants(String participants) {
		this.participants = participants;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String toString()
	{
		return uuid+" "+ "created from " + creator +" at " + created;
	}
	public boolean equals(Object o)
	{
	    if(o instanceof AnalysisPreview)
	    {
	    	AnalysisPreview compareMe = (AnalysisPreview) o;
	    	if(this.uuid.equals(compareMe.uuid))
	    				return true;
	    }
	    return false;
	}
}
