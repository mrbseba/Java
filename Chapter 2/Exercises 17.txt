//Chapter 2 exe 17
// care introduce trei numere întregi, afișează suma, media, produsul, cel mai mic și cel mai mare dintre numere. Folosiți tehnicile
//prezentat în Fig. 2.15. [Notă: Calculul mediei în acest exercițiu ar trebui să rezulte într-un număr întreg
//reprezentarea mediei. Deci, dacă suma valorilor este 7, media ar trebui să fie 2, nu
//2,3333….]

package second_try;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 0;
        int sum = 0;
        int prod = 0;
        int media = 0;

        //introducerea de valori
        System.out.print("Introduce prima valoare: ");
        number1 = input.nextInt();

        System.out.print("Introduce adoua valoare: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        prod = number1 * number2;
        media = sum / 2;

        System.out.printf("Sum este %d%n", sum);
        System.out.printf("Produsul este %d%n", prod);
        System.out.printf("Media este %d%n", media);
        if (number1 > number2){
            System.out.printf("Numarul: %d este mai mare ca numarul: %d", number1, number2);
        }
        if (number1 < number2){
            System.out.printf("Numarul: %d este mai mic ca numarul: %d", number1, number2);
        }

    }
}
