package com.bank.service;

import java.util.HashMap;

import com.bank.exception.CustomerNotFoundException;
import com.bank.model.Customer;


public class BankService {

private	HashMap<Integer,Customer> customers = new  HashMap<>();

public void addCustomer(Customer customer) {
	int id = customer.getCustomerId();
	customers.put(id, customer);
	System.out.println("Customer Added Successfully!");
}
public Customer findCustomer(int customerId)throws CustomerNotFoundException {
	
	    Customer c = customers.get(customerId);
		if(c != null) {
		return c;
		} else {
			throw new CustomerNotFoundException("User not found with ID : " + customerId);
		}	
}

}
