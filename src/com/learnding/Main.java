package com.learnding;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Surfer jjf = new Surfer("JJF","Natural", false, "USA");
//        jjf.printSurfer();
//
//        Surfer italoFerreira = new Surfer("Italo Ferreira", "goofy", true, "Brazil");
//        italoFerreira.printSurfer();
//        Surfer gabrielMedina = new Surfer("Gabriel Medina", "goofy", false, "Brazil");
//        gabrielMedina.printSurfer();

        Pokemon charizard1 = new Pokemon("Orange", "Fire", true);
        Pokemon charizard = new Charizard("Orange", "Fire", true);
        charizard.attack();
//        System.out.println(charizard1.getColor());
        charizard1.getColor();
        charizard1.pokeInfo();

        Pokemon[] pokemon = new Pokemon[4];

        pokemon[0] = new Pokemon("red","fire", true);
        pokemon[1] = new Pokemon("red","fire", true);
        pokemon[0].setColor("Blue");
        String x = pokemon[0].getColor();
        pokemon[2] = new Charizard("red","fire",true);
        pokemon[3] = new Squirtle("blue","water",false);
//        System.out.println(x);


//        Looping through polymorphic classes
        for (int i = 0; i < pokemon.length; i++) {
            pokemon[i].attack();
            pokemon[i].defend();
        }

    }

}
