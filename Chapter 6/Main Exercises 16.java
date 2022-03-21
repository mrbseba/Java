//Chapter 6, exe 17
/*
(Multipli) Scrieți o metodă isMultiple care determină, pentru o pereche de numere întregi,
dacă al doilea număr întreg este un multiplu al primului.

Metoda ar trebui să ia două argumente întregi și să returneze true dacă al doilea este un
multiplu al primului și fals în caz contrar. [Sugestie: Folosiți operatorul rest.]

Încorporați această metodă într-o aplicație care introduce o serie de perechi de numere
întregi (câte o pereche) și determină dacă a doua valoare din fiecare pereche este
un multiplu al primei.
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Metoda main
    public static void main(String[] args) {
        //Obiectul Scaner
        Scanner input = new Scanner(System.in);

        //Variabele
        int num_one = 0, num_two = 0, rest = 0;
        boolean adevar = true;
        boolean neadevar = false;

        System.out.print(" Introduce primul numar: ");
        num_one = input.nextInt();

        System.out.print(" Introduce al doilea numar: ");
        num_two = input.nextInt();

        isMultiple(num_one, num_two, rest);

        if(rest == 0){
            // System.out.printf("Numarul %d este mutliplu numarului %d", num_one, num_two);
            System.out.println(adevar);     // Outputs true

        }else {
            //System.out.printf("Numarul %d nu este mutliplu numarului %d", num_one, num_two);
            System.out.println(neadevar);
        }
    }

    //MyMethod
    private static double isMultiple( int num_one, int num_two, int rest){
        //verificarea multiplului
        rest = num_two % num_one;
        System.out.printf("Rest-ul este: %d\n", rest);

        return rest;
    }
}

