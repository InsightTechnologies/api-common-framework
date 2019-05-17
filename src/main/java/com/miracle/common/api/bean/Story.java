package com.miracle.common.api.bean;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@Component
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({ "class", "id","acceptanceTests_count","acceptedDate", "activities_count", "affectVersion","attachments_count", "backlog", "comments_count","creator", 
		"dateCreated" ,"dependsOn","description","doneDate","effort","estimatedDate","feature","followers_ids","frozenDate","inProgressDate","inReviewDate","lastUpdated","name","notes","origin","parentSprint","plannedDate","rank","state","suggestedDate","tasks_count","todoDate",
		"type","uid","value","testState","tags","dependences","countDoneTasks","project","commits_count","builds_count","voters_ids","notes_html"})

public class Story implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8476897467917173378L;
	@JsonProperty("class")
	private String className;
	@JsonProperty(required = true)
	private int id;
	private int acceptanceTests_count;
	private String acceptedDate;
	private int activities_count;
	private List<Actor> actors_ids;
	private String affectVersion;
	private int attachments_count;
	private Backlog backlog;
	private int comments_count;
	private Creator creator;
	private String dateCreated;
	private String dependsOn;
	private String description;
	private String doneDate;
	private double effort;
	private String estimatedDate;
	private Feature feature;
	private List<Follower> followers_ids;
	private String frozenDate;
	private String inProgressDate;
	private String inReviewDate;
	private String lastUpdated;
	private String name;
	private String notes;
	private String origin;
	private Sprint parentSprint;
	private String plannedDate;
	private int rank;
	@JsonInclude(JsonInclude.Include.ALWAYS)
	@JsonProperty(required = true)
	private int state;
	@JsonProperty(required = true)
	private String suggestedDate;
	private int tasks_count;
	private String todoDate;
	private int type;
	private int uid;
	private int value;
	private int testState;
	private List<String> tags;
	private List<String> dependences;
	private int countDoneTasks;
	private Project project;
	private String commits_count;
	private int builds_count;
	private List<String> voters_ids;
	private String notes_html;

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

	public int getAcceptanceTests_count() {
		return acceptanceTests_count;
	}

	public void setAcceptanceTests_count(int acceptanceTests_count) {
		this.acceptanceTests_count = acceptanceTests_count;
	}

	public String getAcceptedDate() {
		return acceptedDate;
	}

	public void setAcceptedDate(String acceptedDate) {
		this.acceptedDate = acceptedDate;
	}

	public int getActivities_count() {
		return activities_count;
	}

	public void setActivities_count(int activities_count) {
		this.activities_count = activities_count;
	}

	public List<Actor> getActors_ids() {
		return actors_ids;
	}

	public void setActors_ids(List<Actor> actors_ids) {
		this.actors_ids = actors_ids;
	}

	public String getAffectVersion() {
		return affectVersion;
	}

	public void setAffectVersion(String affectVersion) {
		this.affectVersion = affectVersion;
	}

	public int getAttachments_count() {
		return attachments_count;
	}

	public void setAttachments_count(int attachments_count) {
		this.attachments_count = attachments_count;
	}

	public Backlog getBacklog() {
		return backlog;
	}

	public void setBacklog(Backlog backlog) {
		this.backlog = backlog;
	}

	public int getComments_count() {
		return comments_count;
	}

	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}

	public Creator getCreator() {
		return creator;
	}

	public void setCreator(Creator creator) {
		this.creator = creator;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDependsOn() {
		return dependsOn;
	}

	public void setDependsOn(String dependsOn) {
		this.dependsOn = dependsOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDoneDate() {
		return doneDate;
	}

	public void setDoneDate(String doneDate) {
		this.doneDate = doneDate;
	}

	public double getEffort() {
		return effort;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}

	public String getEstimatedDate() {
		return estimatedDate;
	}

	public void setEstimatedDate(String estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public List<Follower> getFollowers_ids() {
		return followers_ids;
	}

	public void setFollowers_ids(List<Follower> followers_ids) {
		this.followers_ids = followers_ids;
	}

	public String getFrozenDate() {
		return frozenDate;
	}

	public void setFrozenDate(String frozenDate) {
		this.frozenDate = frozenDate;
	}

	public String getInProgressDate() {
		return inProgressDate;
	}

	public void setInProgressDate(String inProgressDate) {
		this.inProgressDate = inProgressDate;
	}

	public String getInReviewDate() {
		return inReviewDate;
	}

	public void setInReviewDate(String inReviewDate) {
		this.inReviewDate = inReviewDate;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Sprint getParentSprint() {
		return parentSprint;
	}

	public void setParentSprint(Sprint parentSprint) {
		this.parentSprint = parentSprint;
	}

	public String getPlannedDate() {
		return plannedDate;
	}

	public void setPlannedDate(String plannedDate) {
		this.plannedDate = plannedDate;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getSuggestedDate() {
		return suggestedDate;
	}

	public void setSuggestedDate(String suggestedDate) {
		this.suggestedDate = suggestedDate;
	}

	public int getTasks_count() {
		return tasks_count;
	}

	public void setTasks_count(int tasks_count) {
		this.tasks_count = tasks_count;
	}

	public String getTodoDate() {
		return todoDate;
	}

	public void setTodoDate(String todoDate) {
		this.todoDate = todoDate;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getTestState() {
		return testState;
	}

	public void setTestState(int testState) {
		this.testState = testState;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<String> getDependences() {
		return dependences;
	}

	public void setDependences(List<String> dependences) {
		this.dependences = dependences;
	}

	public int getCountDoneTasks() {
		return countDoneTasks;
	}

	public void setCountDoneTasks(int countDoneTasks) {
		this.countDoneTasks = countDoneTasks;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getCommits_count() {
		return commits_count;
	}

	public void setCommits_count(String commits_count) {
		this.commits_count = commits_count;
	}

	public int getBuilds_count() {
		return builds_count;
	}

	public void setBuilds_count(int builds_count) {
		this.builds_count = builds_count;
	}

	public List<String> getVoters_ids() {
		return voters_ids;
	}

	public void setVoters_ids(List<String> voters_ids) {
		this.voters_ids = voters_ids;
	}

	public String getNotes_html() {
		return notes_html;
	}

	public void setNotes_html(String notes_html) {
		this.notes_html = notes_html;
	}

	@Override
	public String toString() {
		return "Story [className=" + className + ", id=" + id + ", acceptanceTests_count=" + acceptanceTests_count
				+ ", acceptedDate=" + acceptedDate + ", activities_count=" + activities_count + ", actors_ids="
				+ actors_ids + ", affectVersion=" + affectVersion + ", attachments_count=" + attachments_count
				+ ", backlog=" + backlog + ", comments_count=" + comments_count + ", creator=" + creator
				+ ", dateCreated=" + dateCreated + ", dependsOn=" + dependsOn + ", description=" + description
				+ ", doneDate=" + doneDate + ", effort=" + effort + ", estimatedDate=" + estimatedDate + ", feature="
				+ feature + ", followers_ids=" + followers_ids + ", frozenDate=" + frozenDate + ", inProgressDate="
				+ inProgressDate + ", inReviewDate=" + inReviewDate + ", lastUpdated=" + lastUpdated + ", name=" + name
				+ ", notes=" + notes + ", origin=" + origin + ", parentSprint=" + parentSprint + ", plannedDate="
				+ plannedDate + ", rank=" + rank + ", state=" + state + ", suggestedDate=" + suggestedDate
				+ ", tasks_count=" + tasks_count + ", todoDate=" + todoDate + ", type=" + type + ", uid=" + uid
				+ ", value=" + value + ", testState=" + testState + ", tags=" + tags + ", dependences=" + dependences
				+ ", countDoneTasks=" + countDoneTasks + ", project=" + project + ", commits_count=" + commits_count
				+ ", builds_count=" + builds_count + ", voters_ids=" + voters_ids + ", notes_html=" + notes_html + "]";
	}

}
