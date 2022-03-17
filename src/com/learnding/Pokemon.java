package com.learnding;

public class Pokemon {
    String color;
    String type;
    Boolean canFly;

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

    public static void main(String[] args) {

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
