//Chapter 8, exe 12
/*
(Date and Time Class) Create class DateAndTime
that combines the modified Time2 class of Exercise
8.7 and the modified Date class of Exercise 8.8.

Modify method incrementHour to call     method nextDay if
the time is incremented into the next day.

Modify methods toString and toUniversalString to output
the date in addition to the time.

Write a program to test the new class DateAndTime.

Specifically, test incrementing the time to the next day.
*/
package second_try;

import java.sql.Date;

public abstract class Main {
    public static void main(String[] args) {
        DateAndTime birth = new DateAndTime(5, 31, 1949, 23, 59, 59);
        DateAndTime hire = new DateAndTime(5, 31, 1988, 23, 59, 59);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);


    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, DateAndTime t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
        if(t.toSeconds() != 0){
            System.out.printf("E trecut de ora 00 si sunt: %d secunde\n", t.toSeconds());
        }

    }
}