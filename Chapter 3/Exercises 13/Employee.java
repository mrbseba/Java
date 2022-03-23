//Chapter 3 exe 13 B
package second_try;

public class Employee {

    private String prenume;  // instance variable
    private String numeFamilie;  // instance variable
    private double salariuLunar;  // instance variable

    // Account constructor that receives two parameters
    public Employee(String prenume, String numeFamilie, double salariuLunar) {
        this.prenume = prenume; // assign name to instance variable name
        this.numeFamilie = numeFamilie;
        //verificarea daca salariu este pozitiv
        if (salariuLunar > 0.0){
            // if the balance is valid
            this.salariuLunar = salariuLunar; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount){
        if (depositAmount > 0.0)
        {
            // if the depositAmount is valid
            salariuLunar = (salariuLunar + depositAmount) * 1.1; // adaugare pe balanta cu 10% adaus
        }else{
            System.out.println("Solodul este negativ");
        }
    }


    // method returns the account balance
    public double getSalariuLunar(){
        return salariuLunar;
    }

    // method that sets the name
    public void setName(String prenume){
        this.prenume = prenume;
    }
    public void setNumeFamilie(String numeFamilie){
        this.numeFamilie = numeFamilie;
    }

    // method that returns the name
    public String getName(){
        return prenume;
    }
    public String getNumeFamilie(){
        return numeFamilie;
    }
}

