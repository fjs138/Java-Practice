package com.company;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner keyboardInput = new Scanner(System.in);
        do {
            System.out.println("Enter an integer (the input ends if it is 0): ");
            data = keyboardInput.nextInt();

            // Here we take what sum is and add data's value to sum, and set sum equal to that value.
            sum += data;
        }
        while (data !=0);
        System.out.println("The sum is " + sum);
    }
}
