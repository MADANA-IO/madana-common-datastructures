package com.madana.common.datastructures.requests;

import java.util.List;

public class AnalysisVisualization 
{

String scriptsrc;
String function;
List<String> parameters;
public AnalysisVisualization()
{
	
}
public AnalysisVisualization(String scriptsrc, String function, List<String> parameters) 
{
this.scriptsrc=scriptsrc;
this.function=function;
this.parameters=parameters;
}
public String getScriptsrc() {
	return scriptsrc;
}
public void setScriptsrc(String scriptsrc) {
	this.scriptsrc = scriptsrc;
}
public List<String> getParameters() {
	return parameters;
}
public void setParameters(List<String> parameters) {
	this.parameters = parameters;
}

public String getFunction() {
	return function;
}
public void setFunction(String function) {
	this.function = function;
}

}
