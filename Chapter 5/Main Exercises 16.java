//Chapter 5, exe 16
/*
(Bar Chart Printing Program) One interesting application of computers is to display graphs and bar charts.
Write an application that reads five numbers between 1 and 30. For each number that’s read, your program should display
the same number of adjacent asterisks. For example, if your program reads the number 7, it should display *******.
Display the bars of asterisks after you read all five numbers
 */
package second_try;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Obiect pentru Scaner
        Scanner input = new Scanner(System.in);
        //variabile
        int i = 0, n = 0;
        int[] numere = new int[5];
        for(i = 0; i < 5; i++){
            System.out.printf("Introduce %d numar: ", i+1);
            numere[i] = input.nextInt();
            if(numere[i] < 1 || numere[i] >30){
                System.out.println("Numar invalid");
                i--;
            }
        }
        for(i = 0; i < 5; i++){
            System.out.printf("%d: ",i+1);
            for(int j = 0; j < numere[i]; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}

