//Chapter 7, exe 14
/*

(Variable-Length Argument List) Write an application that calculates the product of a series of
integers that are passed to method product using a variable-length argument list. Test your method
with several calls, each with a different number of arguments.
 */
package second_try;
public class Main {
    //Methoda main
    public static void main(String[] args) {

        System.out.println(product());
        System.out.println(product(10));
        System.out.println(product(10, 10));
        System.out.println(product(10, 10, 10));
        System.out.println(product(10, 10, 10, 10));

    }

    public static int product(int... numbers){
        int total = 1;

        if(numbers.length == 0){
            return 0;
        }
        for(int number : numbers){
            total *= number;
        }
        return total;
    }
}
