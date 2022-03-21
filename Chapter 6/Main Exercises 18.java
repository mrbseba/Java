//Chapter 6, exe 18
/*
(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid square (the same number of rows and columns)
of asterisks whose side is specified in integer parameter side. For example, if side is 4, the method should display
****
****
****
****
Incorporate this method into an application that reads an integer value for side from the user and outputs the asterisks
with the squareOfAsterisks method.
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Metoda main
    public static void main(String[] args) {
        //Obiectul Scaner
        Scanner input = new Scanner(System.in);
        //variabilele
        int i = 0, n = 0, j = 0;
        System.out.print("Introduce dimensiunea patratului: ");
        n = input.nextInt();
        squeareOfAsterisks(i, j, n);

    }

    //method for display our square
    public static int squeareOfAsterisks(int i, int j, int n){
        for(i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        return 0;
    }
}

