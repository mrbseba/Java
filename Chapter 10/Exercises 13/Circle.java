package second_try;

public class Circle extends TwoDimensionalShape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius (){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radius, 2));
    }
    @Override
    public String toString(){
        return super.toString() + " radius is " + getRadius();
    }

}
