//Chapter 5, exe 14
/*
Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop tovary the interest rate.
 */
package second_try;

public class Main {
    public static void main(String[] args) {
        double amount_five, amount_six, amount_seven, amount_eight, amount_nine, amount_ten; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate_five = 0.05, rate_six = 0.06, rate_seven = 0.07, rate_eight = 0.08, rate_nine = 0.09, rate_ten = 0.1; // interest rate


        // display headers
        System.out.printf("%s %14s %15s %15s %15s %15s %16s %n", "Year", "Amount %5", "Amount %6", "Amount %7", "Amount %8", "Amount %9", "Amount %10");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++)
        {
            // calculate new amount for specified year
            amount_five = principal * Math.pow(1.0 + rate_five, year);
            amount_six = principal * Math.pow(1.0 + rate_six, year);
            amount_seven = principal * Math.pow(1.0 + rate_seven, year);
            amount_eight = principal * Math.pow(1.0 + rate_eight, year);
            amount_nine = principal * Math.pow(1.0 + rate_nine, year);
            amount_ten = principal * Math.pow(1.0 + rate_ten, year);

            // display the year and the amount
            System.out.printf("%2d %,15.2f %,15.2f %,15.2f %,15.2f %,15.2f %,15.2f\n", year, amount_five, amount_six, amount_seven, amount_eight, amount_nine, amount_ten);
        }
    }
}

