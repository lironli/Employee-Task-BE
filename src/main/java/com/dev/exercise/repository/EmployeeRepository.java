package com.dev.exercise.repository;

import org.springframework.stereotype.Repository;

import com.dev.exercise.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
