import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        while (playAgain){
            int numberToGuess = random.nextInt(100)+1;
            int numberOfTries = 0;
            int guess = 0;
            boolean win = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("I have randomly chosen a number between 1 and 100.");
            System.out.println("Try to guess it!");

            while(!win){
                System.out.println("Enter your guess: ");
                if(scanner.hasNextInt()){
                    guess = scanner.nextInt();
                    numberOfTries++;

                    if(guess < 1 || guess > 100) {
                        System.out.println("Your guess is out of range. Please try again.");
                    }
                    else if (guess < numberToGuess){
                        System.out.println("Your guess is too low.");
                    }
                    else if (guess > numberToGuess){
                        System.out.println("Your guess is too high.");
                    }
                    else{
                        win = true;
                        System.out.println("Congratulations! You guessed the number in " + numberOfTries);
                    }
                }
                else{
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            }
            System.out.println("Do you want to play again? (Enter yes/no)");
            String response = scanner.next().toLowerCase();
            if(!response.equals("yes")){
                playAgain = false;
                System.out.println("Thank you for playing. Goodbye!");
            }
        }
        scanner.close();
    }
}
