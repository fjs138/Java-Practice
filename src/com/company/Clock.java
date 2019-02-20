package com.company;

public class Clock {
    int time;

    void setTime(int t) {
        time = t;

    }
    int getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime(1245);
        int tod = c.getTime();
        System.out.println("time: " + tod);

    }
}