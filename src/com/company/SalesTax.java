package com.company;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your total bill: ");
        double totalBill = input.nextDouble();

        double tax = 1.06;

        double totalWithTax = totalBill * tax;

        System.out.println("Your total bill with six percent sales tax is: " + totalWithTax);
        System.out.println("Thank you for using the system!");
    }
}
