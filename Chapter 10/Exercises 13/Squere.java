package second_try;

public class Squere extends TwoDimensionalShape{
    private double side;

    public Squere(double radius){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getArea(){
        return Math.pow(side, 2);
    }

    public String toString(){
        return super.toString() + " side is " + getSide();
    }
}
