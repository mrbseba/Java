//Chapter 6, exe 23
/*
(Find the Minimum) Write a method minimum3 that returns the smallest of three floatingpoint numbers. Use the Math.min
method to implement minimum3. Incorporate the method into an
application that reads three values from the user, determines the smallest value and displays the result.
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        //obiectul pentru input
        Scanner input = new Scanner(System.in);
        float num1 = 0, num2 = 0, num3 = 0;
        Scanner sc = new Scanner(System.in);

        //Introducerea numerilor
        System.out.print("Input the first number: ");
        num1 = sc.nextFloat();

        System.out.print("Input the Second number: ");
        num2 = sc.nextFloat();

        System.out.print("Input the third number: ");
        num3 = sc.nextFloat();

        //Afisarea valorii minime
        System.out.print("The minimum value is " + minimum3(num1, num2, num3) + "\n");

    }

    //methoda minimum3 care calculeaza minimul
    public static float minimum3(float num1, float num2, float num3) {
        return Math.min(Math.min(num1, num2), num3);
    }
}




