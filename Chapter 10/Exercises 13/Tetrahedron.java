package second_try;

public class Tetrahedron extends ThreeDimensionalShape{
    private double edge;

    public Tetrahedron(double edge){
        this.edge = edge;
    }
    public double getEdge(){
        return edge;
    }

    public void setEdge(double edge){
        this.edge = edge;
    }
    public double getArea(){
        return Math.pow(edge, 2) * Math.sqrt(3);
    }
    public double getVolume(){
        return Math.pow(edge, 3) / (6 * Math.sqrt(2));
    }
    @Override
    public String toString(){
        return super.toString() + " edge is " + getEdge();
    }
}
