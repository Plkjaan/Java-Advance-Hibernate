package com.cdac.hibernate.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PERSON_JOIN_COLUMN")
@Inheritance(strategy= InheritanceType.JOINED)
public class Person {
@Id
	private Integer personid;
	private String firstName;
	private String lastName;
	public Integer getPersonid() {
		return personid;
	}
	public void setPersonid(Integer personid) {
		this.personid = personid;
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
		return "Person [personid=" + personid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
