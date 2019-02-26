package de.madana.common.datastructures;

import java.util.List;

public class MDN_AnalysisRequest 
{
 String uuid;
 String creator;
 String created;
 String status;
 String views;
 String participants;
 private String datasetCount;
 public String getViews() {
	return views;
}
public void setViews(String views) {
	this.views = views;
}
public String getParticipants() {
	return participants;
}
public void setParticipants(String participants) {
	this.participants = participants;
}

List<MDN_AnalysisRequestAction> actions;
 
 public List<MDN_AnalysisRequestAction> getActions() {
	return actions;
}
public void setActions(List<MDN_AnalysisRequestAction> actions) {
	this.actions = actions;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
public String getCreator() {
	return creator;
}
public void setCreator(String creator) {
	this.creator = creator;
}
public String getCreated() {
	return created;
}
public void setCreated(String created) {
	this.created = created;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

 public String toString()
 {
	 return "[ "+status +" ]"+uuid+" "+ "created from " + creator +" at " + created;
 }
public String getDatasetCount() {
	return datasetCount;
}
public void setDatasetCount(String datasetCount) {
	this.datasetCount = datasetCount;
}
}
