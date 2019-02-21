package com.company;
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for input
        System.out.println("Enter an integer for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; //find minutes in seconds
        int remainingSeconds = seconds % 60; //seconds remaining
        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");

        //Integer literals
        /**
         * By default, an integer literal is a decimal integer number. To denote a binary integer literal,
         use a leading 0b or 0B (zero B); to denote an octal integer literal, use a leading 0 (zero);
         and to denote a hexadecimal integer literal, use a leading 0x or 0X (zero X). For
         example:
         **/
        System.out.println(0B1111); // Displays 15
        System.out.println(07777); // Displays 4095
        System.out.println(0XFFFF); // Displays 65535
        /**
         * To improve readability, Java allows you to use underscores between two digits in a
         number literal. For example, the following literals are correct
         **/
        System.out.println(0XF_FFF); // Displays 65535
        System.out.println(15); // Displays 15
        System.out.println(1_5); // Displays 15


    }
}
