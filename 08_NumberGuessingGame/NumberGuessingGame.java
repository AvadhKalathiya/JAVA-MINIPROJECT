import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Random number between 1 and 100
        int secretNumber = rand.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        // Loop until correct guess
        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High! Try again.");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low! Try again.");
            }
            else {
                System.out.println("\n🎉 Correct Guess!");
                System.out.println("You guessed in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}