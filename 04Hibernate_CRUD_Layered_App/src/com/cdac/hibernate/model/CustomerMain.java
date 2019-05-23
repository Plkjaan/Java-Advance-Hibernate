package com.cdac.hibernate.model;

import java.util.List;

import com.cdac.hibernate.exception.CustomerException;
import com.cdac.hibernate.service.CustomerService;
import com.cdac.hibernate.service.ICustomerService;

public class CustomerMain {

	//prepwork1- declare object of service interface 
	private static ICustomerService customerService;
	
	static {
		customerService = new CustomerService();
	}

	public static void main(String[] args) throws CustomerException {
		
		System.out.println("\n ***********Adding the customer record ***********");
		Customer customer = new Customer(111, "palak", "9875", "plk@gmail.com");
		customerService.addCustomer(customer);
		
		System.out.println("\n ***********GEtting the customer record ***********");
		System.out.println("Customer found"+customerService.getCustomerById(customer.getCustid()));
		
		System.out.println("\n ***********Updating the customer record ***********");
		customer.setName("Roshan");
		System.out.println("Customer updater"+customerService.updateCustomer(customer));
		
		System.out.println("\n ***********Listing the customer record ***********");
		List<Customer> custlist = customerService.listallCustomer();
		custlist.forEach((customer1)->System.out.println(customer1));
		
		System.out.println("\n ***********Deleting the customer record ***********");
		System.out.println("Customer Deleted : "+customerService.deleteCustomer(customer.getCustid()));
	}

}
