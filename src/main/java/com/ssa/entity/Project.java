package com.ssa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="description")
	private String description;
	@Column(name="active")
	private int active;
	@Column(name="priority")
	private int priority;
	@Column(name="start_date")
	private Date start_date;
	@Column(name="deadline")
	private Date deadline;
	@Column(name="phase")
	private String phase;
	
	
	public Project() {
		super();
	}
	public Project(String description, int active, int priority, Date start_date, Date deadline, String phase) {
		super();
		this.description = description;
		this.active = active;
		this.priority = priority;
		this.start_date = start_date;
		this.deadline = deadline;
		this.phase = phase;
	}
	public Project(int id, String description, int active, int priority, Date start_date, Date deadline, String phase) {
		super();
		this.id = id;
		this.description = description;
		this.active = active;
		this.priority = priority;
		this.start_date = start_date;
		this.deadline = deadline;
		this.phase = phase;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getPhase() {
		return phase;
	}
	public void setPhase(String phase) {
		this.phase = phase;
	}
	
	
	

}
