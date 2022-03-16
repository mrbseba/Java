package second_try;

public class SalaryCalculator {
    private static double BASE_HOURS = 40.0;
    private static double OVERTIME_RATE = 1.5;

    private double hours, pay;

    public void setHours(double hours){
        this.hours = hours;
    }
    public void setHourlyPay(double pay){
        this.pay = pay;
    }
    public double calculateGrossPay(){
        return hours > 40 ? (pay * BASE_HOURS) + ((pay * OVERTIME_RATE) * (hours - BASE_HOURS)) : hours * pay;
    }
}
