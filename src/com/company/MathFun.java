package com.company;

public class MathFun {
    public static void main (String[] args) {
        System.out.println();
        System.out.print("(10.5 + 2 * 3) / (45 - 3.5) is ");
        System.out.println((10.5 + 2 * 3) / (45 - 3.5));
        System.out.println();
        System.out.println("We interrupt your math session...");
        System.out.println("REPETITION = LEARNING!");
        System.out.println("The \"System\" class is part of the Java API");
        System.out.println();
        System.out.println("\"print\" and \"println\" are METHODS!");
        System.out.println("they are members of the \"out\" OBJECT!");
        System.out.println();
        System.out.print("10.5 + 2 * 3 / 45 - 3.5 is ");
        System.out.println(10.5 + 2 * 3 / 45 - 3.5);
        System.out.println();
        System.out.print("3.5 * 4 / 2 – 2.5 is ");
        System.out.println(3.5 * 4 / 2 - 2.5);

        double funNumber1 = (3.5 * 4 / 2 - 2.5);
        double funNumber2 = (3.14+3*2-1/3); //this looks ugly, make sure to use spaces!

        // why wont this work?
        // int funNumber1 = (int) funNumber1;
        System.out.println();
        System.out.println("This is from a variable called funNumber1: \n" + funNumber1);
        System.out.println();
        System.out.println("This is from a variable called funNumber2: \n" + funNumber2);
        System.out.println();
        System.out.print("This is actually from \"print\" not \"println\" but we have a new line!\n");
        System.out.println("Check the code to find out why!");




    }
}
