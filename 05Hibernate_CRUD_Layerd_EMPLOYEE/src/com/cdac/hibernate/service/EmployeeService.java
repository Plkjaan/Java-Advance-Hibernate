package com.cdac.hibernate.service;

import java.util.List;

import org.hibernate.Transaction;

import com.cdac.hibernate.dao.EmployeeDao;
import com.cdac.hibernate.dao.IEmployeeDao;
import com.cdac.hibernate.exception.EmployeeException;
import com.cdac.hibernate.model.Employee;

public class EmployeeService implements IEmployeeService {

	private IEmployeeDao employeeDao;
	
	
	
	public EmployeeService() {
		
		employeeDao = new EmployeeDao();
		
	}

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		employeeDao.beginTransaction();
		Employee addEmployee = employeeDao.addEmployee(employee);		
		employeeDao.commitTx();
		return addEmployee;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {

		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		employeeDao.beginTransaction();
		Employee updateEmployee = employeeDao.updateEmployee(employee);
		employeeDao.commitTx();
		return updateEmployee;
	}

	@Override
	public Employee deleteEmployee(Integer empId) throws EmployeeException {
		employeeDao.beginTransaction();
		Employee deleteEmployee = employeeDao.deleteEmployee(empId);
		employeeDao.commitTx();
		return deleteEmployee;
	}

	@Override
	public List<Employee> listAllEmployee() throws EmployeeException {
			
		return employeeDao.listAllEmployee();
	}

	@Override
	public Transaction beginTransaction() throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commitTx() throws EmployeeException {
		// TODO Auto-generated method stub

	}

}
