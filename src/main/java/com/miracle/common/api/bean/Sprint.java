package com.miracle.common.api.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprint {
	
	/*
	 * {"class":"Sprint","id":120329,"state":2,"capacity":18.0,"velocity":5.0,"orderNumber":2,"parentReleaseId":120326,"hasNextSprint":true,"reactivable":false,"parentReleaseName":"Peetic core","parentReleaseOrderNumber":"1","deliveredVersion":"v0.2","index":2,"plannedVelocity":18.0},
	 */

	@JsonProperty("class")
	private String className;
	@JsonProperty(required = true)
	private int id;
	private int state;
	private int capacity;
	private int velocity;
	private int orderNumber;
	private int parentReleaseId;
	private String hasNextSprint;
	private String reactivable;
	private String parentReleaseName;
	private int parentReleaseOrderNumber;
	private String deliveredVersion;
	private int index;
	private int plannedVelocity;
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public int getParentReleaseId() {
		return parentReleaseId;
	}
	public void setParentReleaseId(int parentReleaseId) {
		this.parentReleaseId = parentReleaseId;
	}
	public String getHasNextSprint() {
		return hasNextSprint;
	}
	public void setHasNextSprint(String hasNextSprint) {
		this.hasNextSprint = hasNextSprint;
	}
	public String getReactivable() {
		return reactivable;
	}
	public void setReactivable(String reactivable) {
		this.reactivable = reactivable;
	}
	public String getParentReleaseName() {
		return parentReleaseName;
	}
	public void setParentReleaseName(String parentReleaseName) {
		this.parentReleaseName = parentReleaseName;
	}
	public int getParentReleaseOrderNumber() {
		return parentReleaseOrderNumber;
	}
	public void setParentReleaseOrderNumber(int parentReleaseOrderNumber) {
		this.parentReleaseOrderNumber = parentReleaseOrderNumber;
	}
	public String getDeliveredVersion() {
		return deliveredVersion;
	}
	public void setDeliveredVersion(String deliveredVersion) {
		this.deliveredVersion = deliveredVersion;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getPlannedVelocity() {
		return plannedVelocity;
	}
	public void setPlannedVelocity(int plannedVelocity) {
		this.plannedVelocity = plannedVelocity;
	}
	@Override
	public String toString() {
		return "Sprint [className=" + className + ", id=" + id + ", state=" + state + ", capacity=" + capacity
				+ ", velocity=" + velocity + ", orderNumber=" + orderNumber + ", parentReleaseId=" + parentReleaseId
				+ ", hasNextSprint=" + hasNextSprint + ", reactivable=" + reactivable + ", parentReleaseName="
				+ parentReleaseName + ", parentReleaseOrderNumber=" + parentReleaseOrderNumber + ", deliveredVersion="
				+ deliveredVersion + ", index=" + index + ", plannedVelocity=" + plannedVelocity + "]";
	}
	
	
	
}
