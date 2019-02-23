package com.company;
import java.util.Scanner;
import static java.lang.Character.isLetter;

public class CharsAndStrings {
    public static void main(String[] args) {
        int day = 3;
        char love = 'a';
        // Fall through behavior. We make use of each case being executed in order.
        // You can see for example that case 3 would fall through to case 5, and then break.
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("Weekday"); break;
            case 0:
            case 6: System.out.println("Weekend");
                System.out.println(day);
        }

        System.out.println(isLetter(love));

        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is "
                + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is "
                + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is "
                + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is "
                + Character.toUpperCase('q'));


        String message = "Welcome to";
        System.out.println("The length of " + message + " is "
                + message.length() + " and " + message.charAt(0) + " is the first letter of " + message);

        String message2 = " Java";

        String s3 = message + message2;

        System.out.println(s3);

        // how can we truly capture a single keystroke?
        // this doesn't cut it
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);



        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s4 = "Welcome to C++";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s4)); // false

        if (s1.startsWith("Wel")){
            System.out.println("Well played.");
        }
        else {
            System.out.println("Oh no.");
        }



    }
}
