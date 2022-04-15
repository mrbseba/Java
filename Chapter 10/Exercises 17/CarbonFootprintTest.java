//Chapter 10 Exercises 17
package second_try;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {

        ArrayList<CarbonFootprint> list = new ArrayList<CarbonFootprint>();
        Car car = new Car("BMW",100000);
        Building tower = new Building("Big Ben",20000);
        Bicycle bicycle = new Bicycle("Saliut",100000);

        list.add(car);
        list.add(tower);
        list.add(bicycle);

        for(CarbonFootprint c:list){
            System.out.println(c.getCarbonFootprint());
        }

    }
}
