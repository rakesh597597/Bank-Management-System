package com.bank.util;

public class AccountNumberGenerator {

	private static long counter = 1000000000L;
	
	public static long generateAccountNumber() {
		counter +=1;
		return counter;
	}
}