package second_try;

public class Building implements CarbonFootprint{
    private String name;
    private double tons;

    public Building(String name, double tons)
    {
        this.name = name;
        this.tons = tons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTons() {
        return tons;
    }

    public void setTons(double tons) {
        this.tons = tons;
    }

    public double getCarbonFootprint()
    {
        return tons*11.7*0.4535;
    }

    @Override
    public String toString() {
        return "Building{" + "name='" + name + '\'' + ", tons=" + tons + '}';
    }
}
