package com.company;

public class OperatorsFun {
    public static void main(String[] args) {
        System.out.println("Here are some examples of augmented assignment operators:");
        int i = 5;
        if (i == 5) {
            i++;
        }
        else {
            i = i + 8; //this is the same as the next line
            i+=8; //this is the same as the previous line

        }
        System.out.println(i + "\n");
        double x = 1;
        System.out.println("x /= 4 + 5.5 * 1.5; \nevaluates the same as");
        System.out.println("x = x / (4 + 5.5 * 1.5);\n");
        System.out.println("x /= 4 + 5.5 * 1.5 = " + (x /= 4 + 5.5 * 1.5));
        x = 1;
        System.out.println("x = x / (4 + 5.5 * 1.5) = " + (x = x / (4 + 5.5 * 1.5)));




        /** Increment var by 1 , and use the
         new var value in the statement
         **/
        int j;
        i = 1;
        j = 1;
        System.out.println("++var preincrement increment var by 1, use new var value in statement");
        System.out.println("int j = ++i;");
        j = ++i;
        System.out.println("j should result in 2, i in 2");
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        /** Increment var by 1 , but use the
         original var value in the statement
         **/
        i = 1;
        j = 1;
        System.out.println("var++ postincrement increment var by 1, use original var value in statement");
        System.out.println("int j = i++;");
        j = i++;
        System.out.println("j should result in 1, i in 2");
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println();
        System.out.println("casting 1.7 as an int results in 1");
        System.out.println((int)1.7);
        System.out.println();
        System.out.println("casting 1 to a double, then dividing by 2 results in .5");
        System.out.println((double)1 / 2);
        System.out.println();
        System.out.println("leaving 1 as it is, then dividing by 2 results in 0");
        System.out.println(1 / 2);







    }
}
