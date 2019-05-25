package com.cdac.hibernate.association.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		session= factory.openSession();
		
		tx= session.beginTransaction();
		
		Student s1 = new Student();
			s1.setStudentId(101);
			s1.setStudentName("palak");
			s1.setStudentEmail("plk@gmail.com");
			
		Student s2 = new Student();
			s2.setStudentId(102);
			s2.setStudentName("Roshan");
			s2.setStudentEmail("Roshan@gmail.com");
			
			Set<Student> list1 = new HashSet();
			list1.add(s1);
			list1.add(s2);
			
		Cource c1 = new Cource();
			c1.setCourceId(1);
			c1.setCourseName("CDAC");
			c1.setCourseDuration("6 month");
		
		Cource c2 = new Cource();
			c2.setCourceId(2);
			c2.setCourseName("DSD");
			c2.setCourseDuration(" 6 months");
			
			c1.setStudent(list1);
//			c2.setStudent(list1);
	
			session.save(c1);
			//session.save(c2);
			
			
		tx.commit();
		session.close();
		System.out.println(".....");
		
		
	}

}
