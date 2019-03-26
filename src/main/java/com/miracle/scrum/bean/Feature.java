package com.miracle.scrum.bean;

import java.util.List;
import java.util.Map;

public class Feature {
	private int uid;
	private String createdDate;
	private int priority;
	private List<Story> stories;
	private String name;
	private String description;
	private Map<String, Object> additionalDetails;

	/**
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the stories
	 */
	public List<Story> getStories() {
		return stories;
	}

	/**
	 * @param stories the stories to set
	 */
	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the additionalDetails
	 */
	public Map<String, Object> getAdditionalDetails() {
		return additionalDetails;
	}

	/**
	 * @param additionalDetails the additionalDetails to set
	 */
	public void setAdditionalDetails(Map<String, Object> additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
}
