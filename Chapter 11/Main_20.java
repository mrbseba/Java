//Chapter 11 Exercises 20
package second_try;

public class Main_20 {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void method1() throws Exception{
        try{
            method2();
        } catch (Exception e){
            throw new Exception("exception from method1");
        }
    }

    public static void method2() throws Exception{
        throw new Exception("exception from method2");
    }
}
