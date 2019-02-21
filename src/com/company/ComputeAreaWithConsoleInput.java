package com.company;
import java.util.Scanner;
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //create a scanner object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        //if they enter a negative number, this will catch it
        if (radius < 0) {
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * 3.14159;
            //Display results
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }

    }
}
