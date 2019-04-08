package com.debu.techtalk.app.service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.debu.techtalk.app.entity.Customer;
import com.debu.techtalk.app.repository.CustomerRepository;
import com.debu.techtalk.app.util.JacksonUtils;

@Service
public class CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer saveCustomer(Customer customer) {

		if (logger.isInfoEnabled()) {
			logger.info(" save customer with details {}", JacksonUtils.toJson(customer));
		}
		return customerRepository.save(customer);
	}

	public List<Customer> saveCustomers(List<Customer> customers) {

		if (logger.isInfoEnabled()) {
			logger.info(" save customers with details {}", JacksonUtils.toJson(customers));
		}
		return customerRepository.saveAll(customers);
	}

	public Optional<Customer> getCustomer(Long customerId) {

		if (logger.isInfoEnabled()) {
			logger.info(" get  customer with customerid {}", customerId);
		}
		return customerRepository.findById(customerId);

	}

	public List<Customer> getCustomer(String customerName) {

		if (logger.isInfoEnabled()) {
			logger.info(" get  customer with customerName {}", customerName);
		}
		return customerRepository.findByCustomerName(customerName);

	}

	public Object deleteCustomer(Long customerId) {

		customerRepository.deleteById(customerId);
		return customerId;
	}

	public List<Customer> getCustomers() {

		if (logger.isInfoEnabled()) {
			logger.info(" get all the customers");
		}

		return customerRepository.findAll();
	}

}
