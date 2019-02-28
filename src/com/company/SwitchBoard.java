package com.company;

public class SwitchBoard {
    public static void main(String[] args) {
        int simpleSwitch = 2;
        switch(simpleSwitch) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                //break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            default:
                System.out.println("Not in the list!");
                break;
        }
    }
}
