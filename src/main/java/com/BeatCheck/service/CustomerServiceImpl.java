package com.BeatCheck.service;

import com.BeatCheck.repository.*;

import java.util.List;

import com.BeatCheck.model.*;

public class CustomerServiceImpl implements CustomerService 
{
	private CustmerRepository customerRepo=new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.BeatCheck.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		return customerRepo.findAll();
	}
}
