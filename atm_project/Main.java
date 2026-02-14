package atm_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("disha", "1234");
        Account account = new Account();

        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (user.validate(id, pin)) {
            System.out.println("Login successful!");
            ATM atm = new ATM(account);
            atm.start();
        } else {
            System.out.println("Invalid User ID or PIN.");
        }

        sc.close();
    }
}
