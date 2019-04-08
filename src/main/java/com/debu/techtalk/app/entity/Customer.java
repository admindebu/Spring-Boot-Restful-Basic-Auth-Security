package com.debu.techtalk.app.entity;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "CUSTOMER")
@ApiModel
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID")
	@ApiModelProperty(value = "Customer Id for uniqely identify")
	private Long customerId;

	@Column(name = "CUSTOMER_NAME")
	@ApiModelProperty(value = "Customer Name")
	private String customerName;

	@Enumerated(EnumType.STRING)
	@Column(name = "CUSTOMER_GENDER")
	@ApiModelProperty(value = "Customer Gender")
	private CustomerGender customerGender;

	public enum CustomerGender {
		MALE, FEMALE
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public CustomerGender getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(CustomerGender customerGender) {
		this.customerGender = customerGender;
	}

	public Customer(Long customerId, String customerName, CustomerGender customerGender) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerGender = customerGender;
	}

	public Customer() {
	}

	@Override
	public String toString() {
		return "TrainerEntity{" + "Id=" + customerId + ", customerName='" + customerName + '\'' + ", customerGender="
				+ customerGender + '}';
	}
	
}
