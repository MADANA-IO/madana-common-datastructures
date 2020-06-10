package com.madana.common.datastructures.requests;

public class AnalysisRequest
{
	
	String description;
	String tokenAmount;
	
	String dataCollectionMethod;
	String dataCollectionConfig;
	
	String treshold;

/*
 * The amounts of token that will be distributed to every user for participating for participating
 *  @DocumentationExample("my.email@address.com")
 */
	public String getTokenAmount()
	{
		return tokenAmount;
	}
	public void setTokenAmount(String tokenAmount)
	{
		this.tokenAmount=tokenAmount;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTreshold() {
		return treshold;
	}
	public void setTreshold(String treshold) {
		this.treshold = treshold;
	}
	public String getDataCollectionMethod() {
		return dataCollectionMethod;
	}
	public void setDataCollectionMethod(String dataCollectionMethod) {
		this.dataCollectionMethod = dataCollectionMethod;
	}
	public String getDataCollectionConfig() {
		return dataCollectionConfig;
	}
	public void setDataCollectionConfig(String dataCollectionConfig) {
		this.dataCollectionConfig = dataCollectionConfig;
	}

	

}
