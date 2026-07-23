# Bank System Demo

A comprehensive Java-based banking system that demonstrates object-oriented programming principles with multiple account types and transaction management.

## Features

- **Multiple Account Types**:
  - Basic Account
  - Saving Account (with interest rate calculation)
  - International Account (with transaction fees)
  - Platinum Saving Account
  - Gold Saving Account
  - Silver Saving Account
  - Current Account

- **Bank Management**:
  - Create and manage bank branches
  - Add and delete accounts
  - Track account details and balances

- **Transaction Operations**:
  - Deposit funds
  - Withdraw funds (with validation)
  - Balance inquiries
  - Interest rate calculations for saving accounts

## Project Structure

```
Bank/
├── src/                    # Source files
│   ├── Account.java        # Base account class
│   ├── Bank.java           # Bank management class
│   ├── Bank_System.java    # Main demonstration program
│   ├── saving_account.java # Saving account with interest
│   ├── international_account.java # International account with fees
│   ├── platinuam_saving_account.java
│   ├── Gold_saving_account.java
│   ├── silver_saving_account.java
│   ├── current_Account.java
│   └── transaction.java   # Transaction management
├── bin/                    # Compiled class files
└── README.md              # This file
```

## How to Run

1. **Compile the project**:
   ```bash
   javac src/*.java -d bin/
   ```

2. **Run the main program**:
   ```bash
   java -cp bin/ Bank_System
   ```

## Account Types Explained

### Basic Account
- Standard banking account
- Supports deposit and withdrawal operations
- Balance validation

### Saving Account
- Extends basic account
- Includes interest rate calculation
- Automatically calculates balance after interest application

### International Account
- Designed for international transactions
- Includes transaction fee (2.5% of balance)
- Fees applied during withdrawals

### Special Saving Accounts
- **Platinum Saving**: Premium saving account with higher interest rates
- **Gold Saving**: Gold-tier saving account
- **Silver Saving**: Silver-tier saving account

### Current Account
- Standard checking account
- Optimized for frequent transactions

## Example Output

When you run `Bank_System.java`, you'll see:
- Bank creation details
- Each account type creation with details
- Interest rate calculations
- Transaction demonstrations (deposits/withdrawals)
- Balance updates after each operation

## Requirements

- Java Development Kit (JDK) 8 or higher
- No external dependencies required

## Author

Created as a demonstration of object-oriented programming principles in Java.
