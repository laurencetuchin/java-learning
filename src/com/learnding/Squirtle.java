package com.learnding;

public class Squirtle extends Pokemon {
    private String color;
    private String type;
    private Boolean canFly;


    public Squirtle(String color, String type, Boolean canFly) {
        super(color, type, canFly);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Boolean getCanFly() {
        return canFly;
    }

    @Override
    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }
}
