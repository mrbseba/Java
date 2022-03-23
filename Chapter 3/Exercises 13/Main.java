//Chapter 3 exe 13 A, întrebare
//to do:
//
package second_try;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        Employee angajat1 = new Employee("Victor", "Tutu", 20000);
        Employee angajat2 = new Employee("Vin", "Mihal", 20000);
        EmployeeTest verifcare = new EmployeeTest();

        // afisarea, salariul initiatl
        System.out.printf("%s %s salariul este: $%.2f%n", angajat1.getName(), angajat1.getNumeFamilie(), angajat1.getSalariuLunar());
        System.out.printf("%s %s salariul este: $%.2f%n", angajat2.getName(), angajat2.getNumeFamilie(), angajat2.getSalariuLunar());
        //
        System.out.print("Adaus salariu angajat1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("adaugat %.2f pe balanta%n", depositAmount);
        angajat1.deposit(depositAmount); // add to account1's balance

        System.out.print("Adous salariu angajat2: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("adaugat %.2f pe balanta%n", depositAmount);
        angajat2.deposit(depositAmount); // add to account1's balance

        // afisarea nume, prenume, salariu
        System.out.printf("%s %s are salariul: $%.2f cu adous 10%% %n", angajat1.getName(), angajat1.getNumeFamilie(), angajat1.getSalariuLunar());
        System.out.printf("%s %s are salariul: $%.2f cu adous 10%% %n", angajat2.getName(), angajat2.getNumeFamilie(), angajat2.getSalariuLunar());
        verifcare.test(depositAmount);
    }
}

