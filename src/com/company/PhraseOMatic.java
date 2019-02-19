package com.company;

public class PhraseOMatic {
    public static void main (String[] args){
        //make three sets of words to choose from. Add your own!
        String[] wordListNames = {"Mark", "Frank", "Luke", "Joe", "Steve"};
        String[] wordListColors = {"red", "blue", "yellow", "green"};
        String[] wordListGames = {"Dead Cells", "Bloodborne", "Super Mario Brothers"};

        System.out.println(wordListNames[1] + " wrote this:");

        int namesLength = wordListNames.length;
        int colorsLength = wordListColors.length;
        int gamesLength = wordListGames.length;

        //generate three random numbers
        //cast into int so we get back integers from namesLength, instead of a non whole number double
        int randomNumberNames = (int) (Math.random() * namesLength);
        int randomNumberColors = (int) (Math.random() * colorsLength);
        int randomNumberGames = (int) (Math.random() * gamesLength);

        //now build a phrase
        String phrase = "All of a sudden, " + wordListNames[randomNumberNames] + " burst" +
                " through the door, screaming about how " + wordListGames[randomNumberGames] +
                " was the best game ever and how much he loved the color " + wordListColors[randomNumberColors] + ".";

        System.out.println(phrase);
    }
}
