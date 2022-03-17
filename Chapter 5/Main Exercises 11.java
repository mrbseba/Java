//Chapter 5, exe 11
/*
(Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.
 */
package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variabilele de instantta
        int i = 0, n = 0, number = 0, smallest = 0;
        //Obiectul pentru scaner
        Scanner input = new Scanner(System.in);
        //Verificare numarul valorilor introduse
        System.out.printf("Cate valori trebuie introduse: ");
        n = input.nextInt();
        for(i = 0; i < n; i++){
            System.out.printf("Introduce %d numar: ", i+1);
            number = input.nextInt();

            if ( i == 0 ){
                smallest = number;
            } else{
                if(number < smallest){
                    smallest = number;
                }
            }

        }
        System.out.printf("Cel mai mic numar introdus este: %d", smallest);
    }
}

