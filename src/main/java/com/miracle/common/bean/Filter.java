package com.miracle.common.bean;

public class Filter {
	private String filterType;
	private int velocityPercentage;

	/**
	 * @return the filterType
	 */
	public String getFilterType() {
		return filterType;
	}

	/**
	 * @param filterType the filterType to set
	 */
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	/**
	 * @return the velocityPercentage
	 */
	public int getVelocityPercentage() {
		return velocityPercentage;
	}

	/**
	 * @param velocityPercentage the velocityPercentage to set
	 */
	public void setVelocityPercentage(int velocityPercentage) {
		this.velocityPercentage = velocityPercentage;
	}
}
