//Chapter 3 exe 16,
//Calcularea de frecvență cardiacă țintă
//Formula: 220 batai per min - varsta persoanei
package second_try;

public class Main {
    public static void main(String[] args) {
        //Initialiazarea obiectelor principale de lucru
        //HeartRates person1 = new HeartRates("Victor Neancu", 220");
        HeartRates person1 = new HeartRates("Victor", "Neancu", 23, 03, 2001, 108);
        System.out.printf("%s %s %d/%d/%d %n%n", person1.getFirstName(), person1.getLastName(), person1.getDay(), person1.getMonth(), person1.getYear());
        System.out.printf("Interval normal start: %d, interval finis %d %n%n", person1.getLowRitmCardio(), person1.getTargetHighHeart());
        System.out.printf("Persiana 1 are varsta: %d %n%n", person1.Varsta());
        System.out.printf("Ritmul cardio maxim per minut pentru persoana 1: %d", person1.ritmCardioMax());
    }
}

