package com.madana.common.datastructures.requests;

public class AnalysisResultSubGroup extends AnalysisResult 
{

public AnalysisResultSubGroup()
{
	
}
public AnalysisResultSubGroup(String data, String description, String filter, AnalysisVisualization analysisVisualization) {
		super(data, description, analysisVisualization);
		this.filter = filter;
	}

String filter;

public String getFilter() {
	return filter;
}

public void setFilter(String filter) {
	this.filter = filter;
}
}
