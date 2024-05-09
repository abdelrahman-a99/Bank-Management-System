# Bank Account Management System

This project is a simple Java implementation of a bank account management system. It consists of three classes: `BankAccount`, `CheckingAccount`, and `SavingsAccount`, along with a `TransactionsDriver` class to demonstrate their usage.

## Table of Contents

- [Bank Account Management System](#bank-account-management-system)
  - [Table of Contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Classes](#classes)
    - [BankAccount](#bankaccount)
    - [CheckingAccount](#checkingaccount)
    - [SavingsAccount](#savingsaccount)
    - [TransactionsDriver](#transactionsdriver)
  - [Usage](#usage)
  - [Contributing](#contributing)
  - [License](#license)

## Introduction

The project aims to provide a basic framework for managing bank accounts, including depositing, withdrawing, transferring money between accounts, applying fees for excessive transactions, and calculating compound interest for savings accounts.

## Classes

### BankAccount

The `BankAccount` class serves as the base class for both checking and savings accounts. It includes methods for setting and retrieving the account balance, depositing and withdrawing funds, transferring money between accounts, and displaying the account balance.

### CheckingAccount

The `CheckingAccount` class extends `BankAccount` and adds functionality specific to checking accounts, such as tracking the number of transactions and applying fees for exceeding the allowed transaction limit.

### SavingsAccount

The `SavingsAccount` class also extends `BankAccount` and introduces features unique to savings accounts, such as setting and retrieving the interest rate and calculating compound interest.

### TransactionsDriver

The `TransactionsDriver` class contains the `main` method to demonstrate the usage of the bank account classes. It creates instances of `SavingsAccount` and `CheckingAccount`, performs various transactions, and displays the account balances at the end of the period.

## Usage

To use this project:

1. Clone the repository to your local machine.
2. Compile the Java files using a Java compiler (`javac`).
3. Run the `TransactionsDriver` class to see the demonstration of bank account transactions.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or create a pull request on GitHub.

## License

This project is licensed under the [MIT License](LICENSE).
