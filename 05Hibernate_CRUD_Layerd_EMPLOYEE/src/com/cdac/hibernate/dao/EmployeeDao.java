package com.cdac.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cdac.hibernate.exception.EmployeeException;
import com.cdac.hibernate.model.Employee;

public class EmployeeDao implements IEmployeeDao {

	private SessionFactory factory;
	private Session session;
	private Transaction tx;
	private Query query;
	
	public EmployeeDao() {
		factory = new Configuration().configure().buildSessionFactory();
		session=factory.openSession();
	}
	
	
	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		session.save(employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		return (Employee) session.get(Employee.class, empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		session.update(employee);
		return employee;
	}

	@Override
	public Employee deleteEmployee(Integer empId) throws EmployeeException {
		Employee employee = getEmployeeById(empId);
		if(employee!=null) {
			session.delete(employee);
		}else {
			employee = null;
		}
		
		return employee;
	}

	@Override
	public List<Employee> listAllEmployee() throws EmployeeException {
		
		return session.createQuery("from Employee").list();
	}

	@Override
	public Transaction beginTransaction() throws EmployeeException {
		tx = session.beginTransaction();
		return tx;
	}

	@Override
	public void commitTx() throws EmployeeException {
		tx.commit();

	}

}
