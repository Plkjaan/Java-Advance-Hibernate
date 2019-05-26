package com.cdac.hibernate.hql.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	private static SessionFactory factory;
	private static Session session;
	private static  Transaction tx;
	private static Query query;
	
	public static void main(String[] args) {
	
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		
		EmployeeDelete e1 = new EmployeeDelete("Palak", "Choudhary");
		EmployeeDelete e2 = new EmployeeDelete("Roshan", "ingle");
		EmployeeDelete e3 = new EmployeeDelete("piyu", "Choudhary");
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		query = session.createQuery("delete from EmployeeDelete where firstName='palak'");
		
		query.executeUpdate();
		
		
		tx.commit();
		session.close();
		System.out.println("Update Query is deleted successfully...........");

	}

}
