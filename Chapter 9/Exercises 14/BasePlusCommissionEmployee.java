package second_try;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    //Validarea datelor introduse
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }
    //Returnerea valoare obtinute
    public double getBaseSalary() {
        return baseSalary;
    }
    //Initiarea date baseSalary
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    //Afisarea datelor introduse
    @Override
    public String toString() {
        return "base-salaried " + super.toString() +
                "baseSalary: " + baseSalary;
    }
}
