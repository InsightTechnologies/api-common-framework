package com.miracle.common.api.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@Component
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({ "class", "id", "activities_count", "attachments_count", "backlog", "color", "comments_count",
		"dateCreated" ,"description","lastUpdated","name","notes","parentRelease","rank","stories_ids","todoDate",
		"type","uid","value","countDoneStories","state","effort","tags","inProgressDate","project","notes_html"})
public class Feature {
	@JsonProperty("class")
	private String className;
	@JsonProperty(required = true)
	private int id;
	private int activities_count;
	private int attachments_count;
	private Backlog backlog;
	private String color;
	private int comments_count;
	private String dateCreated;
	private String description;
	private String lastUpdated;
	private String name;
	private String notes;
	private String parentRelease;
	private int rank;
	@JsonProperty(required = true)
	private List<StoryID> stories_ids;
	private String todoDate;
	private int type;
	private int uid;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty(required = true)
	private int value;
	private int countDoneStories;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty(required = true)
	private int state;
	private double effort;
	private List<String> tags;
	private String inProgressDate;
	private Project project;
	private String notes_html;

	public Backlog getBacklog() {
		return backlog;
	}

	public void setBacklog(Backlog backlog) {
		this.backlog = backlog;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getParentRelease() {
		return parentRelease;
	}

	public void setParentRelease(String parentRelease) {
		this.parentRelease = parentRelease;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(String todoDate) {
		this.todoDate = todoDate;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getCountDoneStories() {
		return countDoneStories;
	}

	public void setCountDoneStories(int countDoneStories) {
		this.countDoneStories = countDoneStories;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getInProgressDate() {
		return inProgressDate;
	}

	public void setInProgressDate(String inProgressDate) {
		this.inProgressDate = inProgressDate;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getNotes_html() {
		return notes_html;
	}

	public void setNotes_html(String notes_html) {
		this.notes_html = notes_html;
	}

	public List<StoryID> getStories_ids() {
		return stories_ids;
	}

	public void setStories_ids(List<StoryID> stories_ids) {
		this.stories_ids = stories_ids;
	}

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

	public int getActivities_count() {
		return activities_count;
	}

	public void setActivities_count(int activities_count) {
		this.activities_count = activities_count;
	}

	public int getAttachments_count() {
		return attachments_count;
	}

	public void setAttachments_count(int attachments_count) {
		this.attachments_count = attachments_count;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getComments_count() {
		return comments_count;
	}

	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getEffort() {
		return effort;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}

	/*
	 * comments_count: 0, dateCreated: "2019-03-18T10:44:12Z", description:
	 * "Administrate and moderate content created by the users", lastUpdated:
	 * "2019-03-18T10:44:13Z", name: "Administration", notes: null, parentRelease:
	 * null, rank: 1, stories_ids: [ { id: 260825 }, { id: 260831 }, { id: 260827 }
	 * ], todoDate: "2019-03-18T10:44:12Z", type: 0, uid: 1, value: 2,
	 * countDoneStories: 0, state: 0, effort: 1, tags: [ ], project: { class:
	 * "Project", id: 120325, pkey: "PETMMEDIBO", name: "Peetic mmedibo" },
	 * notes_html: ""
	 */
}
