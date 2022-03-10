//Chapter 2 exe 16
////de la utilizator și afișează numărul mai mare urmat de cuvintele
// „este mai mare”. Dacă numerele sunt egale, tipăriți mesajul
// „Aceste numere sunt egale”.

package second_try;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int number1 = 0;
    int number2 = 0;

    System.out.print("Introduce primul numar: ");
    number1 = input.nextInt();

    System.out.print("Introduce al doilea numar: ");
    number2 = input.nextInt();

    if (number1 > number2){
        System.out.printf("Primul numar: %d este mai mare ca al doilea: %d", number1, number2);
    }
    if (number1 == number2){
        System.out.printf("Numarul: %d este egal cu numarul: %d", number1, number2);
    }
    if(number1 < number2) {
        System.out.printf("Primul numar: %d este mai mic ca al doilea: %d", number1, number2);
    }
    }
}
