//Chapter 6, exe 20
/*
(Circle Area) Write an application that prompts the user for the radius of a circle and uses
a method called circleArea to calculate the area of the circle.
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Metoda main
    public static void main(String[] args) {
        //Obiectul Scaner
        Scanner input = new Scanner(System.in);
        //variabilele
        double diametru = 0, raza = 0;

        System.out.print(" Introduce raza cercului: ");
        raza = input.nextInt();
        CircleArea(raza, diametru);

    }

    //method for display our square
    public static double CircleArea(double raza, double diametru){
        diametru = (2 * raza);
        System.out.println(" Diametrul cercului eset: " + diametru);
        return 0;
    }
}

