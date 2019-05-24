package com.cdac.hibernate.inheritance.model;

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
			person.setPersonId(1005);
			person.setFirstName("Palak");
			person.setLastName("choudhary");
			
			session.save(person);
			
		Customer c1 = new Customer();
			c1.setPersonId(1002);
			c1.setFirstName("Roshan");
			c1.setLastName("ingle");
			c1.setMobileNo("940523568");
			
			session.save(c1);
			
		OnlineCustomer oc1 = new OnlineCustomer();
			oc1.setPersonId(1003);
			oc1.setFirstName("Rahul");
			oc1.setLastName("Jadhav");
			oc1.setMobileNo("9874563210");
			oc1.setEmail("Rahul@gmail.com");
			
			session.save(oc1);
		
		
		tx.commit();
		session.close();
		System.out.println("added Successfully....");
	}

}
