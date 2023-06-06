package com.dev.exercise.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "employees")
public class Employee{
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "first_name")
	@NotEmpty
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty
	private String lastName;
	
	@Column(name = "position")
	@NotEmpty
	private String position;
	
	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;
	
	@Column(name = "manager_name")
	@NotEmpty
	private String managerName;
	
//	@Column(name = "subordinates_ids")
//	@NotEmpty
//	private List<Integer> subordinatesIds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
//	public List<Integer> getSubordinatesIds() {
//		return this.subordinatesIds;
//	}
//
//	public void setSubordinatesIds(List<Integer> subordinatesIds) {
//		this.subordinatesIds = subordinatesIds;
//	}
	
}
