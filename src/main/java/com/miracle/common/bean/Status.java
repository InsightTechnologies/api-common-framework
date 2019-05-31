package com.miracle.common.bean;

public class Status {

	private String object;
	private String type;
	private int statusId;
	private String statusValue;

	/**
	 * @return the object
	 */
	public String getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object) {
		this.object = object;
	}

	/**
	 * @return the objectType
	 */
	public String getObjectType() {
		return type;
	}

	/**
	 * @param objectType the objectType to set
	 */
	public void setObjectType(String type) {
		this.type = type;
	}

	/**
	 * @return the statusId
	 */
	public int getStatusId() {
		return statusId;
	}

	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	/**
	 * @return the statusValue
	 */
	public String getStatusValue() {
		return statusValue;
	}

	/**
	 * @param statusValue the statusValue to set
	 */
	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Status [object=" + object + ", objectType=" + type + ", statusId=" + statusId + ", statusValue="
				+ statusValue + "]";
	}
	
	
}
