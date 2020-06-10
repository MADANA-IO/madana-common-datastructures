package com.madana.common.datastructures.requests;

import java.util.List;

public class DataCollectionType {
	
	String name;
	String description;
	List <DataCollectionType> childTypes;
	
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
	public List<DataCollectionType> getChildTypes() {
		return childTypes;
	}
	public void setChildTypes(List<DataCollectionType> childTypes) {
		this.childTypes = childTypes;
	}

}
