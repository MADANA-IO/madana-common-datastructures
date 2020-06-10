package com.madana.common.datastructures.requests;



import java.util.List;

public class Analysis extends AnalysisRequest
{
	String uuid;
	String creator;
	String created;
	String status;
	String views;
	String datasetCount;
	String agent;
	List<String> participants;
	List<AnalysisRequestAction> actions;
	List<DatasetInfo> datasets;

	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getViews() 
	{
		return views;
	}
	public void setViews(String views)
	{
		this.views = views;
	}
	public List<AnalysisRequestAction> getActions() 
	{
		return actions;
	}
	public void setActions(List<AnalysisRequestAction> actions) 
	{
		this.actions = actions;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


	public String getDatasetCount() 
	{
		return datasetCount;
	}
	public void setDatasetCount(String datasetCount) 
	{
		this.datasetCount = datasetCount;
	}
	public List<String> getParticipants() {
		return participants;
	}
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
	
	public List<DatasetInfo> getDatasets()
	{
		return datasets;
	}
	public void setDatasets(List<DatasetInfo> datasets) {
		this.datasets = datasets;
	}
	public String toString()
	{
		return "[ "+status +" ]"+uuid+" "+ "created from " + creator +" at " + created;
	}
}
