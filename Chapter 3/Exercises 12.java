//Chapter 3 exe 12
//to do:
//
package second_try;
import java.util.Scanner;

class Factura{

    Scanner input = new Scanner(System.in);

    //Obiectele declarate
    String numarPiesa;
    String descrierePiesa;
    int cantitateAchizitonat = 0;
    double pretArticol = 0, sumaTotal = 0;
    //Introducere de date
    public void getElements(){
        System.out.print(" Introuduce numarul piesei: ");
        numarPiesa = input.nextLine();

        System.out.print(" Introuduce o descriere pentru piesa: ");
        descrierePiesa = input.nextLine();

        System.out.print(" Introduce cantitatea de piese achizitionate: ");
        cantitateAchizitonat = input.nextInt();

        System.out.print(" Introuduce pretul pentru piesa(dolari): ");
        pretArticol = input.nextDouble();
    }

    //calcularea suma facturi
    public void getInvoiceAmount(){

        sumaTotal = cantitateAchizitonat * pretArticol;

    }

    //afisare de elemente
    public void showElements(){
        System.out.println("Numarul piese este = " + numarPiesa);
        System.out.println("Descriere: " + descrierePiesa);
        System.out.printf("Cantitatea de piese %d%n", cantitateAchizitonat);
        System.out.printf("Pret per articol %.2f dolari.%n", pretArticol);
        System.out.printf("Suma totala este %.2f dolari.%n", sumaTotal);
    }
}


public class Main {


    public static void main(String[] args) {

        Factura objFactura = new Factura();
        objFactura.getElements();
        objFactura.getInvoiceAmount();
        objFactura.showElements();
    }
}

