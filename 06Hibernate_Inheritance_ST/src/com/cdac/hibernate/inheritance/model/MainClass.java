package com.cdac.hibernate.inheritance.model;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	private static SessionFactory factory;
	private static Session session;
	private static Transaction tx;
	private Query query;
	


	public static void main(String[] args) {
		
		
	
			factory = new  Configuration().configure().buildSessionFactory();
			session=factory.openSession();
		
			tx = session.beginTransaction();
			
				Employee employee = new Employee();
				employee.setEmpId(1004);
				employee.setEmpName("Palak");
				employee.setSalary(20000.00);
				
				
				Manager manager = new Manager();
				manager.setEmpId(1005);
				manager.setEmpName("Roshan");
				manager.setSalary(25000.00);
				manager.setBonus(2500.00);
					
					
				Manager m1 = new Manager();
				m1.setEmpId(1006);
				m1.setEmpName("Akshay");
				m1.setSalary(26000.00);
				m1.setBonus(2643.00);
	
				session.save(employee);
				session.save(manager);
				session.save(m1);
			tx.commit();
			
			session.close();
			
			System.out.println("Added Successfully....\n");
			
	}
	
}

