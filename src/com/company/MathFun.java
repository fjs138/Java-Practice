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

        double result = Math.pow(4,2);
        System.out.println("4 to the 2nd power is " + result);

        result = Math.sqrt(9.0);
        System.out.println("The square root of 9 is " + result);

        result = (int)(Math.random()*100);
        System.out.println("\nMath dot random generates " + result);

        double portion;
        portion = 70. /3.;
        System.out.println("\nResult of double variable assigned 70./3.");
        System.out.println(portion);

        portion = 70 /3;
        System.out.println("Result of double variable assigned 70/3");
        System.out.println(portion);

        System.out.println();
        System.out.println("Combined Assignment Operators:");
        System.out.println("This:");

        System.out.println("x = 0;\n" + "x += 5;");



        int x = 0;
        x += 5;
        System.out.println(x);

        System.out.println();
        System.out.println("Is the same as this:");

        System.out.println("x = 0;\n" + "x = x + 5;");

        x = 0;
        x = x + 5;
        System.out.println(x);







    }
}
