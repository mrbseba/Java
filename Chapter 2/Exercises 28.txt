//Chapter 2 exe 28

package second_try;


import java.util.Scanner;

public class Main {

    //constat pi
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        //obiectul scanner
        Scanner input = new Scanner(System.in);
        int raza = 0;
        int dimetru = 0;
        float circumf = 0;
        float area = 0;

        System.out.print("Introudce raza: ");
        raza = input.nextInt();

        dimetru = 2 * raza;
        circumf = (float) (2 * PI * raza);
        area = (float) (PI * raza * raza);

        System.out.printf("Diamentrul cercului este %d%n", dimetru);
        System.out.printf("Cirucferinta cercului este %f%n", circumf);
        System.out.printf("Area cercului este %f", area);



    }
}
