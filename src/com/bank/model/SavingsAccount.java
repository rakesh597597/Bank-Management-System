package com.bank.model;

public class SavingsAccount extends Account{

	public SavingsAccount(Customer customer,double balance) {
		super(customer,balance);
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
	}
}
