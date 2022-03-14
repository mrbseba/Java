//Chapter 3 exe 17, A
//Calcularea de frecvență cardiacă țintă
//Formula: 220 batai per min - varsta persoanei
package second_try;

public class Main {
    public static void main(String[] args) {
        //Initialiazarea obiectelor principale de lucru
        //HeartRates person1 = new HeartRates("Victor Neancu", 220");
        HealthProfile person1 = new HealthProfile("Victor", "Neancu", "Masculin", 23, 03, 2001, 108, 72.0472441, 167.992244);
        System.out.printf("%s %s %s %d/%d/%d %n%n", person1.getFirstName(), person1.getLastName(), person1.getSex(), person1.getDay(), person1.getMonth(), person1.getYear());
        System.out.printf("Interval normal start: %d, interval finis %d %n%n", person1.getLowRitmCardio(), person1.getTargetHighHeart());
        System.out.printf("Persiana 1 are varsta: %d %n%n", person1.Varsta());
        System.out.printf("Ritmul cardio maxim per minut pentru persoana 1: %d %n%n", person1.ritmCardioMax());
        System.out.printf("            BMI Values%n - Underweight: less than 18.5.%n - Normal: between 18.5 and 24.9.%n - Overweight: between 25 and 29.9.%n - Obese: 30 or greater.%n");
        System.out.printf("(inch / pounds) Indici de masa: %f", person1.indiciBMI());
    }
}

