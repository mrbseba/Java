//Chapter 8, exe 4
/*
Rectangle Class) Create a class Rectangle with attributes length and width, each of which
defaults to 1. Provide methods that calculate the rectangle’s perimeter and area. It has set and get
methods for both length and width. The set methods should verify that length and width are each
floating-point numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
 */
package second_try;
public class TestRectangle {
    //Methoda main
    public static void main(String[] args) {

        Rectangle recObj = new Rectangle( 3.3, 2.3);
        System.out.printf("Lungimea Introdusa: %.2f, Aria Introdusa: %.2f\n", recObj.getLength(), recObj.getWidth());
        System.out.printf("Perimetrul este: %.2f\n", recObj.getPerimetruDreptunghi());
        System.out.printf("Aria este: %.2f", recObj.getAriaDreptunhji());
    }
}
