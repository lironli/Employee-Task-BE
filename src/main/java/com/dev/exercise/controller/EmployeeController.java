package com.dev.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.exercise.model.Employee;
import com.dev.exercise.model.Task;
import com.dev.exercise.service.EmployeeService;
import com.dev.exercise.service.TaskService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/tasks")
	public List<Task> getAlltasks() {
		return taskService.getAllTasks();
	}
	
	@GetMapping("/task-by-owner/{ownerId}")
	public List<Task> getTasksByOwner(@PathVariable("ownerId") Integer ownerId) {
		return taskService.getTasksByOwner(ownerId);
	}
	
	@PostMapping("/new-task")
	public void newTask(@RequestBody Task newTask) {
		taskService.saveNewTask(newTask);
	}

}
