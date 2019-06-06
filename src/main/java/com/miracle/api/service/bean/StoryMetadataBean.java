package com.miracle.api.service.bean;

import java.util.List;

import com.miracle.common.api.bean.StoryID;

public class StoryMetadataBean {
	private List<StoryID> stories_ids;
	private List<Integer> storyStates;
	private String projectName;

	/**
	 * @return the stories_ids
	 */
	public List<StoryID> getStories_ids() {
		return stories_ids;
	}

	/**
	 * @param stories_ids the stories_ids to set
	 */
	public void setStories_ids(List<StoryID> stories_ids) {
		this.stories_ids = stories_ids;
	}

	/**
	 * @return the storyStates
	 */
	public List<Integer> getStoryStates() {
		return storyStates;
	}

	/**
	 * @param storyStates the storyStates to set
	 */
	public void setStoryStates(List<Integer> storyStates) {
		this.storyStates = storyStates;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 */
	@Override
	public String toString() {
		return "StoryMetadataBean [stories_ids=" + stories_ids + ", storyStates=" + storyStates + ", projectName="
				+ projectName + "]";
	}

}
