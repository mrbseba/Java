//Chapter 3 exe 11 A
//to do:
//
package second_try;
import java.util.Scanner;

public class Main {
    private String name; // instance variable
    private double balance; // instance variable

    public static void main(String[] args) {

        Account account1 = new Account("Ion Neamtu", 50.00);
        Account account2 = new Account("Ghoerghe Veriga", 40);

        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        //Introducerea valuta pentru cont 1
        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // add to account1's balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input

        //Introducerea valuta pentru cont 2
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // add to account2 balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter draw amount for account1: ");
        double drawAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", drawAmount);
        account1.draw(drawAmount); // add to account1's balance

        System.out.print("Enter draw amount for account2: ");
        drawAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", drawAmount);
        account1.draw(drawAmount); // add to account1's balance

        // display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());


    }
}



