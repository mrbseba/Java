package second_try;

public class Bicycle implements CarbonFootprint{
    private String name;
    private double distance;

    public Bicycle(String name, double distance) {
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
        return distance*0.016;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "name='" + name + '\'' + ", distance=" + distance + '}';
    }
}
