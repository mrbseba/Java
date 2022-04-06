package second_try;

import java.util.Scanner;

public class Time2 {
    public int hour; // 0 - 23
    public int minute; // 0 - 59
    public int second; // 0 - 59

    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public Time2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second) {
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

    // Time2 constructor: another Time2 object supplied
    public Time2(second_try.Time2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if (second < 0 || second >= 60){
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour must be 0-23");
        }
        this.hour = hour;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute must be 0-59");
        }
        this.minute = minute;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.second = second;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        tick();
        incrementMinute();
        incrementHours();
        return String.format( "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {

        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
    // calculate the time in seconds
    public int toSeconds(){
        int seconds = 0;
        if(getHour() >= 00 & getHour() < 12){
            seconds = ( getMinute() * 60 ) + ( getHour() * 60);
            return seconds;
        }
        return 0;
    }
    //recalculate the time
    public void recalculateTime(){
        if(this.second >= 60){
            this.minute += this.second / 60;
            this.second = this.second % 60;
        }
        if(this.minute >= 60){
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }
        if(this.hour >= 24){
            this.hour = this.hour  % 24;
        }

    }
    public void tick(){
        //System.out.println("A avut loc incrementarea secundelor.");
        this.second++;
        this.recalculateTime();
    }
    // increment the minuts and hour with one
    public void incrementMinute(){
        // System.out.print("A avut loc incrementare minutelor.");
        this.minute++;
        this.recalculateTime();
    }
    //incrementHours
    public void incrementHours(){
        // System.out.print("A avut loc incrementare orelor.");
        this.hour++;
        this.recalculateTime();
    }

}
