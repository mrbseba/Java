//Chapter 4, exe 37
/*
a) Write an application that reads a nonnegative integer and computes and prints its factorial. - done
b) Write an application that estimates the value of the mathematical constant e by using. -
the following formula. Allow the user to enter the number of terms to calculate. -
c) Write an application that computes the value of e
 */
package second_try;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long i = 1, nr_fact_calc = 0, fact = 1;
        double j = 0, e = 0,  e_sqrt = 0, putear_unu = 2;
                System.out.print("Introduce numarul pentru calcularea factorialului: ");
        nr_fact_calc = input.nextInt();
        //calcularea de factorial
        for (i = 1; i < nr_fact_calc + 1; i++) {
            fact = fact * i;
            e += 1 + 1/fact;
            e_sqrt = Math.pow(e, putear_unu);
        }
        System.out.printf(" e = %.2f\n", e);
        System.out.printf(" e^x = %.2f\n", e_sqrt);
        System.out.printf("Factorial pentru %d este %d", nr_fact_calc, fact);
    }


}

