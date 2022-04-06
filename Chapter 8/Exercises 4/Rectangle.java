package second_try;

public class Rectangle {
    public double length = 1, width = 1, perimetruDreptunghi = 0, ariaDreptunhji = 0;

    public Rectangle(double length, double width){
        if(length < 0.0 || length >= 20.0){
            throw new IllegalArgumentException("Lenth must be between 0.0 and 20.0");
        }
        if(width < 0.0 || width >= 20.0){
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0 ");
        }
        setLength(length);
        setWidth(width);

    }
    //introduce valorilor
    public void setLength(double length){
        this.length = length;
    }
    public  void setWidth(double width){
        this.width = width;
    }
    //returnarea valorilor introduse
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    //Calcularea parametrului

    public void setPerimetruDreptunghi(double perimetruDreptunghi) {
        this.perimetruDreptunghi = perimetruDreptunghi;
    }

    public double getPerimetruDreptunghi() {
        perimetruDreptunghi = ((getLength() * 2) + (getWidth() * 2));
        return perimetruDreptunghi;
    }

    public void setAriaDreptunhji(double ariaDreptunhji) {
        this.ariaDreptunhji = ariaDreptunhji;
    }

    public double getAriaDreptunhji() {
        ariaDreptunhji = getLength() * getWidth();
        return ariaDreptunhji;
    }
}
