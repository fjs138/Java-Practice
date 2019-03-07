package com.company;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        // get one of the numbers 1,2,or 3 from the user
        System.out.println("Enter 1, 2, or 3");
        number = input.nextInt();

        // determine the number entered
        switch (number) {
            case 1:
                System.out.println("You entered 1.");
                break;

            case 2:
                System.out.println("You entered 2.");
                break;

            case 3:
                System.out.println("You entered 3.");
                break;

            default:
                System.out.println("That is not 1, 2, or 3!");
        }
}
}
