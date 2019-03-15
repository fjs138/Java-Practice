package com.company;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Create a scanner
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = keyboardInput.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("Wrong answer. Try again. What is " + number1 + " + " + number2 + "?");
            answer = keyboardInput.nextInt();
        }
System.out.println("Correct, you guessed it!");
    }
}
