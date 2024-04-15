// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class Task1 {
   public Task1() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      System.out.println("Welcome to the Number Guessing Game!");
      int minNumber = 1;
      int maxNumber = 100;
      int attempts = 0;
      int maxAttempts = 10;
      int rounds = 0;
      int score = 0;

      while(true) {
         int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
         System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + minNumber + " and " + maxNumber);

         int userGuess;
         do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            ++attempts;
            if (userGuess == targetNumber) {
               System.out.println("Congratulations! You guessed the correct number!");
            } else if (userGuess < targetNumber) {
               System.out.println("Too low! Try again.");
            } else {
               System.out.println("Too high! Try again.");
            }

            if (attempts == maxAttempts) {
               System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
               break;
            }
         } while(userGuess != targetNumber);

         ++rounds;
         score += maxAttempts - attempts + 1;
         System.out.print("Do you want to play again? (yes/no): ");
         String playAgain = scanner.next().toLowerCase();
         if (!playAgain.equals("yes")) {
            System.out.println("\nGame Over! Your total score is: " + score);
            scanner.close();
            return;
         }

         attempts = 0;
      }
   }
}
