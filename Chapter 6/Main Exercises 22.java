//Chapter 6, exe 22
/*
(Temperature Conversions) Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation  celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the user either to enter a Fahrenheit temperature and display
the Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0, alegerea = 0;

        System.out.print(" 1. Calculare Celsius din Fahrenheit.\n");
        System.out.print(" 2. Calculare Fahrenheit din Celsius.\n");
        for(;;){
            System.out.print(" Introduceti valoare -> ");
            alegerea = input.nextInt();
            switch (alegerea){
                case 1:{
                    //calcularea Celsius in Fahrenheit
                    celsiusFahrenheit(input);
                    break;
                }
                case 2:
                    //calcularea Fahrenheit in Celsius
                    fahrenheitCelsius(input);
                    break;
                case 0:
                    System.out.println(" Iesire!");
                    System.exit(0);
                default:
                    System.out.println(" Introduce varianta corecta!");
            }
        }
    }
    //calcularea Celsius in Fahrenheit
    public static double celsiusFahrenheit(Scanner input){
        double celsius = 0, fahrenheit = 0;
        System.out.print(" Introduce temperatura in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9.0 / 5.0 * celsius + 32);
        System.out.printf(" Temperatura in Fahrenheit: %.2f\n", fahrenheit);
        return 0;
    }
    //calcularea Fahrenheit in Celsius
    public  static double fahrenheitCelsius(Scanner input){
        double celsius = 0, fahrenheit = 0;
        System.out.print(" Introduce temperatura in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        celsius = (5.0 / 9.0 * (fahrenheit - 32));
        System.out.printf(" Temperatura in Celsius: %.2f\n", celsius);
        return 0;
    }
}



