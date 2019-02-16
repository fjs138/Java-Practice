package com.company;

public class ShowLogicErrors {
    public static void main(String[] args){

       /**Logic errors occur when a program does not perform the way it was intended to. Errors of this
        * kind occur for many different reasons.
        * For example, suppose you wrote a program to convert 35 degrees C to F:
        *  */
        System.out.println();
        System.out.println("This answer below is incorrect!");
        double fDegrees1 =( ( 9 / 5 ) * 35 + 32 );
        System.out.println( "Celsius 35 is " + fDegrees1 + " Fahrenheit degree " );

        /**In Java, the division for integers is the quotient—the fractional part is truncated—
         * so in Java 9 / 5 is 1 . To get the correct result, you need to use 9.0 / 5 , which results in 1.8
         *  */
        System.out.println();
        System.out.println("This answer below is correct!");
        double fDegrees2 =( ( 9.0 / 5 ) * 35 + 32 );
        System.out.println( "Celsius 35 is " + fDegrees2 + " Fahrenheit degree " );


    }
}
