//Chapter 4, exe 17
//Calculele de galoane, combustinb, mile

/*(Kilometraj de benzină) Șoferii sunt preocupați de kilometrajul pe
care îl obțin mașinile lor. Un șofer a ținut evidența mai multor
călătorii înregistrând milele parcurse și galoanele folosiți pentru
fiecare rezervor.

Dezvoltați o aplicație Java care va introduce milele parcurse și
galoanele folosiți (ambele ca numere întregi) pentru fiecare călătorie.
Programul ar trebui să calculeze și

- să afișeze milele pe galon obținute pentru fiecare călătorie și
- să imprime milele combinate pe galon obținute pentru toate călătoriile
 până în acest moment.

Toate calculele de mediere ar trebui să producă rezultate în virgulă
mobilă. Utilizați clasa
Scanner și repetarea controlată de santinelă
pentru a obține datele de la utilizator
 */


package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Obiectul de introducere de date
        Scanner input = new Scanner(System.in);
        //Intiializarea de varibiile(obiecete)
        int miles = 0, gallons = 0, i = 0;
        double miles_per_gallon = 0.0;
        int total_miles = 0, total_gallons = 0;
        double total_miles_per_gallon  = 0.0;
        int trips = 0;

        //Verifacare cate calatorie au fost
        System.out.print(" Introduce numarul de calatoari: ");
        trips = input.nextInt();
        //Introducerea datelor pentru fieare calatorie in parte
        for (i = 0; i < trips; i++){
            //introducerea datelor pentru calatorie
            System.out.printf("Introduce nr. de milele pentru calatoria %d: ", i+1);
            miles = input.nextInt();
            System.out.printf("Introduce nr. de galonele pentru calatoria %d: ", i+1);
            gallons = input.nextInt();
            //calularea galonea per mile si afisarea de date
            miles_per_gallon = (double) miles / gallons;
            System.out.printf("Mile per Gallon: %.2f%n%n", miles_per_gallon);
            //calculatul sum pentru toate datele introduse
            total_miles += miles;
            total_gallons +=gallons;

            //verificare daca au fost introduse mai multe date pentru calatorie, daca mai mare egal cu 1 afisarea datelor
            if(i >= 1){
                total_miles_per_gallon = total_miles / total_gallons;

                System.out.printf( "%n Numarul total de mile %d pentru calatotira este %d%n", i, total_miles );
                System.out.printf( "   Numarul total de galloane pentru calatoria %d este %d%n", i, total_gallons );
                System.out.printf( "   Media de gallon per mile pentru calatorai %d este %.2f%n", i, total_miles_per_gallon  );
            }
        }
        //Verificare dacat au fost intrioduse mai multe datel si daca da afisarea datelor finale pentru calaltorie
        if ( total_miles != 0 ) {
            System.out.printf( "%n Final total mile conduse: %d%n", total_miles );
            System.out.printf( " Final total galloane folosite este: %d%n", total_gallons );
            System.out.printf( " Final gallon per mile este: %.1f%n%n", total_miles_per_gallon  );
        }
        else{
            System.out.printf( " Nu au fost introduse date pentru calatorie.%n%n" );
        }
    }
}


