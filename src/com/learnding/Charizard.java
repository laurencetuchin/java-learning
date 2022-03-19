package com.learnding;

import java.util.Random;

public class Charizard extends Pokemon {
    private String color;
    private String type;
    private Boolean canFly;

    public Charizard(String color, String type, Boolean canFly) {
        super(color, type, canFly);
    }

    @Override
    public void attack() {
        System.out.println("Charizard has a powerful attack");
        super.attack();
    }

    @Override
    public void defend() {
        System.out.println("Charizard has a powerful defence");
    }

    @Override
    public void specialMove() {
        System.out.println("Charizard's special move");
    }


}
