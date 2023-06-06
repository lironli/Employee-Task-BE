package com.dev.exercise.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "tasks")
public class Task{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "owner_id")
	@NotEmpty
	private Integer ownerId;
	
	@Column(name = "task_text")
	@NotEmpty
	private String taskText;
	
	@Column(name = "assign_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate assignDate;
	
	@Column(name = "due_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dueDate;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	
	public String gettaskText() {
		return taskText;
	}

	public void setTaskText(String taskText) {
		this.taskText = taskText;
	}
	
	public LocalDate getAssignDate() {
		return this.assignDate;
	}
	
	public void setAassignDate(LocalDate assignDate) {
		this.assignDate = assignDate;
	}

	public LocalDate getDueDate() {
		return this.dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
}
