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
		
		Person p1 = new Person();
			p1.setPersonid(1001);
			p1.setFirstName("Palak");
			p1.setLastName("Choudhary");
			
			session.save(p1);
			
		Customer c1 = new Customer();
			c1.setPersonid(1002);
			c1.setFirstName("Roshan");
			c1.setLastName("ingle");
			c1.setMobileNo("9874563210");
			
			session.save(c1);
			
		OnlineCustomer o1 = new OnlineCustomer();
			o1.setPersonid(1003);
			o1.setFirstName("piyu");
			o1.setLastName("pednekar");
			o1.setMobileNo("9632587410");
			o1.setEmail("piyu@gmail.com");
			
			session.save(o1);
			
		tx.commit();
		session.close();
		System.out.println("Added Successfully....");
	}

}
