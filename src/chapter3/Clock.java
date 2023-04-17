package chapter3;

public class Clock {
    public int seconds;
    public int minute;
    public int hour;


    public Clock(int seconds, int minute, int hour) {
        this.seconds = seconds;
        this.minute = minute;
        this.hour = hour;
    }

    public Clock() {

    }


    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }

    }

