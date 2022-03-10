//Chapter 2 exe 26

package second_try;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = 0, number2 = 0;

        System.out.print("Introduce numarul: ");
        number1 = input.nextInt();

        System.out.print("Introduce numarul 2: ");
        number2 = input.nextInt();

        // Mod
        int rest = number1 % number2;
        System.out.println(rest);
        if (rest == 0){
            System.out.printf("Numarul %d este mutliplu numarului %d", number1, number2);

        }else{
            System.out.printf("Numarul %d nu este multiplu numarului %d", number1, number2);
        }
    }
}
