//Chapter 2 exe 25

package second_try;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = 0;
        System.out.print("Introduce numarul: ");
        number1 = input.nextInt();

       if(number1 % 2 == 0){
           System.out.println(number1 + " este par");
       }else {
           System.out.println(number1 + " este impar");
       }
    }
}
