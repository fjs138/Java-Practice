package com.company;
import java.util.Scanner;

public class StringCompareIgnoreCase {
    public static void main(String[] args) {
        String userInput; // hold user input

        //create scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // prompt user to enter secret word
        System.out.print("Enter the secret word: ");
        userInput = input.nextLine();

        // determine whether the user entered the secret word
        if (userInput.equalsIgnoreCase("PROSPERO"))
            System.out.println("Congratulations! You know the secret word!");
        else
            System.out.println("Sorry, that is NOT the secret word!");



    }
}
