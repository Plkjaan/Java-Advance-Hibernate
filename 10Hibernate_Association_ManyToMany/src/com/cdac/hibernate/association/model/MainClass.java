package com.cdac.hibernate.association.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	private static SessionFactory factory;
	private static Session session;
	private static Transaction ts;
	
	public static void main(String[] args) {
		
		factory = new Configuration().configure().buildSessionFactory();
		session= factory.openSession();
		
		ts = session.beginTransaction();
		
		Account a1 = new Account();
			a1.setAccountId(10001);
			a1.setAccountName("sbi");
		
		Account a2 = new Account();
			a2.setAccountId(10002);
			a2.setAccountName("axis");
		
		Account a3 = new Account();
			a3.setAccountId(10003);
			a3.setAccountName("HDFC");
			
			
		ArrayList<Account> list1 = new  ArrayList<Account>();
			list1.add(a1);
			list1.add(a2);
			list1.add(a3);
			
			
		Person p1 = new Person();
			p1.setPersonId(1);
			p1.setFirstName("palak");
			p1.setLastName("choudhary");
			p1.setAccount(list1);
			
		
		Person p2 = new Person();
			p2.setPersonId(2);
			p2.setFirstName("Roshan");
			p2.setLastName("ingle");
			p1.setAccount(list1);
		
		Person p3 = new Person();
			p3.setPersonId(3);
			p3.setFirstName("Akshay");
			p3.setLastName("k");
			p3.setAccount(list1);
			
			
			
		session.save(p1);
		session.save(p2);
		session.save(p3);
		ts.commit();
		session.close();
	}

}
