package com.company;

import java.util.Scanner;

public class AnotherForLoop {
    public static void main(String[] args) {
        System.out.println("Please enter 5 numbers to sum:");
        System.out.println("For each number, follow it with the Enter key.");

        Scanner keyboardInput = new Scanner(System.in);
        int number, sum = 0, count;
        for (count = 0; count < 5; count++) {
            number = keyboardInput.nextInt();
            sum += number;
        }
        System.out.println("Sum of numbers entered by user is " + sum);
        System.out.println("Numbers entered by user count is " + count);
    }
}
