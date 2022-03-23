package second_try;

public class EmployeeTest {
    //metida de verificare daca tot functioneaza corect,
    // if -> se verifica daca soldul este mai mare, in cazul ca este
    // mai mare verifcare nu atrect, else tot merge corect
    private double salariuLunar;

    public void test(double depositAmount){
        salariuLunar = (salariuLunar + depositAmount) * 1.1;
        //verificare daca datele sunt corecte
        if (depositAmount < salariuLunar)
        {
            System.out.println("EmployeeTest: Verificarea a fost trecuta.");
            System.out.printf("Depositul fiind: %.2f. +10%% fiind: %.2f",depositAmount, salariuLunar);
        } else{

            System.out.println("EmployeeTest: Verificare nu a fost trecuta.");
            System.out.printf("Depositul fiind: %.2f. +10%% fiind: %.2f",depositAmount, salariuLunar);
        }
    }
}
