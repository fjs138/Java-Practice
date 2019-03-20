package com.company;

public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        System.out.println("Initial tuition is $10k");

        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;

        }
            System.out.println("It would take " + year + " years to reach $20k in tuition.");
        System.out.println("Tuition would be $" + (int)tuition + ".");

    }
}
