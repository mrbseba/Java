//Chapter 4, exe 19
//Calculele de galoane, combustinb, mile

/*
(Sales Commission Calculator) O companie mare își plătește agenții de vânzări pe bază de comision.
Oamenii de vânzări primesc 200 USD pe săptămână plus 9% din vânzările lor brute pentru acea săptămână.
De exemplu, un agent de vânzări care vinde mărfuri în valoare de 5.000 USD într-o săptămână primește
200 USD plus 9% din 5000 USD sau un total de 650 USD. Vi s-a furnizat o listă cu articolele vândute de
fiecare agent de vânzări. Valorile acestor articole sunt următoarele:
Valoarea articolului
1 239,99
2 129,75
3 99,95
4 350,89
Dezvoltați o aplicație Java care introduce articolele vândute de un agent de vânzări pentru săptămâna trecută
și calculează și afișează câștigurile acelui vânzător. Nu există limită pentru numărul de articole care pot fi vândute
 */


package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //obicetul pentru input Scanner
        Scanner input = new Scanner(System.in);
        //variabilele
        double valoarea_articol = 0, nr_articole = 0;
        long suma_final = 0, suma_articol = 0, procent = 0;

        System.out.println(" Introduce numarul de articole pentru introducere: ");
        nr_articole = input.nextInt();
        for (int i = 0; i < nr_articole; i++){
            System.out.printf(" Introduce aritcolul %d: ", i+1);
            valoarea_articol = input.nextDouble();
            suma_articol += valoarea_articol;
        }
        System.out.printf("Suma articolilor este: %d\n", suma_articol);
        procent = (9 * (suma_articol/100));
        System.out.printf("Adous: %d\n", procent);
        System.out.printf("Salariu final: %d", procent + 200);

    }
}


