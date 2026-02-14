package guess_game;

import java.util.Random;
import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        char playAgain;

        System.out.println("===== GUESS THE NUMBER GAME =====");

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean guessed = false;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    score += (attempts + 1) * 10;
                    guessed = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

                System.out.println("Attempts left: " + attempts);
            }

            if (!guessed) {
                System.out.println("Attempts over!");
                System.out.println("The correct number was: " + number);
            }

            System.out.println("Current Score: " + score);
            System.out.print("Play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Game Over!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
