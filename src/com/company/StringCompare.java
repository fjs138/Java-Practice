package com.company;

/**
 * This program correctly compares to String objects using the equals method.
 *
 */
public class StringCompare {
    public static void main(String[] args) {
        String name1 = "Mark", name2 = "Mark", name3 = "Mary";

        // compare "mark" and "mark"
        if (name1.equals(name2)) System.out.println(name1 + " and " + name2 + " are the same.");
        else System.out.println(name1 + " and " +name2 + " are not the same.");

        // compare "mark" and "mary"
        if (name1.equals(name3)) System.out.println(name1 + " and " + name3 + " are the same.");
        else System.out.println(name1 + " and " +name3 + " are not the same.");

        /**You can also compare String objects to string literals. Simply pass the string literal as the
         argument to the equals method, as follows:**/
        if (name1.equals("Mark"))
            System.out.println(name1 + " and " + "Mark" + " are the same.");
        else
            System.out.println("!!!");

        /**To determine whether two strings are not equal, simply apply the ! operator to the equals
         method’s return value. Here is an example:**/
        if (!name1.equals("Mark"))
            System.out.println(name1 + " and " + "Mark" + " are the same.");
        else
            System.out.println("!!!");

        /**The String class also provides the compareTo method, which can be used to determine
         whether one string is greater than, equal to, or less than another string. The general form of
         the method is as follows:**/

        //If the method’s return value is negative, the string referenced by StringReference (the
        //calling object) is less than the OtherString argument.

        //If the method’s return value is 0, the two strings are equal.

        //If the method’s return value is positive, the string referenced by StringReference (the
        //calling object) is greater than the OtherString argument.


        if (name1.compareTo(name2) == 0)
            System.out.println(name1 + " and " + name2 + " are the same.");
        else
            System.out.println("!!!");


    }
}
