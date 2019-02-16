package com.company;

public class SystemOutPrintTips {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Relationship among the \"System\" class, \"out\" object, and the \"print\" and" +
                "\"println\" methods");
        System.out.println();
        System.out.println();
        System.out.println("[SYSTEM]");
        System.out.println("[class]");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("[OUT]");
        System.out.println("[object]");
        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  -----------[PRINT]");
        System.out.println("             [method]");

        System.out.println("  |");
        System.out.println("  |");
        System.out.println("  -----------[PRINTLN]");
        System.out.println("             [method]");

        System.out.println();
        System.out.println();
        System.out.println(" The System class is part of the Java API. It has member OBJECTS and METHODS for per-" +
                "forming system-level operations, such as sending output to the console.");

        System.out.println();
        System.out.println();
        System.out.println(" The \"out\" OBJECT is a member of the \"System\" CLASS. It provides METHODS for sending" +
                "output to the screen.");


        System.out.println();
        System.out.println();
        System.out.println(" The \"print\" and \"println\" METHODS are members of the \"out\" OBJECT. They actually" +
                "perform the work of writing characters on the screen.");

    }
}