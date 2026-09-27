# Bank Management System

A Core Java based Bank Management System developed to practice and demonstrate Object-Oriented Programming, Collections Framework, Exception Handling, and layered application design.

## Current Version

### V1.0 - Core Java + In-Memory Storage

The current version uses Java `HashMap` collections for storing customers and accounts in memory.

## Features

- Customer management
- Account creation
- Savings Account
- Current Account
- Deposit money
- Withdraw money
- Transfer money between accounts
- Find account
- Display all accounts
- Account number generation
- Custom exception handling
- Minimum balance validation
- Invalid amount validation
- Insufficient balance validation

## Technologies

- Java
- Object-Oriented Programming
- Collections Framework
- HashMap
- Exception Handling
- Custom Exceptions

## Project Structure

```text
src
└── com.bank
    ├── exception
    │   ├── AccountNotFoundException
    │   ├── CustomerNotFoundException
    │   ├── InsufficientBalanceException
    │   ├── InvalidAmountException
    │   └── MinimumBalanceException
    │
    ├── main
    │   └── BankApplication
    │
    ├── model
    │   ├── Account
    │   ├── AccountType
    │   ├── CurrentAccount
    │   ├── Customer
    │   └── SavingsAccount
    │
    ├── service
    │   ├── AccountService
    │   └── BankService
    │
    └── util
        ├── AccountNumberGenerator
        └── IdGenerator
