import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain;
        int roundsWon = 0;
        
        do {
            
            int randomNumber = random.nextInt(100) + 1;
            int maxAttempts = 5;
            int attempts = 0;
            boolean guessedCorrectly = false;
            
            System.out.println("A new round has started! Guess the number between 1 and 100.");
            
            
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                
                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    roundsWon++;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                
                System.out.println("Attempts remaining: " + (maxAttempts - attempts));
            }
            
            if (!guessedCorrectly) {
                System.out.println("Sorry! You've used all attempts. The correct number was: " + randomNumber);
            }
            
            
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
            
        } while (playAgain);

       
        System.out.println("\n--- Game Over ---");
        System.out.println("Rounds Won: " + roundsWon);
        System.out.println("Thank you for playing!");

        scanner.close();
    }
}
