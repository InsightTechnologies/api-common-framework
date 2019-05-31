package com.miracle.common.api.bean;

import org.springframework.stereotype.Component;

@Component
public class StoryID {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StoryID [id=" + id + "]";
	}
	
}
