import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;

        System.out.println("Welcome to the Number Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while(!win){
            System.out.println("Enter your guess: ");
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
                System.out.println("Congratulations! You guess guessed the number in " + numberOfTries);
            }
        }
    }
}
