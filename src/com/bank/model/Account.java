package com.bank.model;

import com.bank.util.AccountNumberGenerator;

public class Account {

	private long accountNumber;
	private Customer customer;
	private double balance;
	public Account(Customer customer,double balance) {
		this.accountNumber = AccountNumberGenerator.generateAccountNumber();
		this.customer = customer;
		this.balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public double getBalance() {
	return balance;
	}
	
	public void withdraw(double amount) {
		 balance-=amount;
	}
	
	public Customer getCustomer() {
	    return customer;
	}
	@Override
	public String toString() {
	    return "Account [accountNumber=" + accountNumber
	            + ", balance=" + balance + "]";
	}
}
