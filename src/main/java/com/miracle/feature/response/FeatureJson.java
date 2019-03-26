package com.miracle.feature.response;

import java.util.List;

import com.miracle.scrum.bean.Feature;

public class FeatureJson {
	private List<Feature> featureList;

	/**
	 * @return the featureList
	 */
	public List<Feature> getFeatureList() {
		return featureList;
	}

	/**
	 * @param featureList the featureList to set
	 */
	public void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}
}
