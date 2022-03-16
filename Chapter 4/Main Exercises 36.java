//Chapter 4, exe 36
/*
(Sides of a Right Triangle) Write an application that reads three nonzero integers and determines and prints whether they could represent the sides of a right triangle* */
//verify a = 0, b = 10, c = 10
package second_try;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceți dimensiunea laturei 1: ");
        double a = input.nextDouble();
        System.out.print("Introduceți dimensiunea laturei 2: ");
        double b = input.nextDouble();
        System.out.print("Introduceți dimensiunea laturei 3: ");
        double c = input.nextDouble();
        input.close();

        if ( (a*a + b*b) == c*c) {
            System.out.println(" (a*a + b*b) = c*c Reprezenta laturile unui triunghi dreptunghic.");
        }else {
            System.out.println(" (a*a + b*b) = c*c Nu reprezenta laturile unui triunghi dreptunghic.");
        }

        if ( (b*c + c*c) == a*a) {
            System.out.println(" (b*c + c*c) = a*a Reprezenta laturile unui triunghi dreptunghic.");
        }else {
            System.out.println(" (b*c + c*c) = a*a Nu reprezenta laturile unui triunghi dreptunghic.");
        }
        if ( (a*a + c*c) == b*b){
            System.out.println(" (a*a + c*c) = b*b Reprezenta laturile unui triunghi dreptunghic.");
        }else {
            System.out.println(" (a*a + c*c) = b*b Nu reprezenta laturile unui triunghi dreptunghic.");
        }
    }
}

