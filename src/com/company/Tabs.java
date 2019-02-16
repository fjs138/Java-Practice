package com.company;
//another well adjusted printing program
public class Tabs {
    public static void main(String[] args){
        /**\t is the tab escape sequence. When print or println
         * encounters it in a string, it causes the output cursor
         * to advance to the next tab position.
         */
        System.out.println("These are our top sellers:\n");
        System.out.print("\tComputer games\n\tCoffee\n");
        System.out.println("\tAspirin");
    }
}
