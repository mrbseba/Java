//Chapter 11 Exercises 21

package second_try;

public class Main_21 {
    public static void main(String[] args) {
        try{
            //division("0"); // uncomment pentru exceptie in main
            division("b");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException in main");
        }

    }

    public static void division(String number){
        try{
            int num = Integer.parseInt(number);
            System.out.println(20/num);
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException in method");
        }
    }
}
