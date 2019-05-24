package com.cdac.hibrenate.inheritance.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	private static SessionFactory factory;
	private static Session session;
	private static Transaction tx;
	
	
	public static void main(String[] args) {
		
	factory = new Configuration().configure().buildSessionFactory();
	session = factory.openSession();
	
	tx = session.beginTransaction();
		
	Person person = new Person();
		person.setPersoneId(1001);
		person.setFirstName("Palak");
		person.setLastName("Choudhary");
		
		session.save(person);
		
	Customer customer = new Customer();
		customer.setPersoneId(1002);
		customer.setFirstName("Roshan");
		customer.setLastName("Ingle");
		customer.setMobileNo("9405173253");
		
		session.save(customer);
		
	Onlinecustomer onlineCustomer = new Onlinecustomer();
		onlineCustomer.setPersoneId(1003);
		onlineCustomer.setFirstName("Pratiksha");
		onlineCustomer.setLastName("Bonde");
		onlineCustomer.setMobileNo("7030182747");
		onlineCustomer.setEmail("pratiksha@gmail.com");
		
		session.save(onlineCustomer);
		
	tx.commit();
	session.close();
	System.out.println("Added Suuccessfully....");
		

	}

}
