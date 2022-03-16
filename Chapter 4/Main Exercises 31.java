//Chapter 4, exe 31
package second_try;
/*
* (Tipărirea echivalentului zecimal al unui număr binar) Scrieți o aplicație care introduce un număr întreg care conține doar 0 și 1
* (adică un număr întreg binar) și imprimă echivalentul său zecimal.

[Sugestie: Folosiți operatorii de rest și de împărțire pentru a alege cifrele numărului binar pe rând, de la dreapta la stânga.

În sistemul numeric zecimal, cifra din dreapta are o valoare pozițională de 1, iar următoarea cifră din stânga o valoare pozițională de 10,
* apoi 100, apoi 1000 și așa mai departe.

Numărul zecimal 234 poate fi interpretat ca 4 * 1 + 3 * 10 + 2 * 100. În sistemul numeric binar, cifra din dreapta are o valoare pozițională de 1,
* rmătoarea cifră din stânga o valoare pozițională de 2, apoi 4 , apoi 8 și așa mai departe.

Echivalentul zecimal al binarului 1101 este 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, sau 1 + 0 + 4 + 8 sau, 13.]
* */

public class Main {
    static int binaryToDecimal(int n)
    {
        int num = n, last_digit = 0;
        int dec_value = 0;
        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;
        int temp = num;

        while (temp > 0) {
            last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        return dec_value;
    }
    public static void main(String[] args) {
        int num = 10101001;
        System.out.println(binaryToDecimal(num));
    }
}



