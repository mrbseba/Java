//Chapter 5, exe 13
/*
(Factorials) Factorials are used frequently in probability problems. The factorial of a positive
integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
1 to n. Write an application that calculates the factorials of 1 through 20. Use type long. Display the
results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
 */
package second_try;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //Variablele
        long i = 1, fact_doi = 1, fact_suta = 1, n = 0;

        for(i = 1; i < 21; i++){
            fact_doi *= i;
            //System.out.printf("Fact %d este: %d\n", i, fact_doi);
        }
        System.out.printf("Fact 20 este: %d\n", fact_doi);
        //Factorila de 100
        BigInteger fact = fact(100);
        System.out.println("Fact 100 este: " + fact);
        int powerOfTwoCount = 0;
        BigInteger two = BigInteger.valueOf(2);
        while (fact.compareTo(BigInteger.ZERO) > 0 && fact.mod(two).equals(BigInteger.ZERO)) {
            powerOfTwoCount++;
            fact = fact.divide(two);
        }
    }
    private static BigInteger fact(long n) {
        BigInteger result = BigInteger.ONE;
        for (long i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

}

