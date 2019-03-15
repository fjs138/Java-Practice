package com.company;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        // Generate a random number to be guessed
        int numberToGuess = (int)(Math.random()*101);

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.println("Enter your guess:");
        int guess = keyboardInput.nextInt();

        while (guess != numberToGuess){

        if (guess > numberToGuess) {
            System.out.println("You guessed too high");
            System.out.println("Enter your guess:");
            guess = keyboardInput.nextInt();
        }
        else {
                System.out.println("You guessed too low.");
            System.out.println("Enter your guess:");
            guess = keyboardInput.nextInt();
        }
        }
        System.out.println("Correct! Thanks for playing!");
    }
}
