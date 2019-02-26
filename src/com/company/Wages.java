package com.company;
// Calculate hourly wage
public class Wages {
    public static void main(String[] args) {
        double regWage; // calculated regular wage
        double basePay = 20; // base pay
        double regHours = 40; // hours worked less overtime
        double overWage; // overtime wage
        double overPay = 38; // overtime pay rate
        double overHours = 10l; // overtime hours worked
        double totalWage; //total wage

        regWage = basePay * regHours;
        overWage = overPay * overHours;
        totalWage = regWage + overWage;
        System.out.println("Wages for this week are $" + totalWage);
    }
}
