//Chapter 7, exe 17
/*
(Dice Rolling) Write an application to simulate the rolling of two dice. The application should use an object of class
Random once to roll the first die and again to roll the second die.
The sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so the sum of the
values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent.
Figure 7.28 shows the 36 possible combinations of the two dice. Your application Exercises 301 should roll the dice
36,000,000 times. Use a one-dimensional array to tally the number of times each possible sum appears.
Display the results in tabular format
 */
package second_try;
import java.util.Random;

public class Main {
    static Random randomNumbers = new Random();
    long generatedLong = new Random().nextLong();

    static long rolldice1() {
        long dice1 = 1 + randomNumbers.nextLong(6);
        //System.out.print("You rolled : "+ dice1);
        return dice1;
    }

    static long rolldice2() {
        long dice2 = 1 + randomNumbers.nextLong(6);
        //System.out.print("You rolled : "+dice2);
        return dice2;
    }

    static long sum(long dice1, long dice2) {
        long sum = dice1 + dice2;
        return sum;
    }

    //Methoda main
    public static void main(String[] args) {
        long[] a = new long[36000001];
        long[] frequency = new long[37];
        for (int i = 0; i < 36000000; i++) {
            ++frequency[Math.toIntExact(sum(rolldice1(), rolldice2()))];
        }
        for (int j = 2; j < frequency.length; j++) {
            System.out.printf("%4d%10d\n", j, frequency[ j]);
        }
    }
}
