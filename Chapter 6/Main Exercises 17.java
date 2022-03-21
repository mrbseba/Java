//Chapter 6, exe 17
/*
(Even or Odd) Write a method isEven that uses the remainder operator (%) to determine
whether an integer is even. The method should take an integer argument and return true if the integer
is even and false otherwise. Incorporate this method into an application that inputs a sequence of integers (one at a time)
and determines whether each is even or odd. */
package second_try;

import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        //Obiectele externe
        Scanner input = new Scanner(System.in);
        //Variabile
        int number1 = -1, i = 0, n = 0;
        boolean result = false;
        System.out.print(" Introduce numarul de valori care trebuei verificat: ");
        n = input.nextInt();
        for (i = 0; i < n; i ++){
            System.out.printf(" Introduce numarul %d: ", i + 1);
            number1 = input.nextInt();
            isEven(number1, result);

        }
    }
    public static int isEven(int number1, boolean result){
        if (number1 % 2 == 0){
            result = true;
            System.out.println(result);
        }else {
            result = false;
            System.out.println(result);
        }
        return 0;
    }
}









