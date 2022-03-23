//Chapter 3 exe 14 A
package second_try;

import java.util.*;

public class Main {
    //main care face apelul de la functile din DataTest
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DataTest myDate = new DataTest();

        System.out.println("Introduce luna: ");
        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);

        System.out.println("Introduce data: ");
        int myDay = input.nextInt();
        myDate.setDayDate(myDay);

        System.out.println("Introduce anul: ");
        int myYear = input.nextInt();
        myDate.setYearDate(myYear);
        //Afisarea datelor introduse conform cerintelor
        myDate.displayDate();

    }
}

