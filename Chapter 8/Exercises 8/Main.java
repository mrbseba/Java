//Chapter 8, exe 8
/*
(Enhancing Class Date) Modify class Date of Fig. 8.7 to perform error checking on the
initializer values for instance variables month, day and year (currently it validates only the month and
day). Provide a method nextDay to increment the day by one. Write a program that tests method
nextDay in a loop that prints the date during each iteration to illustrate that the method works correctly.
Test the following cases:

a) incrementing into the next month and
b) incrementing into the next year.
*/
package second_try;

public abstract class Main {
    public static void main(String[] args) {
        Date birth = new Date(5, 31, 1949);
        Date hire = new Date(5, 31, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);
        birth.nextDay();
        hire.nextDay();
        System.out.println(employee);


    }
}