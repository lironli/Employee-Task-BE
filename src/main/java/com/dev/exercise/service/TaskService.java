package com.dev.exercise.service;

import java.util.List;

import com.dev.exercise.model.Task;

public interface TaskService {
	List<Task> getAllTasks();
	
	List<Task> getTasksByOwner(Integer ownerId);
	
	void saveNewTask(Task task);
}
