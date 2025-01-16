package com.application.crm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.crm.dao.CustomerDao;
import com.application.crm.model.Customer;
import com.application.crm.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService 
{
	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> getCustomerList() {
		return (List<Customer>) customerDao.findAll();
	}

	@Override
	public void saveCustomer(Customer customer) 
	{
		customerDao.save(customer);		
	}

}
