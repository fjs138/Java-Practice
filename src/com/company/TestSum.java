// Incomplete
package com.company;

public class TestSum {
    public static void main(String[] args) {
        // initialize sum
        double currentValue = 0;
        double sum = 0;

        // add 0.01, 0.02,... 0.99, 1 to sum
        for (int count = 0; count <=100; count++);
        {
            sum += currentValue;
            currentValue -= -0.01;
        }
        // display result
        System.out.println("The sum is " + currentValue);
    }
}
