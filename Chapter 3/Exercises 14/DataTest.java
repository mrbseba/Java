//Chapter 3 exe 14 B
package second_try;
//Putin nu imi este clar ce ar fi posibili aici de verificat (sad)
public class DataTest {
    private int month = 0, day = 0, year = 0;
    //setare de luna
    public void setMonthDate(int myMonth) {
        month = myMonth;
    }
    public int getMonthDate() {
        return month;
    }

    public void setDayDate(int myDay) {
        day = myDay;
    }
    public int getDayDate() {
        return day;
    }

    public void setYearDate(int myYear) {
        year = myYear;
    }

    public int getYearDate() {
        return year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d", month, day, year);
    }
}
