//Chapter 4, exe 32
/*
* (Checkerboard Pattern of Asterisks) Scrieți o aplicație care utilizează numai declarațiile de ieșire
System.out.print("* ");
System.out.print(" ");
System.out.println();
pentru a afișa modelul de șah care urmează. Un apel al metodei System.out.println fără argumente face ca programul
* să scoată un singur caracter newline. [Sugestie: Declarațiile de repetiție sunt
necesar.*/
//8 linii 8 coloane
package second_try;
public class Main {
    public static void main(String[] args) {
        int rand = 5, i = 0, j = 0, k = 0, col = 9;
        for(i = 1; i < rand; i++){
            System.out.print("\n");
            for(j = 1; j < col; j++){
                System.out.print("* ");
            }
            System.out.println();

            for(j = 1; j < col; j++){
                System.out.print(" *");
            }
        }
    }
}



