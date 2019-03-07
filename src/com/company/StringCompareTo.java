package com.company;
/** This program compares two String objects using the compareTo method.
 */

public class StringCompareTo {
    public static void main(String[] args) {
        String name1 = "Mary";
        String name2 = "Mark";

        // compare mary and mark

        if (name1.compareTo(name2) < 0)
            System.out.println(name1 + " is less than " + name2);
        else if (name1.compareTo(name2) == 0 )
            System.out.println(name1 + " is equal to " + name2);
        else if (name1.compareTo(name2) > 0)
            System.out.println(name1 + " is greater than " + name2);

    /** Let’s take a closer look at this program. When you use the compareTo method to compare
     two strings, the strings are compared character by character. This is often called a lexico-
     graphical comparison. The program uses the compareTo method to compare the strings
     “Mary” and “Mark”, beginning with the first, or leftmost, characters.
     **/
    }

}
