package com.cdac.hibernate.association.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	private static SessionFactory factory;
	private static Session session ;
	private static Transaction ts;
	
	
	public static void main(String[] args) {
		
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	ts = session.beginTransaction();
	
	Address address = new Address();
		address.setAddressId(101);
		address.setCity("Mumbai");
		address.setStreet("Gulmohar road");
		address.setState("maharashtra");
		address.setCountry("India");
			
	Employee e1 = new Employee();
		e1.setEmployeeId(1);
		e1.setFirstName("Palak");
		e1.setLastName("Choudhary");
		e1.setAddress(address);
	
		address.setEmployee(e1);
		
		session.save(e1);
		
	ts.commit();
	session.close();
	System.out.println("One TO One Relation Created .............");
	}

}
