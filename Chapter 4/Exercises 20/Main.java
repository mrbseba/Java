//Chapter 4, exe 20

package second_try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaryCalculator salaryCalc = new SalaryCalculator();

        for(int i=0; i<4; i++) {
            System.out.printf("Orele saptamanale pentru angajatul: %d: ", i+1);
            salaryCalc.setHours(sc.nextDouble());

            System.out.printf("Plata anagajatului %d pe ora: ", i+1);
            salaryCalc.setHourlyPay(sc.nextDouble());

            System.out.printf("Venit brut a angajatului %d: %.2f\n", i, salaryCalc.calculateGrossPay());
        }
    }
}


