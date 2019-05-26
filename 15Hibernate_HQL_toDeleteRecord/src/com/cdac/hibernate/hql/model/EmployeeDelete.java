package com.cdac.hibernate.hql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee_Delete")

public class EmployeeDelete {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public EmployeeDelete() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDelete(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
}

