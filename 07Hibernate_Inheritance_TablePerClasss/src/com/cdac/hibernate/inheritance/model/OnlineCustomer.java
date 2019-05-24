package com.cdac.hibernate.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OnCustomer_TablePerClass")
public class OnlineCustomer extends Customer {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "OnlineCustomer [email=" + email + "]";
	}
	
	
}
