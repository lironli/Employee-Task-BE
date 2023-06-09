package com.dev.exercise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.exercise.model.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

	List<Task> findByOwnerId(Integer ownerId);

}
