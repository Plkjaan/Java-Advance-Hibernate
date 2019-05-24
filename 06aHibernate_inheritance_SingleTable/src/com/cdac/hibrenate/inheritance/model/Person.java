package com.cdac.hibrenate.inheritance.model;

import javax.annotation.Generated;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="PERSON_TABLE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,name="Person_Type")
@DiscriminatorValue("pers")
public class Person {
@Id

	private Integer personeId;
	private String firstName;
	private String lastName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer personeId, String firstName, String lastName) {
		super();
		this.personeId = personeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getPersoneId() {
		return personeId;
	}
	public void setPersoneId(Integer personeId) {
		this.personeId = personeId;
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
		return "Person [personeId=" + personeId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
