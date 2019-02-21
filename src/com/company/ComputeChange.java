package com.company;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. Prompt the user to enter the amount as a decimal number, such as 11.56
        System.out.println("Please enter the amount in double format" +
                "for example, 11.56");
        double amount = input.nextDouble();
        System.out.println("Thank you.");
        //2. Convert the amount (e.g., 11.56 ) into cents ( 1156 ).
        //here we cast(?) the double * 100 into an int, rather than the double directly
        //this is because we would lose the decimal point data, whereas we keep
        // the data after it has been multiplied by 100 in this scenario
        int cents = (int)(amount * 100);
        //3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
        //the cents remainder 100 .
        int dollars = cents / 100;
        cents = cents % 100;
        //4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
        //cents using the remaining cents remainder 25 .
        int quarters = cents / 25;
        cents = cents % 25;
        //5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
        //cents using the remaining cents remainder 10 .
        int dimes = cents / 10;
        cents = cents % 10;
        //6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining
        //cents using the remaining cents remainder 5 .
        int nickels = cents / 5;
        cents = cents % 5;
        //7. The remaining cents are the pennies.
        int pennies = cents;
        //8. Display the result.
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + dollars + " dollars");
        System.out.println(" " + quarters + " quarters");
        System.out.println(" " + dimes + " dimes");
        System.out.println(" " + nickels + " nickels");
        System.out.println(" " + pennies + " pennies");


    }
}
