//Chapter 2 exe 32
//to do
package second_try;


import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
       //Obiectul scaner
        Scanner input = new Scanner(System.in);

        double bmi = 0;
        double weightInKilograms = 0;
        double heightInMeter = 0;
        System.out.printf("            BMI Values%n - Underweight: less than 18.5.%n - Normal: between 18.5 and 24.9.%n - Overweight: between 25 and 29.9.%n - Obese: 30 or greater.%n");

        System.out.printf(" -> Introducere greutatea: ");
        weightInKilograms = input.nextDouble();

        System.out.printf(" -> Introducere inaltimea: ");
        heightInMeter = input.nextDouble();

        bmi = ( weightInKilograms / (heightInMeter * heightInMeter) );

        System.out.printf(" BMI-ul tau este: %.2f", bmi);

    }

}
