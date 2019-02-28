package com.company;

import java.util.Scanner;

public class AbsValue {

    public static void main(String[] args) {
        int x, absX;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer x: ");
        x = input.nextInt();

        // if statement starts below
        if (x < 0) {
            // This is the if branch
            absX = -x;
        } else {
            // This is the else branch
            absX = x;
        }

        System.out.println("The absolute value of " + x + " is " + absX);
    }
}