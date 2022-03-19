package com.learnding;

public class Pokemon {
    String color;
    String type;
    Boolean canFly;
//    String[] pokemon;
    String[] pokemon = {"color","type"};
//    pokemon[0] = "test";

    public Pokemon(String color, String type, Boolean canFly) {
        this.color = color;
        this.type = type;
        this.canFly = canFly;
    }

    public String getColor() {
        System.out.println(color);
        return color;
//        System.out.println(color);
    }

    public void pokeInfo() {
        System.out.println("The pokemon is "+color+"\nThey are a "+type+"type."+"\nThey are able to fly?"+canFly);
    }

    public void attack() {
        System.out.println("The pokemon attacked");
    }

    public void defend() {
        System.out.println("The pokemon defended");
    }

    public void specialMove() {
        System.out.println("The pokemon did a special move");
    }


}
