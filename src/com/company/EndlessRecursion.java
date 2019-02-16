/*Packages:
 The prefix of a unique package name is always written in all-lowercase ASCII letters
 and should be one of the top-level domain names, like com, edu, gov, mil, net, org.
 Subsequent components of the package name vary according to an organisation’s own
 internal naming conventions.
 Examples:

 com.sun.eng
 com.apple.quicktime.v2

 // java.lang packet in JDK
 java.lang
 */

package com.company;

/** This class has a recursive method. */

/** This type of comment will be picked up by Javadoc. Javadoc is a tool that
 * parses the declarations and documentation comments in a set of source files
 * and produces a set of HTML pages describing the classes, interfaces,
 * constructors, methods, and fields. */

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
    static <string> void message()
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

        /* Oh no, a silly unused variable! */

        final int MIN_WIDTH = 4;

        System.out.println("This is a recursive method.");
        message();
    }
}
