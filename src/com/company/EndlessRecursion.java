package com.company;

/**
 * This class has a recursive method.
 */

/**Class names should be nouns, in mixed case with the first
 * letter of each internal word capitalized. Interface names
 * should also be capitalized just like class names.
 * Use whole words and avoid acronyms and abbreviations.
 *
 * Examples:
 * interface  Bicycle
 * class MountainBike implements Bicyle
 *
 * interface Sport
 * class Football implements Sport
 */
public class EndlessRecursion
{
    /** Methods should be verbs, in mixed case with the first
     * letter lowercase and with the first letter of each internal
     * word capitalized.
     *
     * Examples:
     *
     * void changeGear(int newValue);
     * void speedUp(int increment);
     * void applyBrakes(int decrement);
     */
    public static <string> void message()
    {
        /**Variable names should be short yet meaningful.
         * Should not start with underscore(‘_’) or dollar sign ‘$’
         * characters.
         * Should be mnemonic i.e, designed to indicate to the casual
         * observer the intent of its use.
         * One-character variable names should be avoided except for
         * temporary variables.
         * Common names for temporary variables are i, j, k, m, and n
         * for integers; c, d, and e for characters.
         *
         * Examples:
         *
         *
         *
         *     // variables for MountainBike class
         *     int speed = 0;
         *     int gear = 1;
         */

        String hiddenthingy = "Ha, ha, ha";


        /**Constant variables:
         Should be all uppercase with words separated by underscores (“_”).
         There are various constants used in predefined classes like Float, Long, String etc.

         Examples:
         public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
         public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
         public static final float NaN = 0.0f / 0.0f;
         **/

        final int MIN_WIDTH = 4;

        System.out.println("This is a recursive method.");
        message();
    }
}
