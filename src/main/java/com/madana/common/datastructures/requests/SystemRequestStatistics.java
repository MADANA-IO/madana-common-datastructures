package com.madana.common.datastructures.requests;

import java.util.List;



public class SystemRequestStatistics {
	List<AnalysisPreview> latestRequests;
	List<AnalysisRequestAction> latestActions;
	public List<AnalysisPreview> getLatestRequests() {
		return latestRequests;
	}
	public void setLatestRequests(List<AnalysisPreview> latestRequests) {
		this.latestRequests = latestRequests;
	}
	public List<AnalysisRequestAction> getLatestActions() {
		return latestActions;
	}
	public void setLatestActions(List<AnalysisRequestAction> latestActions) {
		this.latestActions = latestActions;
	} 

}
