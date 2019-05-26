package com.cdac.hibernate.hql.model;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainClass {

	private static SessionFactory factory;
	private static Session session;
	private static Transaction tx;
	private static Query  query;
	
	public static void main(String[] args) {
		
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		
		tx = session.beginTransaction();
		
		EmployeePagination e1 = new EmployeePagination("palak", "Choudhary", "9970697502");
		EmployeePagination e2 = new EmployeePagination("Roshan", "Ingle", "9405173253");
		EmployeePagination e3 = new EmployeePagination("Prati", "Bonde", "7030182747");
		EmployeePagination e4 = new EmployeePagination("Rana", "Chaokhande","9874563210");
		EmployeePagination e5 = new EmployeePagination("piyu", "Choudhary", "9970697588");
		
				session.save(e1);
				session.save(e2);
				session.save(e3);
				session.save(e4);
				session.save(e5);
				
		query = session.createQuery("from EmployeePagination");
		query.setFirstResult(2);
		query.setMaxResults(4);
		List list1 = query.list();
		list1.forEach((object)->System.out.println((object)));
		
		
		
				
		
		tx.commit();
		session.close();
System.out.println("!!!!!!!!!!!");
	}

}
