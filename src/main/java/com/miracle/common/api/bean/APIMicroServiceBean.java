package com.miracle.common.api.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIMicroServiceBean {

	private String projectName;
	//Velocity
	private double maxStoryPoint;
	private String filterType;
	private List<String> featureStatus;
	private List<String> storyStates;
	private List<String> featureStates;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public double getMaxStoryPoint() {
		return maxStoryPoint;
	}
	public void setMaxStoryPoint(double maxStoryPoint) {
		this.maxStoryPoint = maxStoryPoint;
	}
	public String getFilterType() {
		return filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
	public List<String> getFeatureStatus() {
		return featureStatus;
	}
	public void setFeatureStatus(List<String> featureStatus) {
		this.featureStatus = featureStatus;
	}
	public List<String> getStoryStates() {
		return storyStates;
	}
	public void setStoryStates(List<String> storyStates) {
		this.storyStates = storyStates;
	}
	public List<String> getFeatureStates() {
		return featureStates;
	}
	public void setFeatureStates(List<String> featureStates) {
		this.featureStates = featureStates;
	}
	@Override
	public String toString() {
		return "APIMicroServiceBean [projectName=" + projectName + ", maxStoryPoint=" + maxStoryPoint + ", filterType="
				+ filterType + ", featureStatus=" + featureStatus + ", storyStates=" + storyStates + ", featureStates="
				+ featureStates + "]";
	}
	
	
	
	
}
