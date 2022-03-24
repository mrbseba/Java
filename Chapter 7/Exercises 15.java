//Chapter 7, exe 15
/*
(Command-Line Arguments) Rewrite Fig. 7.2 so that the size of the array is specified by the first
command-line argument. If no command-line argument is supplied, use 10 as the default size of the array.
 */
package second_try;
import java.util.Scanner;

public class Main {
    //Methoda main
    public static void main(String[] args) {
        //Obiectul pentru Scaner
        Scanner input = new Scanner(System.in);

        // declare variable array and initialize it with an array object
        int size = 0;
        int[] array = new int[size]; // new creates the array object

        //Introudcere dimenisuinea arraiului
        System.out.print("Introduce dimensiunea matrice: ");
        size = input.nextInt();

        //Initializarea array
        if (size > 0) {
            array = new int[size];
        } else {
            array = new int[10];
        }

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings
        // output each array element's value
        for (int counter = 0; counter < array.length; counter++){
            System.out.printf("%5d%8d%n", counter + 1, array[counter]);
        }
    }
}
