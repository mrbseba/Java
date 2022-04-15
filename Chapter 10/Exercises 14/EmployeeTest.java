//Chapter 10 Exercises 14
package second_try;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] list = new Employee[3];

        list[0] = new PieceWorker("Bob", "Nowac", "11-111-1111", 10.14, 32);
        list[1] = new PieceWorker("John", "Pierson", "22-2222-222", 13.03, 60);
        list[2] = new PieceWorker("Helen", "Potter", "33-3333-333", 6.09, 15);

        for (Employee e : list) {
            System.out.println(e.toString());

        }
    }
}
