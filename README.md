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
## Application Flow

```text
BankApplication
       ↓
Service Layer
       ↓
HashMap
       ↓
In-Memory Data

##Account Types
Savings Account

Supports normal deposit and withdrawal operations.

Current Account

Maintains a minimum balance requirement of ₹1000.

##Exception Handling

The application uses custom exceptions to handle common banking errors:

Account not found
Customer not found
Invalid amount
Insufficient balance
Minimum balance violation
Project Evolution

This project is being developed incrementally.

##V1.0 - Core Java + HashMap
OOP
Collections
Custom Exceptions
Customer Management
Account Management
Deposit
Withdrawal
Transfer
V2.0 - JDBC

##Planned upgrade:

JDBC
Database connectivity
Repository layer
SQL operations
V3.0 - JDBC + MySQL

##Planned upgrade:

MySQL database
Persistent customer data
Persistent account data
Database transactions
Learning Objective

The project is being developed incrementally to understand how a Java application evolves from an in-memory Core Java application into a database-backed application.

##Future Enhancements
JDBC integration
MySQL database
Transaction management
Persistent customer and account data
