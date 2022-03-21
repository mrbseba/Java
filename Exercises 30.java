//Chapter 6, exe 21
/*
(Separating Digits) Write methods that accomplish each of the following tasks:
a) Calculate the integer part of the quotient when integer a is divided by integer b.
b) Calculate the integer remainder when integer a is divided by integer
c) Use the methods developed in parts (a) and (b) to write a method displayDigits that receives an integer
between 1 and 99999 and displays it as a sequence of digits, separating
each pair of digits by two spaces. For example, the integer 4562 should appear as
4 5 6 2
Incorporate the methods into an application that inputs an integer and calls displayDigits by passing the method
the integer entered. Display the results.
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


