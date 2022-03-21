//Chapter 6, exe 30
/*
(Guess the Number) Write an application that plays “guess the number” as follows: Your program chooses the number to be
guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first guess. If the player's
guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the user for the next guess.
When the user enters the correct answer, display Congratulations. You guessed the number!, and allow the user to choose
whether to play again. [Note: The guessing technique employed in this problem is similar to a binary search, which is
discussed in Chapter 19, Searching, Sorting and Big O.
* */
package second_try;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        //Obiectele externe
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //Variabelele
        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a number between 1 and 1000: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            }
        }

        System.out.println("You win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries ");
    }
}





