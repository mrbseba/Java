//Chapter 11 Exercises 16
package second_try;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            getExceptionB();
        }
        catch (ExceptionA exceptionA){
            exceptionA.printStackTrace();
        }

        try{
            getExceptionC();
        } catch (ExceptionA exceptionA){
            exceptionA.printStackTrace();
        }

    }

    public static void getExceptionB() throws ExceptionB{
        throw new ExceptionB("exception B");
    }

    public static void getExceptionC() throws ExceptionC{
        throw new ExceptionC("exception C");
    }
}
