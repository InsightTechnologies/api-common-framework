package com.miracle.scrum.bean;

import java.util.Map;

public class Story {
	private int uid;
	private String name;
	private String description;
	private int status;
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
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
