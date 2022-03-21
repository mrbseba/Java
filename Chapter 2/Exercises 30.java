//Chapter 6, exe 21
/*
(Separating the Digits in an Integer) Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits and prints the digits
separated from one another by three spaces each. For example, if the user types in the number 42339,
the program should print
* */
package second_try;

import java.util.Scanner;

public class Main {
    //Metoda main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print( " Enter a five digit number: " );
        number = input.nextInt();

        AP(number);

    }

    //method for display our square
    public static void AP( int number )
    {

        if ( number >= 1 &&number <= 99999 )
        {
            System.out.print("" );
            displayDigits(number );
        }
        else
        {
            System.out.print("Invalid input" );
            System.out.print("" );
        }
    }

    // Part A
    public static int quotient( int a, int b )
    {
        return a / b;
    }

    // Part B
    public static int remainder( int a, int b )
    {
        return a % b;
    }

    // Part C
    public static void displayDigits( int number )
    {
        int divisor = 10000, digit, x = 5, y= 80;
        String s = "";

        while ( divisor >= 1 )
        {
            digit = quotient(number, divisor );
            s += digit +" ";
            number =remainder( number, divisor );
            divisor =quotient( divisor, 10 );
        }

        System.out.print( s );
    }
}


