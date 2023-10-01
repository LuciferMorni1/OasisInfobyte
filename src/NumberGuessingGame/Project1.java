package NumberGuessingGame;
//--NUMBER GUESSING GAME--//

import java.util.Scanner;
import java.util.Random;

public class Project1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I chose a number between 1 and 100. Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempts + " try.");
                break;
            }
        }

        scanner.close();
    }
}
