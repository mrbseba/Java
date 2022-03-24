//Chapter 7, exe 18
/*
(Turtle Graphics) The Logo language made the concept of turtle graphics famous.
Imagine a mechanical turtle that walks around the room under the control of a Java application.

The turtle holds a pen in one of two positions, up or down.

While the pen is down, the turtle traces out shapes as it moves, and while the pen is up,
the turtle moves about freely without writing anything. In this problem, you’ll simulate
the operation of the turtle and create a computerized sketchpad.

Use a 20-by-20 array floor that’s initialized to zeros. Read commands from an array that contains them.

Keep track of the current position of the turtle at all times and whether the pen is currently up or down.
Assume that the turtle always starts at position (0, 0) of the floor with its penup.

The set of turtle commands your application must process are shown in Fig. 7.29.
 */
package second_try;

import java.util.Random;
import java.util.Scanner;

enum TurtleDirection {
    LEFT,
    RIGHT,
    TOP,
    BOTTOM
}
public class Main {

    private static final boolean canvas[][] = new boolean[20][20];
    private static int currentX = 0;
    private static int currentY = 0;
    private static boolean pendown = false;

    //Methoda main
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        boolean shouldContinue = true;

        System.out.printf( "Welcome to Turtle Graphics%n" );
        System.out.printf( ":========================:%n" );
        System.out.printf( "Your commands are%n %-8d%s%n %-8d%s%n %-8d%s%n %-8d%s%n %-8s%s%n %-8d%s%n %-8d%s%n%n", 1, "Pen Up", 2, "Pen Down", 3, "Turn Right", 4, "Turn Left", "5, 10", "Move forward 10 spaces ( replace 10 for differnt number of spaces )", 6, "Display 20-by-20 array", 9, "End of data (sentinel )" );

        System.out.println( "Let's play !" );

        second_try.TurtleDirection direction = second_try.TurtleDirection.RIGHT;

        while( shouldContinue ) {

            System.out.printf( "Please enter your command : " );
            String command = scanner.next();
            switch( command ) {
                case "1":
                    pendown = false;
                    break;
                case "2":
                    pendown = true;
                    break;
                case "3":
                    switch( direction ) {
                        case LEFT:
                            direction = second_try.TurtleDirection.TOP;
                            break;
                        case TOP:
                            direction = second_try.TurtleDirection.RIGHT;
                            break;
                        case RIGHT:
                            direction = second_try.TurtleDirection.BOTTOM;
                            break;
                        case BOTTOM:
                            direction = second_try.TurtleDirection.LEFT;
                            break;
                    }
                    break;

                case "4":

                    switch( direction ) {
                        case LEFT:
                            direction = second_try.TurtleDirection.BOTTOM;
                            break;
                        case TOP:
                            direction = second_try.TurtleDirection.LEFT;
                            break;
                        case RIGHT:
                            direction = second_try.TurtleDirection.TOP;
                            break;
                        case BOTTOM:
                            direction = second_try.TurtleDirection.RIGHT;
                            break;
                    }

                    break;
                case "6":
                    displayCanvas();
                    break;
                case "9":
                    shouldContinue = false;
                    break;
                default:
                    if( command.startsWith( "5" )) {
                        int steps = Integer.parseInt( command.replace( "5,", "" ));
                        switch( direction ) {
                            case LEFT:
                                moveToLeft( steps );
                                break;
                            case RIGHT:
                                moveToRight( steps );
                                break;
                            case TOP:
                                moveToTop( steps );
                                break;
                            case BOTTOM:
                                moveToBottom( steps );
                                break;
                        }
                    }
            }
        }
    }
    private static void moveToLeft( int steps ) {

        int end = currentX - steps;
        while( currentX > end ) {
            if( pendown ) {
                canvas[ currentX ][ currentY ] = true;
            }
            currentX--;
        }
    }

    private static void moveToRight( int steps ) {

        int end = currentX + steps;
        while( currentX < end ) {
            if( pendown ) {
                canvas[ currentX ][ currentY ] = true;
            }
            currentX++;
        }

    }

    private static void moveToTop( int steps ) {

        int end = currentY - steps;
        while( currentY > end ) {
            if( pendown ) {
                canvas[ currentX ][ currentY ] = true;
            }
            currentY--;
        }
    }

    private static void moveToBottom( int steps ) {

        int end = currentY + steps;
        while( currentY < end ) {
            if( pendown ) {
                canvas[ currentX ][ currentY ] = true;
            }
            currentY++;
        }
    }

    private static void displayCanvas() {
        for( boolean[] rows: canvas ) {
            for( boolean column: rows ) {
                if( column ) {
                    System.out.print( "* " );
                } else {
                    System.out.print( "  " );
                }
            }
            System.out.println();
        }

    }
}
