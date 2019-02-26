package com.company;

public class Arithmetic {
    public static void main(String[] args) {
        int price = 5;
        int tax = 2;
        int discount = 3;
        int players = 6;
        int percent = 4;
        int number = 1;
        int maxEach = 2;
        int population = 3;
        int sales = 1;
        int amount = 4 + 8; // Assigns 12 to amount
        int total = price + tax; // Assigns price + tax to total
        number = number + 1; // Assigns number + 1 to number
        int temperature = 112 - 14; // Assigns 98 to temperature
        int sale = price - discount; // Assigns price - discount to sale
        number = number - 1; // Assigns number - 1 to number
        double markUp = 12 * 0.25; // Assigns 3 to markUp
        System.out.println(markUp);
        int commission = sales * percent; // Assigns sales * percent to commission
        population = population * 2; // Assigns population * 2 to population
        int points = 100 / 20; // Assigns 5 to points
        int teams = players / maxEach; // Assigns players / maxEach to teams
        int half = number / 2; // Assigns number / 2 to half
        int leftOver = 17 % 3;
        System.out.println(leftOver);

        System.out.println();


        number = 5/2;
        double number2 = (double)5 / 2;
        double number3 = (5 / 2F);
        double number4 = 5.0 / 2;
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        System.out.println();

        double varDouble;
        float varFloat;
        long varLong;
        int varInt;
        short varShort;
        byte varByte;

        /**In assignment statements where values of lower-ranked data types are stored in variables of
        higher-ranked data types, Java automatically converts the lower-ranked value to the higher-ranked type.
         This is called a widening conversion.**/
        varByte = 1;
        varShort = varByte;
        varInt = varShort;
        varLong = varInt;
        varFloat = varLong;
        varDouble = varFloat;
        System.out.println(varDouble);

        /**A narrowing conversion is the conversion of a value to a lower-ranked type. For example,
         converting a double to an int would be a narrowing conversion. Because narrowing con-
         versions can potentially cause a loss of data, Java does not automatically perform them.**/

        /**The cast operator lets you manually convert a value, even if it means that a narrowing
        //conversion will take place.**/
        varByte = (byte) varDouble; //narrowing
        System.out.println(varByte);

        varDouble = varByte; // widening
        System.out.println(varDouble);








    }
}
