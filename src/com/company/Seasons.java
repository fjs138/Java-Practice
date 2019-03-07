package com.company;
import java.util.Scanner;
import java.lang.String; // for fun
import java.lang.System; // why not

public class Seasons {
    // translates english names into spanish for seasonf
    public static void main(String[] args) {
        String userInput;
        Scanner input = new Scanner(System.in);

        // Get a day from the user.
        System.out.print("Enter the name of a season: ");
        userInput = input.nextLine();

        //translate the season to spanish
        switch (userInput) {
            case "spring":
                System.out.println("la primavera");
                break;
            case "summer":
                System.out.println("el verano");
                break;
            case "fall":
            case "autumn":
                System.out.println("el otono");
                break;
            case "winter":
                System.out.println("el invierno");
                break;
                default:
                    System.out.println("Please enter one of these words: " +
                            "spring, summer, autumn, fall, or winter");
        }

    }
}
