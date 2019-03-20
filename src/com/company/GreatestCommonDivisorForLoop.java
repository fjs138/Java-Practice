package com.company;

import java.util.Scanner;

public class GreatestCommonDivisorForLoop {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int n1 = keyboardInput.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = keyboardInput.nextInt();

        int gcd =1;
        int k ;

        /**while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }**/
        for (k = 2; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }
        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
