package com.cdac.employee.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import antlr.collections.List;

public class EmployeeMainAnno {

	public EmployeeMainAnno() {
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
			Employee employee1 = new Employee(102,"Roshan","Ingle","9405173253","Roshan@gmail.com","Mumbai", 25000.00);
			Employee employee = new Employee(103,"Piyu","Pednekar","9405173253","Piyu@gmail.com","Mumbai", 25000.00);
			//session.save(employee);
			//session.save(employee1);
			Employee employee3 = new Employee(104,"Roshan","Ingle","9405173253","Roshan@gmail.com","Mumbai", 25000.00);
		//step 5:commit transaction
			//tx.commit();
			//session.close();
			
			
		//
		
	//update 
		//open session
			//session = factory.openSession();
			//tx = session.beginTransaction();	
			
			Employee employee_a = (Employee) session.get(Employee.class, 103);
			//System.out.println("Customer found : "+employee);
			employee_a.setFirstname("ro");
			employee_a.setLastname("ingle");
			employee_a.setEmail("ro@g.com");
			
			
		//	Employee employee2up = (Employee) session.get(Employee.class, 101);
		//	employee2up.setFirstname("Ro");
			
			
			
			session.update(employee_a);
			tx.commit();
			
			Employee emplyupdate = (Employee) session.get(Employee.class, employee_a.getEmpId() );
			
	
/*		//delete
			System.out.println("Delete");
			tx= session.beginTransaction();
			session.delete(emplyupdate);
			tx.commit();
			session.close();
			System.out.println("Deleted suuccessfully");*/
			
		//fetch all data
			session = factory.openSession();
			tx = session.beginTransaction();
			
			Query query = session.createQuery("from Employee");
			java.util.List<Employee> employeeList = query.list();
			employeeList.forEach((emplobj)->System.out.println(emplobj));
			
			tx.commit();
		
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.prn);
			
		}
		

	}

}
