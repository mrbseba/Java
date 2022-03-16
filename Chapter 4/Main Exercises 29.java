//Chapter 4, exe 29
/*
(Square of Asterisks) Write an application that prompts the user to enter the size of the side of a square, then displays
 a hollow square of that size made of asterisks. Your program should work for squares of all side lengths between 1 and 20.
* */
package second_try;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sides = 0, i = 0;

        System.out.print(" Introduce dimensiunea patratului între 1 și 20: ");
        sides = input.nextInt();
        if(sides > 0 && sides <= 20){
            for(i = 0; i < sides; i++) {
                System.out.print("*");
            }
            System.out.print("\n");

            for(i = 0; i < sides; i++){

                for(int j = 0; j < sides-1; j++){
                    System.out.print("*");

                    for(j = 0; j < sides-2; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            for(i = 0; i < sides; i++) {
                System.out.print("*");
            }
        }else {
            System.out.print("Ați introdus valoare incorectă.");
        }


    }
}


