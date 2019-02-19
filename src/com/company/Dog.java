package com.company;
class Dog {
    //we want to create a Dog class that stores the information for
    //size, breed, name (variables) and we also want the action bark (method)
    int size;
    String breed;
    String name;

    void bark(){
        System.out.println("Ruff Ruff!");
    }
}

class DogTestDrive {
    public static void main (String[] args) {
        //dog test code goes here
        Dog d = new Dog();
                d.size = 40;
                d.breed = "Pitbull";
                d.name = "Chuckie";


                d.bark();
                System.out.println("Weight: " + d.size + " lbs");
                System.out.println("Breed: " + d.breed);
                System.out.println("Name: " + d.name);


    }
}
