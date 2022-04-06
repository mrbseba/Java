package second_try;

public class Employee {
    private String firstName;
    private String lastName;
    private DateAndTime birthDate;
    private DateAndTime hireDate;

    // constructor to initialize name, birth date and hire date
    public Employee(String firstName, String lastName, DateAndTime birthDate, DateAndTime hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    // convert Employee to String format
    public String toString() {
        return String.format("%s, %s  Hired: %s  Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
