//Chapter 8, exe 5
/*
(Modifying the Internal Data Representation of a Class) It would be perfectly reasonable
for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds
since midnight rather than the three integer values hour, minute and second.
Clients could use the same public methods and get the same results.

Modify the Time2 class of Fig. 8.5 to implement the time as the number of seconds since
midnight and show that no change is visible to the clients of the class.
*/
package second_try;

public abstract class Main {
    public static void main(String[] args) {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21, 34); // 21:34:00
        Time2 t4 = new Time2(12, 25, 42); // 12:25:42
        Time2 t5 = new Time2(t4); // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour, minute and second specified", t4);
        displayTime("t5: Time2 object t4 specified", t5);

        // attempt to initialize t6 with invalid values
        try {
            Time2 t6 = new Time2(27, 74, 99); // invalid values
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
        if(t.toSeconds() != 0){
            System.out.printf("E trecut de ora 00 si sunt: %d secunde\n", t.toSeconds());
        }
    }

}