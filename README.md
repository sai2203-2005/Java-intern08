# ATM Simulation System in Java

A console-based **ATM (Automated Teller Machine) Simulation Application** written in Java. This program simulates essential banking operations including secure PIN verification, account balance inquiry, and cash withdrawals.

---

## 🌟 Features

- **🔐 PIN Security & Verification**:
  - Requires user authentication via a 4-digit PIN (Default PIN: `1234`).
  - Limits incorrect attempts to a maximum of 3 before locking the account for security.

- **💵 Balance Inquiry**:
  - Displays current available account balance in Indian Rupees (₹).

- **💸 Cash Withdrawal**:
  - Validates withdrawal amounts against negative or zero entries.
  - Ensures sufficient balance before dispensing cash.
  - Automatically updates remaining balance upon successful withdrawal.

- **📋 Interactive Console Menu**:
  - Easy-to-use menu system loop allowing users to perform multiple transactions until they choose to exit.

---

## 🛠️ Prerequisites

To compile and run this application, ensure you have the following installed on your system:

- **Java Development Kit (JDK)** version 8 or higher
- Terminal / Command Prompt / PowerShell

Verify installation by running:
```bash
java -version
javac -version
```

---

## 🚀 Getting Started

### 1. Clone or Download
Ensure your workspace includes `ATM.java`.

### 2. Compile the Program
Open a terminal in the project directory and run:
```bash
javac ATM.java
```

### 3. Run the Application
Execute the compiled byte code:
```bash
java ATM
```

---

## 💻 Sample Usage Walkthrough

1. **PIN Prompt**:
   ```text
   Enter your PIN: 1234

   PIN verified successfully!
   ```

2. **ATM Menu**:
   ```text
   ========== ATM MENU ==========
   1. Check Balance
   2. Withdraw Money
   3. Exit
   ==============================
   Enter your choice: 1

   Current Balance: ₹10000.0
   ```

3. **Cash Withdrawal**:
   ```text
   Enter your choice: 2

   Enter withdrawal amount: ₹2500
   Please collect your cash.
   Withdrawn Amount: ₹2500.0
   Remaining Balance: ₹7500.0
   ```

---

## 📁 Project Structure

```text
java internship/
├── ATM.java       # Main Java source file containing ATM logic
├── ATM.class      # Compiled Java bytecode
└── README.md      # Project documentation
```

---

## 📝 Credentials & Defaults

- **Default PIN**: `1234`
- **Initial Balance**: `₹10,000.00`
- **Maximum PIN Attempts**: `3`
