package com.madana.common.datastructures.requests;
public class DataCollectionMethod {
	
	DataCollectionType type;
	String name;
	String description;
	String inputModel;
	String outputModel;
	
	public DataCollectionType getType() {
		return type;
	}
	public void setType(DataCollectionType type) {
		this.type = type;
	}
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
	public String getInputModel() {
		return inputModel;
	}
	public void setInputModel(String inputModel) {
		this.inputModel = inputModel;
	}
	public String getOutputModel() {
		return outputModel;
	}
	public void setOutputModel(String outputModel) {
		this.outputModel = outputModel;
	}

}
