package com.cdac.employee.model;

//import java.sql.Exception;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMainXml {

	public EmployeeMainXml() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

		
		try {
			//step 1:create session
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//step 2:get the session object
			Session session = factory.openSession();
		//step 3: begin transaction
			Transaction tx = session.beginTransaction();
		//step 4: perform insert/create 
			Employee employee = new Employee(101,"Palak","Choudhary","9970697502","plk@gmail.com","Mumbai", 20000.00);
			session.save(employee);
		//step 5:commit transaction
			tx.commit();
			session.close();
			factory.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.prn);
			
		}
	}

}
