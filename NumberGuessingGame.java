import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess, attempts = 0;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess)
                System.out.println("Too low! Try again.");
            else if (guess > numberToGuess)
                System.out.println("Too high! Try again.");
            else
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
        } while (guess != numberToGuess);

        sc.close();
    }
}
