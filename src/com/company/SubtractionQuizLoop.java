package com.company;

import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; // Number of questions
        int correctCount = 0; // Count of the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);
        System.out.println("You will be asked a series of 5 questions.");

        while (count < NUMBER_OF_QUESTIONS) {
            // Generate two random single digit integers
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);

            // if number 1 < number 2, swap number 1 with number 2
            if (number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;

            }

            // prompt the student to answer what is number 1 - number 2?
            System.out.println("What is " + number1 + " + " + number2 + " ? ");
            int answer = input.nextInt();

            // grade the answer and display the result
            if (number1 + number2 == answer) {
                System.out.println("You answered correctly!");
                // increase the correct answer count
                correctCount++;
            }
            else{
                System.out.println("Your answer was wrong.");
                System.out.println("The answer was " + (number1-number2));

                // increase the question count
                count++;
            }
            long endTime = System.currentTimeMillis();
            long testTime = endTime-startTime;

            System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds \n" + output);


        }
    }
}
