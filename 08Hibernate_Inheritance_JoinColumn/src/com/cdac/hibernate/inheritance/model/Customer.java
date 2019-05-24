package com.cdac.hibernate.inheritance.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_JOIN_TABLE")
@PrimaryKeyJoinColumn(name="Id")
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
