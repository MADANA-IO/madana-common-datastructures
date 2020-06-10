package com.madana.common.datastructures.requests;

import java.util.ArrayList;
import java.util.List;

public class AnalysisResult 
{
	String rawBytes;
	String description;
	AnalysisVisualization visualization;
	List<AnalysisResultSubGroup> subGroups = new ArrayList<AnalysisResultSubGroup>();
	public AnalysisResult()
	{
		
	}
	public List<AnalysisResultSubGroup> getSubGroups() {
		return subGroups;
	}
	public AnalysisResultSubGroup getSubGroupByFilter(String filter)
	{
		for(int i=0; i < subGroups.size(); i++)
		{
			if(subGroups.get(i).getFilter().equalsIgnoreCase(filter))
				return subGroups.get(i);
		}
		return null;
	}
	public void setSubGroups(List<AnalysisResultSubGroup> subGroups) {
		this.subGroups = subGroups;
	}
	public AnalysisResult(String data, String description, AnalysisVisualization analysisVisualization)
	{
		rawBytes = data;
		this.description=description;
		visualization=analysisVisualization;
		
	}
	public String getRawBytes() {
		return rawBytes;
	}
	public void setRawBytes(String rawBytes) {
		this.rawBytes = rawBytes;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public AnalysisVisualization getVisualization() {
		return visualization;
	}
	public void setVisualization(AnalysisVisualization visualization) {
		this.visualization = visualization;
	}

	public void addSubGroup(AnalysisResultSubGroup subGroup)
	{
		subGroups.add(subGroup);
	}
}
