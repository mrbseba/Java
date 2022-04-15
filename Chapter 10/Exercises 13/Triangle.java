package second_try;

public class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        if (side1 <= 0 || side2 <= 0 || side3 <= 0){
            throw new IllegalArgumentException("Sides shoud be > 0");
        }
        //introducerea de valori
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    //returnare valoarilor introduse
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public double getSide1(){
        return side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }
    public double getSide2(){
        return side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double getSide3(){
        return side3;
    }

    //Calcularea ariei
    public double getArea(){
        double val = ((side1 + side2 + side3) / 2);
        return Math.sqrt(val * (val - side1) * (val - side2) * (val - side3));
    }

    @Override
    public String toString(){
        return super.toString() + " side are " + side1 + " " + side2 + " " + side3;
    }

}
