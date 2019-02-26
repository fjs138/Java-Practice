package com.company;

import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        //nextByte
        byte numberByte;
        System.out.print("Enter a byte value: ");
        numberByte = keyboard.nextByte();
        System.out.println(numberByte);


        //nextDouble
        double numberDouble;
        System.out.print("Enter a double value: ");
        numberDouble = keyboard.nextDouble();
        System.out.println(numberDouble);


        //nextFloat
        float numberFloat;
        System.out.print("Enter a float value: ");
        numberFloat = keyboard.nextFloat();
        System.out.println(numberFloat);


        //nextInt
        int numberInt;
        System.out.print("Enter an integer value: ");
        numberInt = keyboard.nextInt();
        System.out.println(numberInt);

/**
 * Why does this occur when you run the program?
 * Enter your name:
 * Enter a long value: frank
 * Exception in thread "main" java.util.InputMismatchException
 * 	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
 * 	at java.base/java.util.Scanner.next(Scanner.java:1594)
 * 	at java.base/java.util.Scanner.nextLong(Scanner.java:2373)
 * 	at java.base/java.util.Scanner.nextLong(Scanner.java:2328)
 * 	at com.company.ScannerMethods.main(ScannerMethods.java:48)
 *
 */
        //nextLine
        String nameString;
        System.out.print("Enter your name: ");
        nameString = keyboard.nextLine();
        System.out.println(nameString);


        //nextLong
        long numberLong;
        System.out.print("Enter a long value: ");
        numberLong = keyboard.nextLong();
        System.out.println(numberLong);


        //nextShort
        short numberShort;
        System.out.print("Enter a short value: ");
        numberShort = keyboard.nextShort();
        System.out.println(numberShort);






    }
}
