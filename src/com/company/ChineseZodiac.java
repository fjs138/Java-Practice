package com.company;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println("The Chinese Zodiac is based on a 12 year cycle." +
                "\nThis includes the monkey, rooster, dog, pig, rat, tiger," +
                "rabbit, dragon, snake, horse, or sheep.");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0: System.out.println("monkey"); break;
            case 1: System.out.println("rooster"); break;
            case 2: System.out.println("dog"); break;
            case 3: System.out.println("pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("ox"); break;
            case 6: System.out.println("tiger"); break;
            case 7: System.out.println("rabbit"); break;
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break;
            case 10: System.out.println("horse"); break;
            case 11: System.out.println("sheep"); break;
            default: System.out.println("Error: invalid status");
            System.exit(1);

        }

    }

    }

