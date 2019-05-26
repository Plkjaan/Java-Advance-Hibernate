package com.cdac.hibernate.hql.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	private static SessionFactory factory;
	private static Session session;
	private static Transaction tx;
	private static Query query;
	
	public static void main(String[] args) {
		
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		
			Employee e1 = new Employee(1, "Palak", "Choudhary", "978546321", "plk@gmail.com", 20000.00);
			Employee e2 = new Employee(2, "Roshan", "ingle", "9405173253", "Roshan@gmail.com", 25000.00);
			Employee e3 = new Employee(3, "Piyu", "Choudhary", "9970697588", "piyu@gmail.com", 52303.00);
			Employee e4 = new Employee(4, "Kamal", "Katare", "9970697508", "Kamal@gmail.com", 654123.00);
			Employee e5 = new Employee(5, "Pratiksha", "Bonde", "9632587410", "Prati@gmail.com", 3698.00);
			
			session.save(e1);
			session.save(e2);
			session.save(e3);
			session.save(e4);
			session.save(e5);
			
			tx.commit();
			
	//Query to get all records
			
			tx= session.beginTransaction();
			
			query = session.createQuery("from Employee");
			List list1 = query.list();
			list1.forEach((object)->System.out.println((object)));
			/*list1.add(e1);
			list1.add(e2);
			list1.add(e3);
			list1.add(e4);
			list1.add(e5);*/
			
			tx.commit();	
				
				
		
		session.close();
		System.out.println("HQl Query Completed!!!!!!!!");
	}

}
