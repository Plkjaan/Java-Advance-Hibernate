package com.cdac.hibernate.Dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.cache.CacheException;

import com.cdac.hibernate.exception.CustomerException;
import com.cdac.hibernate.model.Customer;

public interface ICustomerDao {

	public Customer  addCustomer(Customer customer) throws CustomerException;
	public Customer getCustomerById(int custid ) throws CacheException;
	
	public Customer updateCustomer(Customer customer ) throws CustomerException;
	public Customer  deleteCustomer(int custid) throws CustomerException;
	public List<Customer> listallCustomer() throws CustomerException;
	public Transaction beginTransaction() throws CustomerException;
	public void commitTx()  throws CustomerException;
	
	
}
