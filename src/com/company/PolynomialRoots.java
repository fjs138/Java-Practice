package com.company;

import java.util.Scanner;

public class PolynomialRoots {

    public static void main(String[] args) {
        double a, b, c, desc;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficients a, b, and c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        desc = b * b - 4 * a * c;

        if (desc < 0.0) {
            System.out.println("The polynomial has no real roots.");
        } else {
            if (desc == 0.0) {
                System.out.println("The polynomial has one real root.");
            } else {
                System.out.println("The polynomial has two real roots.");
            }
        }
    }
}