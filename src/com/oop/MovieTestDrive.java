package com.oop;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Wolf of wall st";
        one.genre = "Comedy";
        one.rating = 5;

        Movie two = new Movie();
        two.title = "Django Unchained";
        two.genre = "Thriller";
        two.rating = 5;
        two.playMovie();

        Movie three = new Movie();
        three.title = "The Batman";
        three.genre = "Superhero";
        three.rating = 5;

    }
}
