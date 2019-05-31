package com.miracle.common.bean;

public class Team {
	private String teamName;
	private long velocity;
	private long workingHours;

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the velocity
	 */
	public long getVelocity() {
		return velocity;
	}

	/**
	 * @param velocity the velocity to set
	 */
	public void setVelocity(long velocity) {
		this.velocity = velocity;
	}

	/**
	 * @return the workingHours
	 */
	public long getWorkingHours() {
		return workingHours;
	}

	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(long workingHours) {
		this.workingHours = workingHours;
	}
}
