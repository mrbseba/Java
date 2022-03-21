//Chapter 6, exe 26
/*
(Reversing Digits) Write a method that takes an integer value and returns the number with
its digits reversed. For example, given the number 7631, the method should return 1367.
Incorporate the method into an application that reads a value from the user and displays the result.
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        //obiectul pentru input
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce numar cu 4 digists: ");
        int entry = input.nextInt();
        int result = reverse(entry);
        System.out.println("Numarul inversat " + result);
    }

    public static int reverse(int n) {
        int result = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            result = result * 10 + rem;
        }
        return result;
    }
}




