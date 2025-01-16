package com.application.crm.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.crm.model.Customer;
@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {

}
