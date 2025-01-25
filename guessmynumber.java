
import java.util.Random;
import java.util.Scanner;

public class guessmynumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guessedNumber = 0;

        System.out.println("Welcome to the Guess My Number game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (guessedNumber != numberToGuess) {
            System.out.print("Enter your guess: ");
            guessedNumber = scanner.nextInt();
            numberOfTries++;

            if (guessedNumber < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guessedNumber > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
