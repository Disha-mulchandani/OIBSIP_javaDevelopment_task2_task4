package atm_project;

import java.util.Scanner;

public class ATM {
    private Account account;
    private Account secondAccount; // for transfer

    public ATM(Account account) {
        this.account = account;
        this.secondAccount = new Account(); // dummy account
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Transaction History");
            System.out.println("6. Quit");
            System.out.print("Choose option: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    if (!account.withdraw(sc.nextDouble())) {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 4:
                    System.out.print("Enter transfer amount: ");
                    if (account.transfer(secondAccount, sc.nextDouble())) {
                        System.out.println("Transfer successful.");
                    } else {
                        System.out.println("Transfer failed. Insufficient balance.");
                    }
                    break;

                case 5:
                    Transaction.showHistory();
                    break;

                case 6:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}
