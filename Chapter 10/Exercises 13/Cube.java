package second_try;

public class Cube extends ThreeDimensionalShape{
    private double side;

    public Cube(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getArea(){
        return 6 * Math.pow(side, 2);
    }
    public double getVolume(){
        return Math.pow(side, 3);
    }
    public String toString(){
        return super.toString() + " side is " + getSide();
    }
}
