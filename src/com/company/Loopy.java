package com.company;

public class Loopy {
    public static void main(String[] args){
        int x = 1;
                System.out.println("Before the loop.");
        while (x < 4) {
            System.out.println("We in da loop!");
            System.out.println("The value of x is " + x);
            x = x + 1;
        }
    System.out.println("This is after the loop.");
    }
}
