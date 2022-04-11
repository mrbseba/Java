package second_try;

public class HourlyEmployee extends  Employee{

    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage)
    {
        super(firstName, lastName, socialSecurityNumber);
        if (wage <= 0.0){
            throw new IllegalArgumentException("wage must be nonnegative");
        }
        if (hours<0 || hours>168){
            throw new IllegalArgumentException("hours must be between 0 and 168");
        }
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours<0 || hours>168){
            throw new IllegalArgumentException("hours must be between 0 and 168");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage <= 0.0){
            throw new IllegalArgumentException("wage must be nonnegative");
        }
        this.wage = wage;
    }

    public double earnings()
    {
        return hours * wage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "hours: " + hours + "\n" +
                "wage: " + wage + "\n" +
                "earnings: " +earnings();
    }
}
