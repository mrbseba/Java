//Chapter 4, exe 35
/*
(Sides of a Triangle) Write an application that reads three nonzero values entered by the user and determines and prints whether they could represent the sides of a triangle
* */
package second_try;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți trei dimensiuni, separate prin spații: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        if ( (a + b) > c) {
            if ( (a + c) > b) {
                if ( (b + c) > a){
                    System.out.printf("Un triunghi poate fi format din %.2f, %.2f, cu %.2f.", a, b, c);
                }else {
                    System.out.println("Nu este posibil de creat un asemenea triunghi.");
                }
            }else {
                System.out.println("Nu este posibil de creat un asemenea triunghi.");
            }
        }else {
            System.out.println("Nu este posibil de creat un asemenea triunghi.");
        }
    }
}



