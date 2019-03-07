package com.company;
import java.util.Scanner; // Needed for Scanner class
public class SwitchDemoNoBreaks {
        public static void main(String[] args)
        {
        int number; // A number entered by the user

        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);
        // Get one of the numbers 1, 2, or 3 from the user.
        System.out.print("Enter 1, 2, or 3: ");
        number = input.nextInt();
        // Determine the number entered.

            switch (number)
        {
        case 1:
            System.out.println("You entered 1.");
        case 2:
            System.out.println("You entered 2.");
        case 3:
            System.out.println("You entered 3.");
        default:
            System.out.println("That's not 1, 2, or 3!");
        }
        }
}