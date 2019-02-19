package com.company;

public class ReverseEngi {
    public static void main(String[] args) {
        //We want the result to be: a-b c-d
        int x = 3;


        while (x > 0) {

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }

            if (x == 2) {
                System.out.print("b c");
            }

            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
        }
    }
}