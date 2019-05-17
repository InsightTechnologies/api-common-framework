package com.miracle.common.api.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({"class","id" })
public class Backlog {
	@JsonProperty("class")
	private String className;
	private int id;

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

}

// "class":"TimeBox","id":120325
