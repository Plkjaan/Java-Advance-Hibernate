package com.cdac.hibernate.association.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PERSON_MANYTOMANY")
public class Person {
	@Id
	private Integer personId;
	
	private String firstName;
	private String lastName;
	
	@ManyToMany(cascade = {CascadeType.ALL},targetEntity=Account.class)
	@JoinTable(name="Refference_Table" , 
	joinColumns = { @JoinColumn(name="PersonId") },
	inverseJoinColumns = { @JoinColumn(name="accountId")})
	
	private List<Account> account;

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

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer personId, String firstName, String lastName, List<Account> account) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", account="
				+ account + "]";
	}
	
	
	

}
