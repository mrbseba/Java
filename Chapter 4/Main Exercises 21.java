//Chapter 4, exe 21
/*
* (Găsiți cel mai mare număr) Procesul de găsire a celei mai mari valori este utilizat frecvent în aplicațiile de calculator.
De exemplu, un program care determină câștigătorul unui concurs de vânzări ar introduce numărul de unități vândute de fiecare agent de
*  vânzări. Agentul de vânzări care vinde cele mai multe unități câștigă concursul.

Scrieți un program pseudocod, apoi o aplicație Java care introduce o serie de 10 numere întregi și determină mine și imprimă cel mai mare
*  număr întreg. Programul dvs. ar trebui să utilizeze cel puțin următoarele trei variabile:

a) contor: un contor pentru a număra până la 10 (adică, pentru a ține evidența câte numere au fost introduse și pentru a determina când toate
*  cele 10 numere au fost procesate).
b) număr: numărul întreg introdus cel mai recent de utilizator.
c) cel mai mare: cel mai mare număr găsit până acum
* */
package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contor = 0, number = 0, largest = 0;

        while(contor <= 9){

            System.out.printf("Introduce valoarea %d: ", contor+1);
            number = input.nextInt();

            if(number > largest){
                largest = number;
            }
            contor++;
        }
        System.out.printf("Cel mai mare numar introdus este: %d", largest);
    }
}


