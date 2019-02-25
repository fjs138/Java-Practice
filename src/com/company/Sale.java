package com.company;
// This program demonstrates the double data type.

public class Sale {
    public static void main(String[] args) {
        double price, tax, total;


        price = 29.75;
        tax = 1.76;
        total = 31.51;
        System.out.println("The price of the item is " + price);
        System.out.println("the tax is " + tax);
        System.out.println("The total is " + total);

// How to Round
// To get a String:
        // returns "1.24"
        System.out.println(String.format("%.2f", 1.2399));
        // returns "1.240"
        System.out.println(String.format("%.3f", 1.2399));
        // returns "1.20"
        System.out.println(String.format("%.2f", 1.2));


    }
}
