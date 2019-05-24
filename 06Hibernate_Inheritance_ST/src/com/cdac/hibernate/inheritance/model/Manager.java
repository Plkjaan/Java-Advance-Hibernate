package com.cdac.hibernate.inheritance.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mng")
public class Manager extends Employee {

	private double bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
	
	
	
	
}
