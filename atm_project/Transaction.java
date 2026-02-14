package atm_project;

import java.util.ArrayList;

public class Transaction {
    private static ArrayList<String> history = new ArrayList<>();

    public static void add(String record) {
        history.add(record);
    }

    public static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("----- Transaction History -----");
            for (String t : history) {
                System.out.println(t);
            }
        }
    }
}
