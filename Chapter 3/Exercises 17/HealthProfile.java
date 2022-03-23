//Chapter 3 exe 17. B
package second_try;

import java.util.SplittableRandom;

//Class de lucru plus
public class HealthProfile {

    //Obiectele de lucru
    private String firstName;
    private String lastName;
    private String sex;
    public int varsta;
    public int targetLowHeart, targetHighHeart;
    private int day = 0, month = 0, year = 0, ritmCardio = 0;
    private double bmi = 0, weight = 0, height = 0;
    /////////////////////////////SET///////////////////////
    public HealthProfile(String firstName, String lastName, String sex, int day, int month, int year, int ritmCardio, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.day = day;
        this.month = month;
        this.year = year;
        this.ritmCardio = ritmCardio;
        this.height = height;
        this.weight = weight;
        this.bmi = bmi;

    }
    /////////////////////////////GET///////////////////////
    //metoda care returneaza prenumele
    public String getFirstName(){

        return firstName;
    }
    //metoda care returneaza numele
    public String getLastName(){

        return lastName;
    }
    //metoda care retunreaza ziua
    public int getDay(){

        return day;
    }
    //metoda care returneaza luna
    public int getMonth(){

        return month;
    }
    //metoda care retunreaza anul
    public int getYear(){

        return year;
    }
    //metoda care returneaza sexul
    public String getSex(){
        return sex;
    }
    //metoda care retunrneaza inaltimea
    public double getHeight(){
        return height;
    }
    //metoda care retunrneaza greutatea
    public double getWeight(){
        return weight;
    }
    public double getBmi(){
        return bmi;
    }
    //metoda care calculeaza/returneaza ritmul cardiac start
    public int getLowRitmCardio() {
        this.ritmCardio = ritmCardio;
        targetLowHeart = (int) (ritmCardio * 0.64);
        return targetLowHeart;
    }
    //ritm cardio min
    public int getTargetHighHeart(){
        this.ritmCardio = ritmCardio;
        targetHighHeart = (int) (ritmCardio * 0.76);
        return targetLowHeart;
    }

    //metoda care calculeaza/returneaza vartsa persaonelor in ani
    public int Varsta(){
        this.year = year;
        varsta =  2022 - year;
        return varsta;
    }

    //metoda care calculeaza/returneaza ritmul cardiac a persoanei tinta
    public int ritmCardioMax(){
        int ritmCardio = 0;
        ritmCardio = 220 - varsta;
        return ritmCardio;
    }
    //metoda pentru calcularea indicii de masa
    public double indiciBMI(){
        bmi = (weight / (height * height));
        return bmi;
    }


}
