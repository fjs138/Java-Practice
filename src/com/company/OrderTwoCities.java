package com.company;
import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompt the user to enter two cities
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0 )
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2
            );
        else
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);

        String message9 = "Welcome to Java";
        message9 = message9.substring(0,11) + "HTML";
        // The string message now becomes Welcome to HTML.
        System.out.println(message9);


        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);




    }
}
