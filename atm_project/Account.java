package atm_project;

public class Account {
    private double balance = 1000.0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        Transaction.add("Deposited: ₹" + amount);
        System.out.println("Deposit successful.");
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            Transaction.add("Withdrawn: ₹" + amount);
            System.out.println("Withdrawal successful.");
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(Account toAccount, double amount) {
        if (amount <= balance) {
            balance -= amount;
            toAccount.balance += amount;
            Transaction.add("Transferred ₹" + amount + " to another account");
            return true;
        }
        return false;
    }
}
