package second_try;

public class ExceptionA extends Exception{
    public ExceptionA(String message){
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}