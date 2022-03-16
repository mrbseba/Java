//Chapter 4, exe 23
/*
Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21,
find the two largest values of the 10 values entered. [Note: You may input each number only once.]

* */
package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contor = 0, number = 0, largest = 0, largest_two = 0, max = 9;

        while(contor <= max){

            System.out.printf("Introduce valoarea %d: ", contor+1);
            number = input.nextInt();

            if(number > largest_two){
                if(number > largest){
                    largest_two = largest;
                    largest = number;
                }else
                {
                    largest_two = number;
                }
            }
            contor++;
        }
        System.out.printf("Primul cel mai mare numar este: %d\n", largest);
        System.out.printf("Al doilea cel mai mare numar este: %d", largest_two);

    }
}


