package com.bank.model;

import com.bank.exception.MinimumBalanceException;

public class CurrentAccount extends Account {

	private  final double minBalance = 1000;
	public  CurrentAccount(Customer customer,double balance) {
		super(customer,balance);
		if(balance<minBalance) {
			throw new MinimumBalanceException("Current account requires minimum balance of 1000");
		}
	}
	
	@Override
	public void withdraw(double amount)throws MinimumBalanceException {
		
		double bal= super.getBalance();
		double finalAmount = bal - amount;
		if(finalAmount >= minBalance ) {
			super.withdraw(amount);
		}else {
			throw new MinimumBalanceException("Withdrawal would violate the minimum balance requirement");
		}
	}
}
