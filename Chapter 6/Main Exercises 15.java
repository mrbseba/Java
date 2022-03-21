//Chapter 6, exe 15
/*
(Calculele ipotenuzei) Definiți o metodă de ipotenuză care calculează ipotenuza unui triunghi dreptunghic atunci când sunt date
lungimile celorlalte două laturi.

Metoda ar trebui să ia două argumente de tip doublu și să returneze ipotenuza ca dublu.

Încorporați această metodă într-o aplicație Exerciții 239 care citește valori pentru side1 și side2 și efectuează calculul cu metoda ipotenuzei.

Utilizați metodele matematice pow și sqrt pentru a determina lungimea ipotenuzei pentru fiecare dintre triunghiurile din fig. 6.15.
[Notă: Class Math oferă, de asemenea, o metodă ipotetică pentru a efectua acest calcul.]
* */
package second_try;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    //Metoda main
    public static void main(String[] args) {
        //Obiect pentru scanare
        Scanner input = new Scanner(System.in);

        //Variabile
        double a = 0, b = 0, c = 0, i = 0, n = 0;
        System.out.print(" Nr. triunghiurilor pentru calcul: ");
        n = input.nextDouble();

        for(i = 0; i < n; i++){
            double result = ipotenuza( a, b, c, i);
            System.out.printf("Iponeuza triungiului %.0f, este: %.2f\n", i + 1, sqrt(result));
        }
    }

    private static double ipotenuza(double a, double b, double c, double i) {
        //Obiect pentru scanare
        Scanner input = new Scanner(System.in);

        //Introducere valorile a/b
        System.out.printf("Triunghiul %.0f\n", i + 1);
        System.out.print("Introduce valoarea lui a: ");
        a = input.nextDouble();
        System.out.print("Introduce valoarea lui b: ");
        b = input.nextDouble();

        c = pow(a, 2) + pow(b, 2);

        return c;

    }
}

