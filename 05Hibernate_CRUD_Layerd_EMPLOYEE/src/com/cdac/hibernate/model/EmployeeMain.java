package com.cdac.hibernate.model;

import java.util.List;

import com.cdac.hibernate.exception.EmployeeException;
import com.cdac.hibernate.service.EmployeeService;
import com.cdac.hibernate.service.IEmployeeService;

public class EmployeeMain {

	private static IEmployeeService employeeService;
	
	
	static {
		employeeService = new EmployeeService();
	}
	
	
	public static void main(String[] args) throws EmployeeException {
		
		System.out.println("**************Adding Employee************");
		Employee employee = new Employee(1001, "Palak","plk@gmail.com" , "9970");
			employeeService.addEmployee(employee);
		
			
		System.out.println("**************Retrive Employee************");
			System.out.println("Added employee is "+employeeService.getEmployeeById(employee.getEmpId()));
		
			
		System.out.println("**************Update Employee************");
			employee.setEmpName("Roshan");
			employeeService.updateEmployee(employee);
			System.out.println("Employee updated successfully...");
			
			
		System.out.println("**************Delete Employee************");
			employeeService.deleteEmployee(employee.getEmpId());
			
			
		System.out.println("**************List of Employee************");
			List<Employee> empl = employeeService.listAllEmployee();
			empl.forEach((employee1)->System.out.println(employee1));
			
	}

}
