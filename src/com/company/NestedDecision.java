package com.company;

import java.util.Scanner;

/** this program asks the user to enter a numeric test score
 * and displays a letter grade for the score. the program uses
 * nested decision structures to determine the grade.
 */

public class NestedDecision {
    public static void main(String[] args) {
        int testScore; // numeric test score

        // get the numeric test score.
        System.out.println("Please enter your test score, e.g. 87 for an 87% test score.");
        Scanner input = new Scanner(System.in);
        testScore = input.nextInt();

        if (testScore < 100 && testScore > 89)
            System.out.println("Congratulations, you got an A!");
        else if (testScore < 90 && testScore> 79)
            System.out.println("Congratulations, you got a B!");
        else if (testScore <80 && testScore > 69)
            System.out.println("Congratulations, you got a C!");
        else if (testScore <70 && testScore > 59)
            System.out.println("Congratulations, you got a D!");
        else
            System.out.println("Sorry, you failed!");


    }
}
