package com.BeatCheck.repository;
import java.util.ArrayList;
import java.util.List;

import com.BeatCheck.model.*;

public class HibernateCustomerRepositoryImpl implements CustmerRepository 
{
	/* (non-Javadoc)
	 * @see com.BeatCheck.repository.CustmerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		List<Customer> customerList=new ArrayList<Customer>();
		Customer cust=new Customer();
		cust.setFirstname("Dhwaj");
		cust.setLastname("Verma");
		customerList.add(cust);
		return customerList;
	}
}
