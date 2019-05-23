package com.cdac.hibernate.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.CacheException;
import org.hibernate.cfg.Configuration;


import com.cdac.hibernate.exception.CustomerException;
import com.cdac.hibernate.model.Customer;

public class CustomerDao implements ICustomerDao {
	//prework-1
	private SessionFactory factory;
	private Session session;
	private Transaction tx;
	private Query query;
	//prepwork-2 : configure band build sessionfactory
	//prepwork - 3:session object
	
	
	public CustomerDao() {
			
			factory = new Configuration().configure().buildSessionFactory();
		
			session= factory.openSession();
			
			
		}
	@Override
	public Customer getCustomerById(int custid) throws CacheException {
		
		return  (Customer) session.get(Customer.class, custid)   ;
	}

	

	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		session.save(customer);
		return customer ;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		session.update(customer);
		
		return  customer;
	}

	@Override
	public Customer deleteCustomer(int custid) throws CustomerException {
		Customer customer = getCustomerById(custid);
		if(customer!=null) {
			session.delete(customer);
		}else {
			customer=null;
		}
		 
		return customer;
	}

	@Override
	public List<Customer> listallCustomer() throws CustomerException {
	
		return session.createQuery("from Customer").list();
		
	}

	public Transaction beginTransaction() throws CustomerException{
		tx= session.beginTransaction();
		
		return tx;
		
		
	}
	public void commitTx()  throws CustomerException{
		tx.commit();
	}
	

}
