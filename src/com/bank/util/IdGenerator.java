package com.bank.util;

public class IdGenerator {
	private static int counterId = 1000;

	public static int generateCustomerId() {
		counterId= counterId + 1;
		return counterId;
	}
}
