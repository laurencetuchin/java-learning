package com.learnding;

public class Surfer {

    String name;
    String stance;
    Boolean isCurrentChampion;
    String country;


    public Surfer(String name, String stance, Boolean isCurrentChampion, String country)
    {
        this.name = name;
        this.stance = stance;
        this.isCurrentChampion = isCurrentChampion;
        this.country = country;
    }

    public void printSurfer() {
        System.out.println("Name "+name);
        System.out.println("Stance "+stance);
        System.out.println("Are they the current champion? "+isCurrentChampion);
        System.out.println("They are from "+country);
    }

}
