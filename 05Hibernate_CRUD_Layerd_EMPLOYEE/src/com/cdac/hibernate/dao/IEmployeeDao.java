package com.cdac.hibernate.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.cdac.hibernate.exception.EmployeeException;
import com.cdac.hibernate.model.Employee;

public interface IEmployeeDao {

	
	public Employee addEmployee(Employee employee) throws EmployeeException;
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	public Employee updateEmployee(Employee employee)throws EmployeeException;
	public Employee deleteEmployee(Integer empId) throws EmployeeException;
	public List<Employee> listAllEmployee() throws EmployeeException;
	public Transaction beginTransaction() throws EmployeeException;
	public void commitTx() throws EmployeeException;
	
}
