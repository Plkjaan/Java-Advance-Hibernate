package com.cdac.hibernate.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Person_TablePerClass")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Person {
@Id
	private Integer personId;
	private String firstName;
	private String lastName;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
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
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	
	
}
