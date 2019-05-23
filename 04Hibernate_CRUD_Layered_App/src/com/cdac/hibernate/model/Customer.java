package com.cdac.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_TABLE")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custid;

	private String name;
	private String mobileno;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer custid, String name, String mobileno, String email) {
		super();
		this.custid = custid;
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
	}
	public Integer getCustid() {
		return custid;
	}
	public void setCustid(Integer custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", mobileno=" + mobileno + ", email=" + email + "]";
	}
	
	}
