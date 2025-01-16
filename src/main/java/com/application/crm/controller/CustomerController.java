package com.application.crm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.application.crm.model.Customer;
import com.application.crm.service.CustomerService;


@Controller
public class CustomerController 
{
	private CustomerService service;
	
	//Constructor injection
	@Autowired
	public CustomerController(CustomerService service)
	{
		this.service=service;
	}
	
	@GetMapping("/cxlist")
	public String getCustomerList(Map<String, List<Customer>> model)
	{
		List<Customer> cxlist = service.getCustomerList();
	    model.put("customerList", cxlist);
	    cxlist.forEach(c->System.out.println(c));
		return "customerList";
		
	}
	
	@GetMapping("/showForm")
	public String showForm( Map<String,Object> model)
	{
		Customer c = new Customer();
		model.put("customer", c);	
		return "showForm";		
	}
	@PostMapping("/registerCustomer")
	public String registerCustomer(@ModelAttribute("customer") Customer customer, Model model)
	{
		model.addAttribute("customer", customer);
		 service.saveCustomer(customer);
		 return "redirect:/cxlist";
	}

}
