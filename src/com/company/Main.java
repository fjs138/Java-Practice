package com.company;

import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println();

        //The following line (10) will cause a stack overflow!
        //EndlessRecursion.message();

        //Causes error...
        //HelloWorld();
        System.out.println("Welcome to the menu!");
        System.out.println("Enter the name of the file you'd like to load");
        System.out.println("For example, try \"HelloWorld\" or \"MathFun\"");
        System.out.println("Type your choice, then press enter to execute!");



    }
}
