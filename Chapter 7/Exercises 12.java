//Chapter 7, exe 14
/*
(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.
 */
package second_try;


import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        //Obiectul scaner
        Scanner input = new Scanner(System.in);
        int mySimpleMatrix[] = new int [100];
        int i = 0, j = 0;
        System.out.print("Introduce o valaore de 10 la 100.\n");
        for (i = 0; i < 5; i++){
            //Introduucerea valori
            invalidValue: {
                System.out.printf("Introduce %d valoare: ", i + 1);
                mySimpleMatrix[i] = input.nextInt();
                if(mySimpleMatrix[i] <= 10 || mySimpleMatrix[i] >= 100){
                    System.out.println("Introduce varianta corecta.");
                    --i;
                    System.out.println(i);
                    break invalidValue;
                }
            }
        }

        System.out.printf("Valorile introduce sunt: ");
        for (i = 0; i < 5; i++){
            for(j = i+1; j < 5; j++){
                if(mySimpleMatrix[j] == mySimpleMatrix[i]){
                    System.out.print(mySimpleMatrix[i] + ",");
                }
            }
        }
    }
}
