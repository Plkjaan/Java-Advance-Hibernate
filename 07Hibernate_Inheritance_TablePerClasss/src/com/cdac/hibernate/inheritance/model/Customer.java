package com.cdac.hibernate.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Customer_TablePerClass")
public class Customer extends Person {

	private String mobileNo;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [mobileNo=" + mobileNo + "]";
	}
	
	
}
