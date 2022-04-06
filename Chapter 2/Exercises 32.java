//Chapter 2 exe 32
//to do
package second_try;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        int number1 [] = {1, 0, 3, -4, 5, 6, 0, 8, -9, -10, 11};
        int egalZero = 0;
        int mareZero = 0;
        int micZero = 0;

        System.out.println("number  squery  cube");
       for (int i = 0; i < 11; i++){
           if(number1[i] == 0){
               egalZero++;
           }
           if(number1[i] > 0){
               mareZero++;
           }
           if(number1[i] < 0){
               micZero++;
           }
       }
       System.out.printf("Sunt introduse %d de zero.%n", egalZero);
       System.out.printf("Sunt introduse %d numere poziteve.%n", mareZero);
       System.out.printf("Sunt introduse %d numere negative.%n", micZero);
    }

}
