// ch 8 exe 10
package second_try;
enum TrafficLight {

    RED(1),
    GREEN(3),
    YELLOW(50);
    private final int time;

    TrafficLight(int r){
        this.time=r;

    }
    public int getTime(){

        return time;
    }
}
public class TrafficLightTest {
    public static void main(String[] args) {
        second_try.TrafficLight lights = null;
        System.out.println("RED LIGHT : "+lights.RED.getTime()+" MINUTES");
        System.out.println("YELLOW LIGHT : "+lights.YELLOW.getTime()+" SECONDS ");
        System.out.println("GREEN LIGHT : "+lights.GREEN.getTime()+" MINUTES");
    }
}