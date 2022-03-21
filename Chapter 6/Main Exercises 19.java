//Chapter 6, exe 19
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
        char fillCharacter;
        System.out.print(" Introduce dimensiunea patratului: ");
        n = input.nextInt();
        System.out.print(" Introduce caracterul pentru patrat: ");
        fillCharacter = input.next().charAt(0);
        squeareOfAsterisks(i, j, n, fillCharacter);

    }

    //method for display our square
    public static int squeareOfAsterisks(int i, int j, int n, char fillCharacter){
        for(i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.print(fillCharacter);
            }
            System.out.print("\n");
        }
        return 0;
    }
}

