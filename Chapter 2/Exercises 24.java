//Chapter 2 exe 24
// Cele mai mari și cele mai mici numere întregi) Scrieți o aplicație care
// citește cinci numere întregi și determină și imprimă
// mai mici numere întregi din grup. Utilizați numai tehnicile de programare
// pe care le aveți învăţat în acest capitol.

package second_try;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 0, number3 = 0, number4 = 0, number5 = 0;

        //introducerea de valori
        System.out.print("Introduce prima valoare: ");
        number1 = input.nextInt();

        System.out.print("Introduce adoua valoare: ");
        number2 = input.nextInt();

        System.out.print("Introduce a treia valoare: ");
        number3 = input.nextInt();

        System.out.print("Introduce a patra valoare: ");
        number4 = input.nextInt();

        System.out.print("Introduce a cincea valoare: ");
        number5 = input.nextInt();

        if(number1 < number2){
            System.out.printf("Numarul %d este cel mai mare", number2);
            if(number2 < number3){
                System.out.printf("Numarul %d este cel mai mare", number3);
                if (number4 < number5){
                    System.out.printf("Numarul %d este cel mai mare ", number5);
                    System.out.println();
                }
            }
        }
        if(number1 > number2){
            System.out.printf("Numarul %d este cel mai mic", number1);
            if(number2 > number3){
                System.out.printf("Numarul %d este cel mai mic", number2);
                if (number4 > number5){
                    System.out.printf("Numarul %d este cel mai mic", number4);
                }
            }
        }
        //if (number1 > number2){
        //  System.out.printf("Numarul: %d este mai mare ca numarul: %d", number1, number2);
        // }

    }
}
