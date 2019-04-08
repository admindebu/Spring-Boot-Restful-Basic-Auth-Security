package com.debu.techtalk.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.debu.techtalk.app.entity.Customer;
import com.debu.techtalk.app.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "user", description = "Rest API for user operations", tags = "User API")
public class CustomerController {

	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PostMapping(value = "/api/customer", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {

		return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.OK);

	}

	@PostMapping(value = "/customers", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<List<Customer>> saveCustomers(@RequestBody List<Customer> customers) {

		return new ResponseEntity<>(customerService.saveCustomers(customers), HttpStatus.OK);

	}

	@PutMapping(value = "/customer", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {

		return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.OK);

	}

	@GetMapping(value = "/customer")
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<List<Customer>> findAllCustomers() {

		return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);

	}
	

	@GetMapping(value = "/customer/{customerId}")
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<Optional<Customer>> findCustomerById(@PathVariable Long customerId) {

		return new ResponseEntity<>(customerService.getCustomer(customerId), HttpStatus.OK);

	}

	@GetMapping(value = "/customer/byName")
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<List<Customer>> findCustomerById(@RequestParam String customerName) {

		return new ResponseEntity<>(customerService.getCustomer(customerName), HttpStatus.OK);

	}

	@DeleteMapping(value = "/customer/{customerId}")
	   @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "OK"),
	            @ApiResponse(code = 401, message = "You are not authorized access the resource"),
	            @ApiResponse(code = 404, message = "The resource not found")
	    })
	public ResponseEntity<Object> deleteCustomer(@PathVariable Long customerId) {

		return new ResponseEntity<>(customerService.deleteCustomer(customerId), HttpStatus.OK);

	}

}
