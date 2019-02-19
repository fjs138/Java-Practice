package com.company;

public class IfTest {
    public static void main (String[] args) {
        int x = 2;
        if (x == 3) {
         System.out.println("X must be 3.");
        } else {
            System.out.println("X is not 3.");
        }
        System.out.println("This runs no matter what.");
    }
}

class ifTest2 {
    public static void main (String[] args) {
        int x = 2;
        if (x==3){
            System.out.println("X must be 3.");
        }else {
            System.out.println("X is NOT 3.");
        }
        {
            System.out.println("This always is displayed.");
        }
    }
}