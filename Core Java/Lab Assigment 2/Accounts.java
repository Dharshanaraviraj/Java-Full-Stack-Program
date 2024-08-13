package Assigment;

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Balance: $" + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid funds for withdrawal.");
        }
    }                                                                                                        
}

class Bank {
    Account account;

    void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        account = new Account(accountNumber, accountHolderName, initialBalance);
        System.out.println("Account created: " + accountNumber);
    }

    void removeAccount() {
        if (account != null) {
            System.out.println("Account removed: " + account.accountNumber);
            account = null;
        } else {
            System.out.println("No account to remove.");
        }
    }

    void depositToAccount(double amount) {
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("No account available for deposit.");
        }
    }
    
    void withdrawFromAccount(double amount) {
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("No account available for withdrawal.");
        }
    }

    void displayAccount() {
        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("No account available.");
        }
    }
}

public class Accounts {
	public static void main(String[] args) {
		Bank bank = new Bank();

        bank.createAccount("12123456", "Dhachu", 1000.00);

        System.out.println("Account details:");
        bank.displayAccount();

        bank.depositToAccount(200.00);
        bank.withdrawFromAccount(150.00);

        System.out.println("Account details after transactions:");
        bank.displayAccount();
        bank.removeAccount();

        System.out.println("Account details after removal:");
        bank.displayAccount();

	}

}
