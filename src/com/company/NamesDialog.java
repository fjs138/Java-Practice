package com.company;

import javax.swing.*;

public class NamesDialog {
    public static void main(String[] args) {
        String firstName; // user's first name
        String middleName; // user's middle name
        String lastName; // user's last name
        String age; //user's age

        // get the user's first, middle, last names
        firstName = JOptionPane.showInputDialog("What is your first name?");
        middleName = JOptionPane.showInputDialog("What is your middle name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");
        age = JOptionPane.showInputDialog("What is your age?");


        int num;

        // method for converting a string to an int
        num = Integer.parseInt(age);
        // display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " +  middleName + " " + lastName + ", age " + num);


        /**This statement causes the program to end, and is required if you use the JOptionPane class
         to display dialog boxes. Unlike a console program, a program that uses JOptionPane does
         not automatically stop executing when the end of the main method is reached, because the
         JOptionPane class causes an additional task to run in the JVM. If the System.exit method
         is not called, this task, also known as a thread, will continue to execute, even after the end
         of the main method has been reached.**/

        System.exit(0);;

        /**The System.exit method requires an integer argument. This argument is an exit code that
         is passed back to the operating system. Although this code is usually ignored, it can be used
         outside the program to indicate whether the program ended successfully or as the result of
         a failure. The value 0 traditionally indicates that the program ended successfully.**/






    }
}
