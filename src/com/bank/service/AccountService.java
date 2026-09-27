package com.bank.service;
import java.util.Collection;
import java.util.HashMap;

import com.bank.exception.AccountNotFoundException;
import com.bank.exception.InsufficientBalanceException;
import com.bank.exception.InvalidAmountException;
import com.bank.model.Account;
import com.bank.model.AccountType;
import com.bank.model.CurrentAccount;
import com.bank.model.Customer;
import com.bank.model.SavingsAccount;
public class AccountService {
	
	private HashMap<Long,Account> hm = new HashMap<>();
	

	public  Account openAccount(Customer customer,double balance, AccountType accountType) throws InvalidAmountException {
		
		if (balance <= 0) {
		    throw new InvalidAmountException(
		            "Opening balance must be greater than zero");
		}
		
		Account acc;
		if(accountType==AccountType.SAVINGS)
		 acc = new SavingsAccount(customer,balance);
		else if(accountType == AccountType.CURRENT)
			 acc = new CurrentAccount(customer,balance);	
		 else {
			    throw new IllegalArgumentException("Invalid account type");
			}
		long id = acc.getAccountNumber();
		hm.put(id, acc);
		return acc;
	}
	
	public Account findAccount(long accountNumber) throws AccountNotFoundException {
		
			Account account = hm.get(accountNumber);
			if(account != null) {
			return account;
			} else {
				throw new AccountNotFoundException("Account not found");
			}
	}
	
	public void deposit(long accno, double amount)
	        throws AccountNotFoundException, InvalidAmountException {

	    Account acc = hm.get(accno);

	    if (acc == null) {
	        throw new AccountNotFoundException(
	                "Account Not Found with account number : " + accno);
	    }

	    if (amount <= 0) {
	        throw new InvalidAmountException(
	                "Deposit amount must be greater than zero");
	    }

	    acc.deposit(amount);
	}
	
	public void withdraw(long accno, double amount) throws  InvalidAmountException,AccountNotFoundException,
	InsufficientBalanceException{
		Account acc = hm.get(accno);
		if(acc != null) {
			
			if(amount > 0) {
		if(amount <= acc.getBalance()) {
		  acc.withdraw(amount);
		} else {
			throw new InsufficientBalanceException("Insufficient balance please check balance");
		}
			}else {
				throw new InvalidAmountException("Withdrawal amount must be greater than zero");
			}
		}
		else {
			throw new AccountNotFoundException("Account not found");
		}
	}
	public void transfer(long sourceAccountNumber,
            long destinationAccountNumber,
            double amount)
            		throws AccountNotFoundException,
      InsufficientBalanceException,
      InvalidAmountException {

		if (sourceAccountNumber == destinationAccountNumber) {
			throw new IllegalArgumentException(
       "Source and destination accounts must be different");
		}

		Account acc2 = hm.get(destinationAccountNumber);

		if (acc2 == null) {
			throw new AccountNotFoundException("Account Not Found");
		}

		withdraw(sourceAccountNumber, amount);

		acc2.deposit(amount);
	}
	public Collection<Account> getAllAccounts(){
		
		return  hm.values();
	}
	
}
