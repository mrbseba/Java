//Chapter 4, exe 30
/*
(Palindromes) A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611.
Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
If the number is not five digits long, display an error message and allow the user to entera new value
* */
package second_try;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0,length = 0,remainder = 0, rev=0, n = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce 5 cifre.");
        num = input.nextInt();
        length = (int) (Math.log10(num)+1);
        System.out.println(length);
        n=num;

        while(length != 5){
            System.out.println("Scuze numarul trebuie sa aiba dimensiunea 5.");
            System.out.println("Introduce 5 cifre.");
            num = input.nextInt();
            length = (int) (Math.log10(num)+1);
            System.out.println(length);
        }

        while(num>0){
            remainder = num%10;
            rev = rev*10 + remainder;
            num = num/10;
        }

        if(rev == n){
            System.out.println(n + " este un polindrom");
        }
        else{
            System.out.println(n + " nu este un polindrom");
        }

    }
}


