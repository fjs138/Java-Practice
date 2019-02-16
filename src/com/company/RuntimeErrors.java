package com.company;

public class RuntimeErrors {
    public static void main(String[] args) {
        System.out.println("Let's divide by zero! Should be just fine, right!?");


        /**Runtime errors are errors that cause a program to terminate abnormally. They occur while a
        program is running if the environment detects an operation that is impossible to carry out.
         Input mistakes typically cause runtime errors. An input error occurs when the program is waiting
        for the user to enter a value, but the user enters a value that the program cannot handle.
         For instance, if the program expects to read in a number, but instead the user enters a string, this
        causes data-type errors to occur in the program.
         Another example of runtime errors is division by zero. This happens when the divisor is
        zero for integer divisions.*/


        System.out.println(1/0);
    }
}
