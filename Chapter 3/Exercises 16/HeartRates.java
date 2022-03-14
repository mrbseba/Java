//Chapter 3 exe 16
package second_try;
//Class de lucru plus
public class HeartRates {

    //Obiectele de lucru
    private String firstName;
    private String lastName;
    public int varsta;
    public int targetLowHeart, targetHighHeart;
    private int day = 0, month = 0, year = 0, ritmCardio = 0;
    /////////////////////////////SET///////////////////////
    public HeartRates(String firstName, String lastName, int day, int month, int year, int ritmCardio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.ritmCardio = ritmCardio;
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

    //metoda care calculeaza/returneaza ritmul cardiac start
    public int getLowRitmCardio() {
        this.ritmCardio = ritmCardio;
        targetLowHeart = (int) (ritmCardio * 0.64);
        return targetLowHeart;
    }
    //ritm cardio min
    public int getTargetHighHeart(){
        this.ritmCardio = ritmCardio;
        targetLowHeart = (int) (ritmCardio * 0.76);
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

}
