package com.company;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}

 class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the Dim";
        one.genre = "Tragic";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "The Last Ecto Cooler";
        two.genre = "Comedy";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Terra Flopps";
        three.genre = "Drama";
        three.rating = 125;

    }
}