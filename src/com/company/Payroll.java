package com.company;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        String name; // to hold a name
        int hours; // hours worked
        double payRate; // hourly pay rate
        double grossPay; // gross pay

        // create a scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("This program calculates payroll information.");

        // get the user's name
        System.out.println("what is your name? ");
        name = input.nextLine();

        // get the number of hours worked this week
        System.out.println("How many hours did you work this week? ");
        hours = input.nextInt();

        // get the user's hourly pay rate
        System.out.println("What is your hourly pay rate? ");
        payRate = input.nextDouble();

        // calculate the gross pay
        grossPay = hours * payRate;

        // display the resulting information.
        System.out.println("Hello, " + name + ".");
        System.out.println("Your gross pay is $" + grossPay);

    }
}
