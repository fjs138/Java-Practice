package com.company;
import java.util.Scanner;
public class RelationalOperators {
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
            /** Java provides six relational operators (also known as comparison
             * operators)**/
            System.out.println("radius greater than zero: " + (radius > 0));
            System.out.println("radius greater than or equal to zero: " + (radius >= 0));
            System.out.println("radius less than zero: " + (radius < 0));
            System.out.println("radius less than or equal to zero: " + (radius <= 0));
            System.out.println("radius equal to zero: " + (radius == 0));
            System.out.println("radius not equal to zero: " + (radius != 0));

            //secret unused boolean variable
            boolean lightsOn = true;

        }

    }
}
