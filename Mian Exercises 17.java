//Chapter 5, exe 17
/*
(Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product.
.It should calculate and display the total retail value of all products sold. Use a sentinel-controlled loop to
determine when the program should stop looping and display the final results.
 */
package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize the prices as constants
        final double PRODUCT_1_PRICE = 2.98;
        final double PRODUCT_2_PRICE = 4.50;
        final double PRODUCT_3_PRICE = 9.98;
        final double PRODUCT_4_PRICE = 4.49;
        final double PRODUCT_5_PRICE = 6.87;


        //Declare the other variables
        int productNumber, quantitySold;
        double total = 0.0;

        //Create a Scanner object to get input
        Scanner input = new Scanner(System.in);

        //Create a while loop
        while(true){
            //Ask the user to enter the productNumber
            System.out.print("Introduceți cantitatea de produse vandute sau 0 pentru a renunța: ");
            productNumber = input.nextInt();

            // Stop the loop, if productNumber is 999(sentinel value, you may choose any value you want)
            if(productNumber == 0) {
                break;
            }
            System.out.println(" Meniu Pret");
            System.out.println("" +
                    "        PRODUCT_1_PRICE = 2.98;\n" +
                    "        PRODUCT_2_PRICE = 4.50;\n" +
                    "        PRODUCT_3_PRICE = 9.98;\n" +
                    "        PRODUCT_4_PRICE = 4.49;\n" +
                    "        PRODUCT_5_PRICE = 6.87;");

            //Ask the user to enter the quantitySold
            System.out.print("Introduceți valoarea produsului: ");
            quantitySold = input.nextInt();

            switch(productNumber){
                case 1:
                    total += quantitySold * PRODUCT_1_PRICE;
                    break;
                case 2:
                    total += quantitySold * PRODUCT_2_PRICE;
                    break;
                case 3:
                    total += quantitySold * PRODUCT_3_PRICE;
                    break;
                case 4:
                    total += quantitySold * PRODUCT_4_PRICE;
                    break;
                case 5:
                    total += quantitySold * PRODUCT_5_PRICE;
                    break;
                default:
                    System.out.println("Introduce valoare de la 1 la 5!");
            }
        }

        //Print the total (when the loop is done)
        System.out.println("The total is $" + total);
    }
}

