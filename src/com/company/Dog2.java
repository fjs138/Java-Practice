package com.company;

class Dog2 {
    /**
     * 2nd dog file, kept original for posterity under Dog.java
     */
    private String name;
    public static void main(String[] args) {
        //make a Dog2 object and access it
        Dog2 dogFirst = new Dog2();
        dogFirst.bark();
        dogFirst.name = "Bart";

        //now make a Dog2 array
        Dog2[] myDogs = new Dog2[3];
        //and put some dogs in it
        myDogs[0] = new Dog2();
        myDogs[1] = new Dog2();
        myDogs[2] = dogFirst;

        //now access the Dogs using the array references
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        //hmmm... what is myDogs[2] name?
        System.out.println("Last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;

        }
    }
        public void bark() {
           System.out.println(name + " says Ruff!");
    }
    public void eat() { }
    public void chaseCat() { }
}
