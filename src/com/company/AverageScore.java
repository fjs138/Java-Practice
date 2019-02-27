package com.company;

import javax.swing.*;

public class AverageScore {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        String input;

        // get first test score
        input = JOptionPane.showInputDialog("Enter score #1:");
        score1 = Double.parseDouble(input);

        // get second test score
        input = JOptionPane.showInputDialog("Enter score #1:");
        score2 = Double.parseDouble(input);

        // get third test score
        input = JOptionPane.showInputDialog("Enter score #1:");
        score3 = Double.parseDouble(input);

        // calculate the average score
        average = (score1 + score2 + score3) / 3.0;

        // display the average score
        JOptionPane.showMessageDialog(null, "The average is " + average);

        // if the score was greater than 95, let the user know that's great
        if (average > 95)
            JOptionPane.showMessageDialog(null, "That's a great score!");
        // you can separate your if/else statements and their conditionally executed statements
        // like above, or keep them in one line, like below:
        else JOptionPane.showMessageDialog(null, "Oh well, that's too bad!");

        System.exit(0);

    }
}
