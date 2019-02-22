package com.company;
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1. Generate two random single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // 2. If number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp1 = number1;
            int temp2 = number2;
            number1 = temp2;
            number2 = temp1;
        }
        // 3. Prompt the student to answer "what is number1 - number2?"
        System.out.println("What is " + number1 + " - " +  number2+ " ?");
        int answer = input.nextInt();

        // 4. Grade the answer and display the results
        if (answer == number1 - number2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
            System.out.println(number1 + " − " + number2 + " should be " + (number1 - number2));
        }
    }
}
