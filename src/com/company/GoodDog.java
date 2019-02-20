package com.company;
class GoodDog {
    //we want to create a Dog class that stores the information for
    //size, breed, name (variables) and we also want the action bark (method)

    private int size;

    //getter for size
    public int getSize() {
        return size;
    }

    //setter for size
    public void setSize(int s) {
        size = s;
    }

    //getter for breed
    private String breed;

    public String getBreed() {
        return breed;
    }

    //setter for breed
    public void setBreed(String b) {
        breed = b;
    }

    String name;

    void bark(){
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        }
        else if (size > 14) {
            System.out.println("Ruff! Ruff!");

        }
        else {
            System.out.println("Yip! Yip!");

        }
    }
}

class GoodDogTestDrive {
    public static void main (String[] args) {
        //dog test code goes here
        GoodDog one = new GoodDog();
        one.setSize(70);
        one.setBreed("Pitbull");
        one.name = "Chuckie";

        GoodDog two = new GoodDog();
        two.setSize(8);
        two.setBreed("Hound");
        two.name = "Sparky";


        one.bark();
        System.out.println("Weight: " + one.getSize() + " lbs");
        System.out.println("Breed: " + one.getBreed());
        System.out.println("Name: " + one.name);
        System.out.println();

        two.bark();
        System.out.println("Weight: " + two.getSize() + " lbs");
        System.out.println("Breed: " + two.getBreed());
        System.out.println("Name: " + two.name);


        GoodDog[] pets;
        System.out.println("Creating GoodDog array...");
        pets = new GoodDog[7];
        System.out.println("Creating GoodDog objects and assigning them to the array...");
        pets[0] = new GoodDog();
        pets[1] = new GoodDog();
        System.out.println("Calling methods on GoodDog objects in array...");
        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(8);




    }
}
