//Chapter 2 exe
//Suma = +
// Diferența = -
//Produsl = *
//Împărțirea = /

package second_try;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Obiectul pentru introducerea de date
        Scanner input = new Scanner (System.in);

        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int dif = 0;
        int prod = 0;
        int impart = 0;

        System.out.print("Introduce valorile\n");
        //Introducerea valorii pentru primul element
        System.out.print("Primul numar: ");
        num1 = input.nextInt();

        //Introducerea valorii pentru al doilea element
        System.out.print("Al doilea numar: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        dif = num1 - num2;
        if(num1 == 0 || num2 == 0){
            System.out.printf("Inmultirea nu poate avea loc. (0)\n");
        }else {
            prod = num1 * num2;
            System.out.printf("Produsul este %d%n", prod);
        }
        if(num1 == 0 || num2 == 0){
            System.out.printf("Impartirea nu poate avea loc. (0)\n");
        }else {
            impart = num1 / num2;
            System.out.printf("Impartirea este %d%n", impart);
        }

        System.out.printf("Sum este %d%n", sum);
        System.out.printf("Diferenata este %d%n", dif);


    }
}
