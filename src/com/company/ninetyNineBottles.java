package com.company;

public class ninetyNineBottles {
    public static void main(String[] args){
    int x = 99;
    while (x > 1) {
        System.out.println(x + " bottles of beer on the wall, " + x + " bottles of beer, take one down" +
                " pass it around,");
                x = x - 1;
                System.out.println(x + " bottles of beer on the wall. Oh....");


        }
    System.out.println("1 bottle of beer!");
    }
}