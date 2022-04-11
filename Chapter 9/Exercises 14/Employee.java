package second_try;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "employee:" +
                firstName + " " + lastName + "\n" +
                "socialSecurityNumber: " + socialSecurityNumber + "\n";
    }
}
