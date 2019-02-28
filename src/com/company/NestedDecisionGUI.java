package com.company;

import javax.swing.*;

/** this program asks the user to enter a numeric test score
 * and displays a letter grade for the score. the program uses
 * nested decision structures to determine the grade.
 */

public class NestedDecisionGUI {
    public static void main(String[] args) {
        int testScore; // numeric test score
        String input;

        // get the numeric test score.
        input = JOptionPane.showInputDialog(null, "Please enter your test score, e.g. 87 for an 87% test score.");
        testScore= Integer.parseInt(input);

        if (testScore < 100 && testScore > 89)
            JOptionPane.showMessageDialog(null, "Congratulations, you got an A!");
        else if (testScore < 90 && testScore> 79)
            JOptionPane.showMessageDialog(null, "Congratulations, you got a B!");
        else if (testScore <80 && testScore > 69)
            JOptionPane.showMessageDialog(null, "Not bad, you got a C!");
        else if (testScore <70 && testScore > 59)
            JOptionPane.showMessageDialog(null, "At least you passed, you got a D!");
        else if (testScore < 60 && testScore > 0)
            JOptionPane.showMessageDialog(null, "Too bad you failed!");
        else
            JOptionPane.showMessageDialog(null, "Sorry, invalid score!");


    }
}
