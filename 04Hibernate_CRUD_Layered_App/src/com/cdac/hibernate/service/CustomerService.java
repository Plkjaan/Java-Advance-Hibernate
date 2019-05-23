package com.cdac.hibernate.service;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.cache.CacheException;

import com.cdac.hibernate.Dao.CustomerDao;
import com.cdac.hibernate.Dao.ICustomerDao;
import com.cdac.hibernate.exception.CustomerException;
import com.cdac.hibernate.model.Customer;

public class CustomerService implements ICustomerService {
//prepwork1- declare IcustomerDao object
	
	private ICustomerDao customerDao;
	


	
	public CustomerService() {
//prepwork2 :create the object obj dao		
		customerDao = new CustomerDao();
		
	}

	@Override
	public Customer getCustomerById(int custid) throws CacheException {
		
		return customerDao.getCustomerById(custid);
	}

	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		customerDao.beginTransaction();
		Customer addedCustomer = customerDao.addCustomer(customer);
		customerDao.commitTx();
		return addedCustomer;
	}

	public Customer updateCustomer(Customer customer) throws CustomerException {
		
		customerDao.beginTransaction();
		Customer updateCustomer = customerDao.updateCustomer(customer);
		customerDao.commitTx();
		
		return updateCustomer;
	}

	@Override
	public Customer deleteCustomer(int custid) throws CustomerException {
		customerDao.beginTransaction();
		Customer deleteCustomer = customerDao.deleteCustomer(custid);
		customerDao.commitTx();
		return deleteCustomer;
	}

	@Override
	public List<Customer> listallCustomer() throws CustomerException {
		
		
		return customerDao.listallCustomer();
	}

	@Override
	public Transaction beginTransaction() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void commitTx() throws CustomerException {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public Transaction beginTransaction() throws CustomerException {
		
		return ;
	}

	@Override
	public void commitTx() throws CustomerException {
		// TODO Auto-generated method stub

	}*/

}
