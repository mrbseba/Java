package second_try;

public class CommissionEmployee extends Employee{
    // protected pentru a fi vzibile in clasa BasePlusCommissionEmployee
    protected double grossSales;
    protected double commissionRate;
    //Validarea datelor din cosntructor si initializarea lor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate)
    {
        super(firstName,lastName,socialSecurityNumber);
        if (grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    //returnarea valoarea obtinute
    public double getGrossSales() {
        return grossSales;
    }
    //atribuirea valori variabiele
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    //afisarea datelor introduse
    @Override
    public String toString() {
        return   "commission " + super.toString()+
                "grossSales: " + grossSales + "\n"+
                "commisionRate:  " + commissionRate+ "\n";
    }
}
