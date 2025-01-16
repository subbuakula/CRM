package com.application.crm.service;

import java.util.List;

import com.application.crm.model.Customer;

public interface CustomerService {

	List<Customer> getCustomerList();
	void saveCustomer(Customer customer);

}
