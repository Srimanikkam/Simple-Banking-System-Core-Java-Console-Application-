package com.bankmodel;

public class Customer {

	private long custAccountNumber;

	private String custPassword;

	public Customer(long custAccountNumber, String custPassword) {
		super();
		this.custAccountNumber = custAccountNumber;
		this.custPassword = custPassword;
	}

	public long getCustAccountNumber() {
		return custAccountNumber;
	}

	public void setCustAccountNumber(long custAccountNumber) {
		this.custAccountNumber = custAccountNumber;
	}

	public String getCustPassword() {
		return custPassword;
	}

	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}

	@Override
	public String toString() {
		return "Customer [custAccountNumber=" + custAccountNumber + ", custPassword=" + custPassword + "]";
	}

}
