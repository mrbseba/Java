//Chapter 8, exe 6
/*
(Savings Account Class) Create class SavingsAccount.
Use a static variable annualInterestRate to store the annual interest rate for all account holders.
Each object of the class contains a private instance variable savingsBalance indicating the amount
the saver currently has on deposit. Provide method calculateMonthlyInterest to calculate the monthly
interest by multiplying the savingsBalance by annualInterestRate divided by 12—this interest should
be added to savingsBalance.
Provide a static method modifyInterestRate that sets the annualInterestRate to a new value.
Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and saver2,
with balances of $2000.00 and $3000.00, respectively.
Set annualInterestRate to 4%, then calculate the monthly interest for each of 12 months and print the new
balances for both savers. Next, set the annualInterestRate to 5%, calculate the next month’s interest and
print the new balances for both savers
*/
package second_try;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        SavingsAccount.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("New Balance for Saver1= %f\n", saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver2= %f\n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("New Balance for Saver1= %f\n", saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver2= %f\n", saver2.getSavingsBalance());
    }
}
