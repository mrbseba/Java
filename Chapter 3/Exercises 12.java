//Chapter 3, exe 12
/*
(Invoice Class) Create a class called Invoice that a hardware store might
use to represent an invoice for an item sold at the store.
An Invoice should include four pieces of information as instance
variables—a part number (type String), a part description (type String),
a quantity of the item being purchased (type int) and a price per item (double).
Your class should have a constructor that initializes the four instance variables.
 .Provide a set and a get method for each instance variable.
 In addition, provide a method named getInvoiceAmount that calculates
 the invoice amount (i.e., multiplies the quantity by the price per item),
 then returns the amount as a double value. If the quantity is not positive,
 it should be set to 0. If the price per item is not positive,
 it should be set to 0.0. Write a test app named InvoiceTest that demonstrates
 class Invoice’s capabilities.
 */
package second_try;

import java.util.Scanner;

public class InvoiceTest {
    //Methoda main
    public static void main(String[] args) {
        second_try.Invoice buyer1 = new second_try.Invoice("123", "Surie, din aluminuiu, 100g", 15, 2.4);

        System.out.printf("Buyer: Nr. Piesa: %s Descriere: %s Cantitatea: %d Pret:%.2f\n", buyer1.getNumarPiesa(), buyer1.getDescrierePiesa(), buyer1.getCantitateAchizitonat(), buyer1.getPretArticol());
        System.out.printf("Suma este: %.2f", buyer1.getInvoiceAmount());

    }
}

class Invoice {

    Scanner input = new Scanner(System.in);
    //Obiectele declarate
    String numarPiesa = null;
    String descrierePiesa;
    int cantitateAchizitonat = 0;
    double pretArticol = 0, sumaTotal = 0;


    public Invoice(String numarPiesa, String descrierePiesa, int cantitateAchizitonat, double pretArticol) {
        setNumarPiesa(numarPiesa);
        setDescrierePiesa(descrierePiesa);
        setCantitateAchizitonat(cantitateAchizitonat);
        setPretArticol(pretArticol);
        getInvoiceAmount();
    }

    //Setarea
    public void setNumarPiesa(String numarPiesa) {
        this.numarPiesa = numarPiesa;
    }

    public void setDescrierePiesa(String descrierePiesa) {
        this.descrierePiesa = descrierePiesa;
    }

    public void setCantitateAchizitonat(int cantitateAchizitonat) {
        if (cantitateAchizitonat < 0) {
            cantitateAchizitonat = 0;
        }
        this.cantitateAchizitonat = cantitateAchizitonat;
    }

    public void setPretArticol(double pretArticol) {
        if (pretArticol < 0.0) {
            pretArticol = 0.0;
        }
        this.pretArticol = pretArticol;

    }

    //Returnarea
    public String getNumarPiesa() {
        return numarPiesa;
    }

    public String getDescrierePiesa() {
        return descrierePiesa;
    }

    public int getCantitateAchizitonat() {
        return cantitateAchizitonat;
    }

    public double getPretArticol() {
        return pretArticol;
    }

    //calcularea suma facturi
    public double getInvoiceAmount() {
        this.cantitateAchizitonat = cantitateAchizitonat;
        this.pretArticol = pretArticol;
        sumaTotal = cantitateAchizitonat * pretArticol;
        return sumaTotal;
    }
}





