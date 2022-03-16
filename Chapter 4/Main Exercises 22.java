//Chapter 4, exe 21
/*
(Tabular Output) Write a Java application that uses looping to print the following table of values
*  10*N 100*N 1000*N
1 10 100 1000
2 20 200 2000
3 30 300 3000
4 40 400 4000
5 50 500 5000
* */
package second_try;
public class Main {
    public static void main(String[] args) {
        int i = 0, n = 5;
        System.out.println("*\t10*N\t100*N\t1000*N");
        for(i = 0; i < n; i++){
            System.out.printf("%d\t%d\t\t%d\t\t%d\n",i, i * 10,i * 100, i * 1000);
        }
    }
}


