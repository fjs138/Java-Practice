package com.company;
import java.util.Scanner;

public class LotteryUsingStrings {
    public static void main(String[] args) {
        // Generate a lottery as a two-digit string
        String lottery = " " + (int)(Math.random() * 10) + (int)(Math.random() * 10);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        String guess = input.nextLine();

        // Get digits from lottery

        // Get digits from guess

        // Check the guess
    }
}
