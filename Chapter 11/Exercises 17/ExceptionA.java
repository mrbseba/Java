package second_try;

public class ExceptionA extends Exception{
    public ExceptionA(){
        super("exception A");
    }

    public ExceptionA(String message){
        super(message);
    }
}