package second_try;

public class Car implements CarbonFootprint{
    private String name;
    private double distance;

    public Car(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public double getCarbonFootprint() {
        return distance*0.271;
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", distance=" + distance + '}';
    }
}