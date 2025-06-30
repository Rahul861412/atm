# bank
# 🏦 ATM Console Application (Java)

A simple Java-based ATM system that allows users to:
- Deposit funds
- Withdraw funds
- Check balance
- View transaction history

All operations are handled via a command-line interface using Java collections and conditionals.

---

## 🚀 Features

- ✅ Deposit money  
- ✅ Withdraw money with insufficient funds check  
- ✅ Check current balance  
- ✅ View transaction history  
- ✅ Console-based menu system

---

## 💻 Technologies Used

- Java `ArrayList` for transaction history
- Java `Scanner` for user input
- Basic OOP principles (class, methods, object)

---

## 📁 Project Structure

ATM/
│
├── account.java # Main class containing all functionalities
├── README.md # This file

---

## 🧑‍💻 How to Run

1. **Clone the repository** (if you have uploaded to GitHub):

   git clone https://github.com/yourusername/ATM.git
   cd ATM
Compile the Java file:

javac account.java

Run the program:
java account

📝 Sample Output

1. deposit
2. withdraw
3. balance
4. transaction history
5. exit
enter your choice: 1
enter the amount to be deposited: 500
amount deposited successfully: 500

1. deposit
2. withdraw
3. balance
4. transaction history
5. exit
enter your choice: 3
Current balance: 500
📊 Example Transaction History


--- Transaction History ---
Deposited: 500 | Balance: 500
Withdrew: 200 | Balance: 300
Failed Withdraw: 500 | Balance: 300
📌 Notes
Transaction history is stored in-memory and is not persisted after program exit.


