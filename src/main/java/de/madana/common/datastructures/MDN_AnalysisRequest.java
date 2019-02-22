package de.madana.common.datastructures;

public class MDN_AnalysisRequest 
{
 String uuid;
 String creator;
 String created;
 String status;
 
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
}
