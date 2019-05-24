package com.cdac.hibrenate.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("onCust")
public class Onlinecustomer extends Customer {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Onlinecustomer [email=" + email + "]";
	}
	
	
	
}
