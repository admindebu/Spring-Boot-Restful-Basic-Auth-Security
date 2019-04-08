package com.debu.techtalk.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debu.techtalk.app.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findByCustomerName(String customerName);
}
