//Chapter 7, exe 18
/*
(Game of Craps) Write an application that runs 1,000,000 games of craps (Fig. 6.8) and answers the following questions:
a) How many games are won on the first roll, second roll, …, twentieth roll and after the twentieth roll?
b) How many games are lost on the first roll, second roll, …, twentieth roll and after the twentieth roll?
c) What are the chances of winning at craps? [Note: You should discover that craps is one of the fairest casino games. What do you suppose this means?]
d) What is the average length of a game of craps?
e) Do the chances of winning improve with the length of the game?
 */
package second_try;

import java.util.Random;

public class Main {
    private Random randomNumbers = new Random();

    private enum Status {Continue, Won, Lost};
    int[] GamesWon;
    int[] GamesLost;
    int winTotal, loseTotal;

    public void play() {
        int totalOfDice = 0;
        int myPoints = 0;
        second_try.Main.Status gameStatus;
        int roll;
        GamesWon = new int[22];
        GamesLost = new int[22];
        for (int x = 1; x <= 1000000; x++) {
            totalOfDice = rollDice();
            roll = 1;
            switch (totalOfDice) {
                case 7:
                case 11:
                    gameStatus = second_try.Main.Status.Won;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = second_try.Main.Status.Lost;
                    break;
                default:
                    gameStatus = second_try.Main.Status.Continue;
                    myPoints = totalOfDice;
                    break;
            }
            while (gameStatus == second_try.Main.Status.Continue) {
                totalOfDice = rollDice();
                roll++;
                if (totalOfDice == myPoints) {
                    gameStatus = second_try.Main.Status.Won;
                } else if (totalOfDice == 7) {
                    gameStatus = second_try.Main.Status.Lost;
                }

            }
            if (roll > 21) {
                roll = 21;
            }

            if (gameStatus == second_try.Main.Status.Won) {
                GamesWon[roll]++;
                winTotal++;
            } else {
                GamesLost[roll]++;
                loseTotal++;
            }
        }
        printStats();
    }

    public void printStats() {
        int totalGames = winTotal + loseTotal;
        int length = 0;
        int RollsToWin;
        int RollsToLose;
        for (int x = 1; x <= 21; x++) {
            if (x == 21) {
                System.out.printf("\n%d games won and %d games lost on rolls after the 20th roll", GamesWon[21], GamesLost[21]);
            } else if (x <= 21) {
                System.out.printf("\n%d games won and %d games lost on roll %d", GamesWon[x], GamesLost[x], x);
            }

            RollsToWin = (GamesWon[x] * x);
            RollsToLose = (GamesLost[x] * x);
            System.out.printf("\nTotal Rolls to win: " + RollsToWin);
        }

        System.out.printf("\n%s %d / %d = %.2f%%\n", "The chances of winning are", winTotal, totalGames, (100.0 * winTotal / totalGames));
        System.out.printf("The average game length is %.2f rolls.\n", ((double) length / totalGames));
    }

    public int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        return sum;
    }

    //Methoda main
    public static void main(String[] args) {
        second_try.Main game = new second_try.Main();
        game.play();
    }
}
