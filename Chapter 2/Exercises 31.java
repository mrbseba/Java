//Chapter 2 exe 31
//to do
package second_try;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        int number1 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int squery = 0;
        int cube = 0;

        System.out.println("number  squery  cube");
       for (int i = 0; i < 11; i++){
           squery = i * i;
           cube = i * i * i;
           System.out.printf("%d         %d       %d%n", number1[i], squery, cube);
           //System.out.println(squery);
       }
    }

}
