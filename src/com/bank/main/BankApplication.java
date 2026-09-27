package com.bank.main;
import java.util.Collection;

import com.bank.exception.AccountNotFoundException;

import com.bank.exception.CustomerNotFoundException;
import com.bank.exception.InsufficientBalanceException;
import com.bank.exception.InvalidAmountException;
import com.bank.exception.MinimumBalanceException;
import com.bank.model.Account;
import com.bank.model.AccountType;
import com.bank.model.Customer;
import com.bank.service.AccountService;
import com.bank.service.BankService;

public class BankApplication {

	private static void runBankOperations(AccountService as, Account acc1, Account acc3) 
	        throws AccountNotFoundException, InvalidAmountException,
	               InsufficientBalanceException {

	    as.deposit(acc1.getAccountNumber(), 500);
	    as.withdraw(acc1.getAccountNumber(), 200);

	    as.transfer(
	        acc1.getAccountNumber(),
	        acc3.getAccountNumber(),
	        300
	    );

	    System.out.println("Account 1 Balance: " + acc1.getBalance());
	    System.out.println("Account 3 Balance: " + acc3.getBalance());
	}
	
		public static void main(String[] args) {

		    BankService bs = new BankService();

		    Customer customer1 = new Customer(
		            "Rakesh", "rakesh@gmail.com", "9873846464");

		    Customer customer2 = new Customer(
		            "Arun", "arun@gmail.com", "94465845387");

		    Customer customer3 = new Customer(
		            "Priya", "priya@gmail.com", "9988776655");

		    bs.addCustomer(customer1);
		    bs.addCustomer(customer2);
		    bs.addCustomer(customer3);

		    AccountService as = new AccountService();

		  
		    try {
		    	
		    	 Account acc1 = as.openAccount(
				            customer1, 1000, AccountType.SAVINGS);

				    Account acc2 = as.openAccount(
				            customer2, 1000, AccountType.CURRENT);

				    Account acc3 = as.openAccount(
				            customer3, 3000, AccountType.SAVINGS);


		        Customer c1 = bs.findCustomer(customer1.getCustomerId());
		        Customer c2 = bs.findCustomer(customer2.getCustomerId());
		        Customer c3 = bs.findCustomer(customer3.getCustomerId());

		        System.out.println(c1.getName());
		        System.out.println(c2.getName());
		        System.out.println(c3.getName());

		        runBankOperations(as, acc1, acc3);

		        Collection<Account> accounts = as.getAllAccounts();

		        for (Account account : accounts) {
		            System.out.println("Account Number: "
		                    + account.getAccountNumber());
		            System.out.println("Customer: "
		                    + account.getCustomer().getName());
		            System.out.println("Balance: "
		                    + account.getBalance());
		            System.out.println("----------------------");
		        }

		    } catch (InsufficientBalanceException e) {
		        System.out.println(e.getMessage());

		    } catch (CustomerNotFoundException e) {
		        System.out.println(e.getMessage());

		    } catch (AccountNotFoundException e) {
		        System.out.println(e.getMessage());

		    } catch (InvalidAmountException e) {
		        System.out.println(e.getMessage());

		    } catch (MinimumBalanceException e) {
		        System.out.println(e.getMessage());
		    }
		
	}

}
	


