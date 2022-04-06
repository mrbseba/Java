package second_try;
public class DateAndTime {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year
    public int hour; // 0 - 23
    public int minute; // 0 - 59
    public int second; // 0 - 59


    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day given the year
    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        // check if month in range
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        // check if day in range for month
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public DateAndTime() {

    }

    //To increment the day by one
    public void nextDay() {
        day++;
        // check if day in range for month
        if ((day > daysPerMonth[month] || !(month == 2 && day == 29))) {
            month++;
            day = 1;
        }
        if (this.month > 12) {
            day = 1;
            month = 1;
            year++;
        }
        this.month = month;
        this.day = day;
        this.year = year;
        System.out.println(day);
    }


    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60) throw new IllegalArgumentException("second must be 0-59");
        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute(){
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }



    // calculate the time in seconds
    public int toSeconds() {
        int seconds = 0;
        if (getHour() >= 00 & getHour() < 12) {
            seconds = (getMinute() * 60) + (getHour() * 60);
            return seconds;
        }
        return 0;
    }

    //recalculate the time
    public void recalculateTime() {
        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second = this.second % 60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }
        if (this.hour >= 24) {
            this.hour = this.hour % 24;
            nextDay();
        }

    }

    public void tick() {
        //System.out.println("A avut loc incrementarea secundelor.");
        this.second++;
        this.recalculateTime();
    }

    // increment the minuts and hour with one
    public void incrementMinute() {
        // System.out.print("A avut loc incrementare minutelor.");
        this.minute++;
        this.recalculateTime();
    }

    //incrementHours
    public void incrementHours() {
        // System.out.print("A avut loc incrementare orelor.");
        this.hour++;
        this.recalculateTime();
    }

//    // convert to String in standard-time format (H:MM:SS AM or PM)
//    public String toString() {
//        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
//    }

    // return a String of the form month/day/year
    public String toString() {
        toUniversalString();
        tick();
        return String.format("%d/%d/%d %d:%02d:%02d %s", month, day, year, ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}

