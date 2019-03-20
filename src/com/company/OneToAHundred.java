package com.company;

public class OneToAHundred {
    public static void main(String[] args) {
        /**
         What are the three parts of a for loop control? Write a for loop that prints the
         numbers from 1 to 100 .
         **/

        for (int count = 1; count < 101;) {
            System.out.println(count);
            count++;
        }
    }
}

/**
 A for loop places control variable initialization,
 loop continuation condition, and adjustment after each iteration all together. It is more concise
 and enables you to write the code with less errors than the other two loops.
 **/