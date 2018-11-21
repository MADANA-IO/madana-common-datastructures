package de.madana.common.datastructures;

public class MDN_Application 
{
String name;
String description;
String ratelimit;
MDN_Organization creator;
String valid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getRatelimit() {
	return ratelimit;
}
public void setRatelimit(String ratelimit) {
	this.ratelimit = ratelimit;
}
public MDN_Organization getCreator() {
	return creator;
}
public void setCreator(MDN_Organization creator) {
	this.creator = creator;
}
public String getValid() {
	return valid;
}
public void setValid(String valid) {
	this.valid = valid;
}
}
