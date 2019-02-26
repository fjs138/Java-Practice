package com.company;

public class NamedConstants {
    public static void main(String[] args) {
        double amount, balance;
        balance = 2;
        amount = balance * 0.069;

        // lets do this instead:
        final double INTEREST_RATE = 0.069;
        amount = balance * INTEREST_RATE;

        double area, radius;
        radius = (int)(Math.random()*100);
        area = Math.PI * radius * radius;
        System.out.println(area);

    }
}
