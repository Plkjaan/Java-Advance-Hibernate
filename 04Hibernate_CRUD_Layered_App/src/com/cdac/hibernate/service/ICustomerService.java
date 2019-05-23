package com.cdac.hibernate.service;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.cache.CacheException;

import com.cdac.hibernate.exception.CustomerException;
import com.cdac.hibernate.model.Customer;

public interface ICustomerService {

	
	public Customer getCustomerById(int custid ) throws CacheException;
	public Customer  addCustomer(Customer customer) throws CustomerException;
	public Customer updateCustomer(Customer customer ) throws CustomerException;
	public Customer  deleteCustomer(int custid) throws CustomerException;
	public List<Customer> listallCustomer() throws CustomerException;
	public Transaction beginTransaction() throws CustomerException;
	public void commitTx()  throws CustomerException;
	
}
