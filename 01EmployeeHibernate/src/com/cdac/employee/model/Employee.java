package com.cdac.employee.model;

public class Employee {

	private int empId;
	private String firstname;
	private String lastname;
	private String mobileno;
	private String email;
	private String address;
	private double salary;
		
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String firstname, String lastname, String mobileno, String email, String address,
			double salary) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobileno = mobileno;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", mobileno="
				+ mobileno + ", email=" + email + ", address=" + address + ", salary=" + salary + "]";
	}

	
	
}
