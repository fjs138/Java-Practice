package com.company;

import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        String userInput;
        char foodGrade;

        // create scanner object for keyboard inpurt
        Scanner input = new Scanner(System.in);

        // prompt the user for grade of pet food
        System.out.println("Our pet food is available in grade A, B, or C.");
        System.out.println("Which would you like to see pricing for?");
        userInput = input.nextLine();
        foodGrade = userInput.charAt(0);

        // display pricing data for selected grade

        switch (foodGrade) {
            case 'a':
            case 'A':
                System.out.println("30 cents per lb.");
                break;
            case 'b':
            case 'B':
                System.out.println("20 cents per lb.");
                break;
            case 'c':
            case 'C':
                System.out.println("15 cents per lb.");
                break;
            default:
                System.out.println("Invalid choice.");


        }

    }
}