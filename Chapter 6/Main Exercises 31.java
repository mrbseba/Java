//Chapter 6, exe 31
/*
(Guess the Number Modification) Modify the program of Exercise 6.30 to count the number of guesses the player makes.
If the number is 10 or fewer, display Either you know the secret or you got lucky! If the player guesses the number in 10 tries, display
If the player makes more than 10 guesses, display You should be able to do better! Why should it take no more than 10 guesses?
Well, with each “good guess,” the player should be able to eliminate half of the numbers, then half of the remaining numbers, and so on.
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
        int numberOfTries = 0, guess = 0, tests = 0;
        boolean win = false;

        while (win == false) {

            System.out.println("Guess a number between 1 and 1000: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
                tests++;
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
                tests++;
            }
        }
        System.out.println("You win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries ");
        if(tests < 10){
            System.out.println("Either you know the secret or you got lucky!");
        }
        else if(tests == 10){
            System.out.println("Aha! You know the secret!");
        }else {
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses?\n" +
                    "Well, with each “good guess,” the player should be able to eliminate half of the numbers, " +
                    "then half of the remaining numbers, and so on.");
        }

    }
}





