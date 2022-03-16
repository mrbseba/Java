//Chapter 4, exe 24
/*
(Validating User Input) Modify the program in Fig. 4.12 to validate its inputs. For any input,
if the value entered is other than 1 or 2, keep looping until the user enters a correct value.

* */
package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        // process 10 students using counter-controlled loop
        while (studentCounter <= 10)
        {
            // prompt user for input and obtain value from user
            System.out.print("Introduce rezultatul (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // if...else is nested in the while statement
            if (result == 1){
                passes = passes + 1;
                // increment studentCounter so loop eventually terminates
                studentCounter = studentCounter + 1;
            }
            else if(result == 2){
                failures = failures + 1;
                // increment studentCounter so loop eventually terminates
                studentCounter = studentCounter + 1;
            }
            else{
                System.out.printf("Introudce valoarea corecta (1, 2)\n");
            }

        }

        // termination phase; prepare and display results
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // determine whether more than 8 students passed
        if (passes > 8)
            System.out.println("Bonus de la mentor!");

    }
}


