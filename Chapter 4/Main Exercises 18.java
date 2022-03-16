//Chapter 4, exe 18
//Calculele de galoane, combustinb, mile

/*
(Credit Limit Calculator) Dezvoltați o aplicație Java care determină dacă oricare dintre mai mulți clienți ai magazinelor universale a
depășit limita de credit pentru un cont de taxare.
        Pentru fiecare client, sunt disponibile următoarele date:

        a) numărul de cont
        b) sold la începutul lunii
        c) totalul tuturor articolelor taxate de client în această lună
        d) totalul tuturor creditelor aplicate în contul clientului în această lună
        e) limita de credit admisă.

        Programul ar trebui să introducă toate aceste fapte ca numere întregi,
                - să calculeze noul sold (= sold inițial + taxe – credite),
        - să afișeze noul sold și să determine dacă noul sold depășește limita de credit a clientului.

                Pentru acei clienți a căror limită de credit este depășită,
                programul ar trebui să afișeze mesajul „Limita de credit depășită”.
 */


package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //obicetul pentru input Scanner
        Scanner input = new Scanner(System.in);

        int total_articole = 0, total_credite = 0, limit_credite = -1000;
        String nr_cont;
        long suma_articol = 0, suma_total_articole = 0, sold_start_month = 1000, sold_end_month = 0;
        boolean verificare = false;
        //limita de credit o sa fie 1000

        System.out.printf("Soldul la inceputul luni este: ", sold_start_month);

        //Introducerea valoarea contului, care trebuie sa aiba 4 cifre
        System.out.print("Introduce numarul contului (4 cifre): ");
        nr_cont = input.next();

        //verificare daca numarul contului este valid
        if(nr_cont.length() < 4 || nr_cont.length() > 4){
            System.out.println(" Numarul contului este invalid.");
            System.exit(0);

        }else {
            System.out.println(" Numarul contului este: " + nr_cont);
        }
        //Soldul de la inceput de luna
        System.out.printf(" Solodul la inceputul luni este: %d%n", sold_start_month);

        //Introducere numarul total de articole
        System.out.printf(" Introduce numarul de articole procurate: ");
        total_articole = input.nextInt();

        //Introudecerea valoare pentru articolul procurat
        for(int i = 0; i < total_articole; i++){
            System.out.printf(" Introduce valoarea pentru artiolul %d: ", i+1);
            suma_articol = input.nextInt();
            suma_total_articole += suma_articol;
            //scaderea sume din soldul de la incaput de luna
            sold_end_month =  sold_start_month - suma_total_articole;

            if(sold_end_month < limit_credite){
                System.out.printf(" Limita de credit depășită!\n");
                verificare = true;
                break;
            }
        }
        //afisarea datelor corecte daca soldul de credit a fost depasit
        if(verificare == true){
            long sold_depasit = sold_end_month - limit_credite;
            System.out.printf(" Sold total depasit %d\n", sold_depasit);
            System.exit(0);
        }else{
            //afisare datelor finale referitor la situatia financiara a utilizatorului
            System.out.printf(" Suma pentru articole este: %d, solodul ramasa la sfarsit de luna este %d%n", suma_total_articole, sold_end_month);
        }
    }
}


