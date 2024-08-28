package com.example.mk8randomizer.Characters;

import java.io.Serializable;
import java.util.ArrayList;

public class Characters implements Serializable {
    private ArrayList<ArrayList<Character>> characters;
    static ArrayList<Character> lightCharacters;
    static ArrayList<Character> mediumCharacters;
    static ArrayList<Character> heavyCharacters;
    public static Character mii = new Character("Mii");

    public Characters() {
        //Array Creation
        lightCharacters = new ArrayList<>();
        mediumCharacters = new ArrayList<>();
        heavyCharacters = new ArrayList<>();
        characters = new ArrayList<>();
        characters.add(lightCharacters);
        characters.add(mediumCharacters);
        characters.add(heavyCharacters);

        //Light Characters creation
        Character light1 = new Character("Bébé Mario");
        Character light2 = new Character("Bébé Luigi");
        Character light3 = new Character("Bébé Peach");
        Character light4 = new Character("Bébé Daisy");
        Character light5 = new Character("Bébé Harmonie");
        Character light6 = new Character("Toad");
        Character light7 = new Character("Toadette");
        Character light8 = new Character("Koopa");
        Character light9 = new Character("Maskass");
        Character light10 = new Character("Lakitu");
        Character light11 = new Character("Wendy");
        Character light12 = new Character("Larry");
        Character light13 = new Character("Lemmy");
        Character light14 = new Character("Marie");
        Character light15 = new Character("Bowser Jr.");
        Character light16 = new Character("Skelerex");

        //Medium Characters creation
        Character medium1 = new Character("Mario");
        Character medium2 = new Character("Luigi");
        Character medium3 = new Character("Peach");
        Character medium4 = new Character("Daisy");
        Character medium5 = new Character("Yoshi");
        Character medium6 = new Character("Mario Tanuki");
        Character medium7 = new Character("Peach Chat");
        Character medium8 = new Character("Ludwig");
        Character medium9 = new Character("Iggy");
        Character medium10 = new Character("Villageois");
        Character medium11 = new Character("Villageoise");
        Character medium12 = new Character("Garçon Inkling");
        Character medium13 = new Character("Fille Inkling");

        //Heavy Characters creation
        Character heavy1 = new Character("Bowser");
        Character heavy2 = new Character("Donkey Kong");
        Character heavy3 = new Character("Wario");
        Character heavy4 = new Character("Waluigi");
        Character heavy5 = new Character("Harmonie");
        Character heavy6 = new Character("Roy");
        Character heavy7 = new Character("Morton");
        Character heavy8 = new Character("Link");
        Character heavy9 = new Character("Bowser Squelette");
        Character heavy10 = new Character("Roi Boo");
        Character heavy11 = new Character("Mario de Metal");
        Character heavy12 = new Character("Peach d'Or Rose");

        //DLC characters
        Character DLC1 = new Character("Diddy Kong");
        Character DLC2 = new Character("Funky Kong");
        Character DLC3 = new Character("Pauline");
        Character DLC4 = new Character("Birdo");
        Character DLC5 = new Character("Plante Piranha");
        Character DLC6 = new Character("Wiggler");
        Character DLC7 = new Character("Kamek");
        Character DLC8 = new Character("Peachette");




        //Add Characters to ArrayList
        //Light Characters
        lightCharacters.add(light1);
        lightCharacters.add(light2);
        lightCharacters.add(light3);
        lightCharacters.add(light4);
        lightCharacters.add(light5);
        lightCharacters.add(light6);
        lightCharacters.add(light7);
        lightCharacters.add(light8);
        lightCharacters.add(light9);
        lightCharacters.add(light10);
        lightCharacters.add(light11);
        lightCharacters.add(light12);
        lightCharacters.add(light13);
        lightCharacters.add(light14);
        lightCharacters.add(light15);
        lightCharacters.add(light16);
        lightCharacters.add(DLC7);
        //Medium Characters
        mediumCharacters.add(medium1);
        mediumCharacters.add(medium2);
        mediumCharacters.add(medium3);
        mediumCharacters.add(medium4);
        mediumCharacters.add(medium5);
        mediumCharacters.add(medium6);
        mediumCharacters.add(medium7);
        mediumCharacters.add(medium8);
        mediumCharacters.add(medium9);
        mediumCharacters.add(medium10);
        mediumCharacters.add(medium11);
        mediumCharacters.add(medium12);
        mediumCharacters.add(medium13);
        mediumCharacters.add(DLC1);
        mediumCharacters.add(DLC4);
        mediumCharacters.add(DLC6);
        mediumCharacters.add(DLC8);
        //Heavy Characters
        heavyCharacters.add(heavy1);
        heavyCharacters.add(heavy2);
        heavyCharacters.add(heavy3);
        heavyCharacters.add(heavy4);
        heavyCharacters.add(heavy5);
        heavyCharacters.add(heavy6);
        heavyCharacters.add(heavy7);
        heavyCharacters.add(heavy8);
        heavyCharacters.add(heavy9);
        heavyCharacters.add(heavy10);
        heavyCharacters.add(heavy11);
        heavyCharacters.add(heavy12);
        heavyCharacters.add(DLC2);
        heavyCharacters.add(DLC3);
        heavyCharacters.add(DLC5);



    }



    //Getters
    public static ArrayList<Character> getLightCharacters() {
        return lightCharacters;
    }

    public static ArrayList<Character> getMediumCharacters() {
        return mediumCharacters;
    }

    public static ArrayList<Character> getHeavyCharacters() {
        return heavyCharacters;
    }
}
