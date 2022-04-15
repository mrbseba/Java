package second_try;

public class Sphere extends  ThreeDimensionalShape{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double  getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * 4 * radius;
    }

    public double getVolume(){
        return Math.PI * (4 / 3) * Math.pow(radius, 3);
    }

    @Override
    public String toString(){
        return super.toString() + " radius is " + getRadius();
    }
}
