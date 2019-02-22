package com.company;
import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number1 = input.nextInt();

        // One-way if statements
        // if (boolean-expression) {
        // (statement for true case)
        // }
        if (number1 % 5 == 0)
            // Display HiFive if divisible by five
            System.out.println("HiFive");
        if (number1 % 2 == 0)
            // Display HiEven if divisible by two
            System.out.println("HiEven");
        if (number1 % 3 == 0) {
            System.out.println("Divisible by three");
        }

        // Two-way if-else statements
        // if (boolean-expression) {
        // (statement for true case)
        // }
        // else {
        // (statement for false case)
        // }
         if (number1 % 10 == 0) {
             System.out.println("Divisible by ten");
         }
        else {
             System.out.println("Not divisible by ten!");
         }
        // You can nest if/else statements too
        // FYI the following code isn't practical, but is demonstrative.
        if (number1 % 20 == 0) {
            System.out.println("Divisible by twenty");
            // We fulfill the condition for "divisible by twenty"
            // Now we are entering a new if/else within an earlier if/else
            if (number1 % 2 == 0) {
                System.out.println("Number is even.");
            }
            else{
                System.out.println("Number is odd.");
            }
        }

        // Whether "if" or "else" was followed, they end up "here"


    }
}
