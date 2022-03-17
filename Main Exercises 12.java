//Chapter 5, exe 12
/*
(Calculating the Product of Odd Integers) Write an application that calculates
the product of the odd integers from 1 to 15.
 */
package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variabile de instanta
        int i = 0, n = 16, number = 0, sum = 1;
        //Obiect Scanner
        Scanner input = new Scanner(System.in);
        for(i = 0; i < n; i++){
            if (i % 2 == 1){
                sum *= i;
            }
        }
        System.out.printf("Suma numerele impare de la 1 la 5 este: %d", sum);
    }
}

