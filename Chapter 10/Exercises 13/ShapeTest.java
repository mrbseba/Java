//Chapter 10 Exercises 13
package second_try;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] Shape = new Shape[6];

        Shape[0] = new Circle(2);
        Shape[1] = new Squere(4);
        Shape[2] = new Triangle(3, 4, 5);
        Shape[3] = new Sphere(2);
        Shape[4] = new Cube(6);
        Shape[5] = new Tetrahedron(2.5);

        for(Shape i : Shape){
            //verificarea tipul figurii
            if(i instanceof TwoDimensionalShape){
                System.out.println(i);
                System.out.println("Area is: " + ((TwoDimensionalShape) i).getArea());
                System.out.println();
            }else if (i instanceof ThreeDimensionalShape){
                System.out.println(i);
                System.out.println("Area is: " + ((ThreeDimensionalShape) i).getArea());
                System.out.println("Volume is: " + ((ThreeDimensionalShape) i).getVolume());
                System.out.println();
            }
        }
    }
}
