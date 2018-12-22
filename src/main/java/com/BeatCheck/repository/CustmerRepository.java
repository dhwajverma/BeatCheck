package com.BeatCheck.repository;

import java.util.List;

import com.BeatCheck.model.Customer;

public interface CustmerRepository {

	List<Customer> findAll();

}