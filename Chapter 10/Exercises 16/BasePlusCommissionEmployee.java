package second_try;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    // base salary per week
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        // validate baseSalary
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        // validate baseSalary
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    }

    // calculate earnings; override method earnings in CommissionEmployee
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // return String representation of BasePlusCommissionEmployee object
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
    }
}
