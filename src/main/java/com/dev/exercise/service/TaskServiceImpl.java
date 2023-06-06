package com.dev.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.exercise.model.Task;
import com.dev.exercise.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	@Override
	public List<Task> getAllTasks() {	
		return taskRepository.findAll();
	}
	
	@Override
	public List<Task> getTasksByOwner(Integer ownerId){
		return taskRepository.findByOwnerId(ownerId);
	}

	@Override
	public void saveNewTask(Task task) {
		taskRepository.save(task);
	}
	
}
