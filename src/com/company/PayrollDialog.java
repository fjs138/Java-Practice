package com.company;

import javax.swing.*;

public class PayrollDialog {
    public static void main(String[] args) {
        String inputString; // for reading input
        String userName; // user's name
        int hours; // number of hours worked
        double payRate; // user's hourly pay
        double grossPay; // user's gross pay

        // get the user's name
        userName = JOptionPane.showInputDialog("What is " + "your name? ");

        // get the hours worked. this is taken as a string.
        inputString = JOptionPane.showInputDialog("How many hours did you work this week? ");

        // here we convert the input to an int
        hours = Integer.parseInt(inputString);

        // get the hourly pay rate
        inputString = JOptionPane.showInputDialog("What is your hourly pay rate? ");

        // convert the input to a double.
        payRate = Double.parseDouble(inputString);

        // calculate the gross pay
        grossPay = hours * payRate;

        // display the results
        JOptionPane.showMessageDialog(null, "Hello " + userName + ". Your gross pay is $" + grossPay);

        // end the program
        System.exit(0);




    }
}
