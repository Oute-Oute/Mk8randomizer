package com.example.mk8randomizer.vehicles;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Parts implements Serializable {
    private ArrayList<Part> Wheel;
    private ArrayList<Part> Wing;
    private ArrayList<Part> Body;
    private ArrayList<Part> Kart;
    private ArrayList<Part> Bike;
    private ArrayList<Part> Quad;
    private boolean isSelectedKart= true, isSelectedBike=true, isSelectedQuad = true;

    public Parts() {

        Wheel = new ArrayList<>();
        Wing = new ArrayList<>();
        Body = new ArrayList<>();
        Kart = new ArrayList<>();
        Bike = new ArrayList<>();
        Quad = new ArrayList<>();

        //BODY
        //KARTS
        //Create Karts
        Part Kart1 = new Part("300 SL Roaster", "Kart");
        Part Kart2 = new Part("Beat Bolide", "Kart");
        Part Kart3 = new Part("Blue Falcon", "Kart");
        Part Kart4 = new Part("Caraveloce", "Kart");
        Part Kart5 = new Part("Chabriolet", "Kart");
        Part Kart6 = new Part("Autorhino", "Kart");
        Part Kart7 = new Part("Buggy Tanuki", "Kart");
        Part Kart8 = new Part("Cavalkart", "Kart");
        Part Kart9 = new Part("Intrepide", "Kart");
        Part Kart10 = new Part("Magikart", "Kart");
        Part Kart11 = new Part("Nautomobile", "Kart");
        Part Kart12 = new Part("Or", "Kart");
        Part Kart13 = new Part("Propulsar", "Kart");
        Part Kart14 = new Part("Proto", "Kart");
        Part Kart15 = new Part("Retro", "Kart");
        Part Kart16 = new Part("Sneakart", "Kart");
        Part Kart17 = new Part("Kart Standard", "Kart");
        Part Kart18 = new Part("TubulR3", "Kart");
        Part Kart19 = new Part("W25 Fleche DArgent", "Kart");
        Part Kart20 = new Part("GLA", "Kart");
        Part Kart21 = new Part("Mach-celere", "Kart");
        Part Kart22 = new Part("Paracoccinelle", "Kart");
        //Add Karts to ArrayList
        Kart.add(Kart1);
        Kart.add(Kart2);
        Kart.add(Kart3);
        Kart.add(Kart4);
        Kart.add(Kart5);
        Kart.add(Kart6);
        Kart.add(Kart7);
        Kart.add(Kart8);
        Kart.add(Kart9);
        Kart.add(Kart10);
        Kart.add(Kart11);
        Kart.add(Kart12);
        Kart.add(Kart13);
        Kart.add(Kart14);
        Kart.add(Kart15);
        Kart.add(Kart16);
        Kart.add(Kart17);
        Kart.add(Kart18);
        Kart.add(Kart19);
        Kart.add(Kart20);
        Kart.add(Kart21);
        Kart.add(Kart22);

        //BIKES
        //Create Bikes
        Part Bike1 = new Part("Cybertrombe", "Bike");
        Part Bike2 = new Part("Destrier De Legende", "Bike");
        Part Bike3 = new Part("Epervier", "Bike");
        Part Bike4 = new Part("Flamboyante", "Bike");
        Part Bike5 = new Part("Mecabecane", "Bike");
        Part Bike6 = new Part("Meteore", "Bike");
        Part Bike7 = new Part("Scooter", "Bike");
        Part Bike8 = new Part("Scootinette", "Bike");
        Part Bike9 = new Part("Sport GP", "Bike");
        Part Bike10 = new Part("Yoshimoto", "Bike");
        Part Bike11 = new Part("Moto Standard", "Bike");
        //Add Bikes to ArrayList
        Bike.add(Bike1);
        Bike.add(Bike2);
        Bike.add(Bike3);
        Bike.add(Bike4);
        Bike.add(Bike5);
        Bike.add(Bike6);
        Bike.add(Bike7);
        Bike.add(Bike8);
        Bike.add(Bike9);
        Bike.add(Bike10);
        Bike.add(Bike11);

        //QUADS
        //Create Quads
        Part Quad1 = new Part("Malecycle", "Quad");
        Part Quad2 = new Part("Quad Nounours", "Quad");
        Part Quad3 = new Part("Quad Wiggler", "Quad");
        Part Quad4 = new Part("Quad Standard", "Quad");
        //Add Quads to ArrayList
        Quad.add(Quad1);
        Quad.add(Quad2);
        Quad.add(Quad3);
        Quad.add(Quad4);

        //add all parts to ArrayList
        Body.addAll(Kart);
        Body.addAll(Bike);
        Body.addAll(Quad);

        //WHEELS
        //Create Wheels
        Part Wheel1 = new Part("Roue bois", "Wheel");
        Part Wheel2 = new Part("Roue Bouton", "Wheel");
        Part Wheel3 = new Part("Roue Classique", "Wheel");
        Part Wheel4 = new Part("Roue Classique Rouge", "Wheel");
        Part Wheel5 = new Part("Roue Coussin", "Wheel");
        Part Wheel6 = new Part("Roue Cyber Lisse", "Wheel");
        Part Wheel7 = new Part("Roue Eponge", "Wheel");
        Part Wheel8 = new Part("Roue Feuille", "Wheel");
        Part Wheel9 = new Part("Roue Gla", "Wheel");
        Part Wheel10 = new Part("Roue Hors-Piste", "Wheel");
        Part Wheel11 = new Part("Roue Hors-Piste Retro", "Wheel");
        Part Wheel12 = new Part("Roue Lisse", "Wheel");
        Part Wheel13 = new Part("Roue Mastodonte", "Wheel");
        Part Wheel14 = new Part("Roue Masto-Flamme", "Wheel");
        Part Wheel15 = new Part("Roue Metal", "Wheel");
        Part Wheel16 = new Part("Roue Or", "Wheel");
        Part Wheel17 = new Part("Roue Roller", "Wheel");
        Part Wheel18 = new Part("Roue Roller Azur", "Wheel");
        Part Wheel19 = new Part("Roue Standard", "Wheel");
        Part Wheel20 = new Part("Roue Standard Bleu", "Wheel");
        Part Wheel21 = new Part("Roue Triforce", "Wheel");

        //Add Wheels to ArrayList
        Wheel.add(Wheel1);
        Wheel.add(Wheel2);
        Wheel.add(Wheel3);
        Wheel.add(Wheel4);
        Wheel.add(Wheel5);
        Wheel.add(Wheel6);
        Wheel.add(Wheel7);
        Wheel.add(Wheel8);
        Wheel.add(Wheel9);
        Wheel.add(Wheel10);
        Wheel.add(Wheel11);
        Wheel.add(Wheel12);
        Wheel.add(Wheel13);
        Wheel.add(Wheel14);
        Wheel.add(Wheel15);
        Wheel.add(Wheel16);
        Wheel.add(Wheel17);
        Wheel.add(Wheel18);
        Wheel.add(Wheel19);
        Wheel.add(Wheel20);
        Wheel.add(Wheel21);

        //WINGS
        //Create Wings
        Part Wing1 = new Part("Aile Bowser Volant", "Wing");
        Part Wing2 = new Part("Aile Dendinaile", "Wing");
        Part Wing3 = new Part("Aile En Papier", "Wing");
        Part Wing4 = new Part("Aile Fleurie", "Wing");
        Part Wing5 = new Part("Aile Hylienne", "Wing");
        Part Wing6 = new Part("Aile Nuages", "Wing");
        Part Wing7 = new Part("Aile Or", "Wing");
        Part Wing8 = new Part("Aile Parachute", "Wing");
        Part Wing9 = new Part("Aile Parapente", "Wing");
        Part Wing10 = new Part("Aile Parapente MKTV", "Wing");
        Part Wing11 = new Part("Aile Planeur", "Wing");
        Part Wing12 = new Part("Aile Standard", "Wing");
        Part Wing13 = new Part("Aile Wario", "Wing");
        Part Wing14 = new Part("Ombrelle Peach", "Wing");

        //Add Wings to ArrayList
        Wing.add(Wing1);
        Wing.add(Wing2);
        Wing.add(Wing3);
        Wing.add(Wing4);
        Wing.add(Wing5);
        Wing.add(Wing6);
        Wing.add(Wing7);
        Wing.add(Wing8);
        Wing.add(Wing9);
        Wing.add(Wing10);
        Wing.add(Wing11);
        Wing.add(Wing12);
        Wing.add(Wing13);
        Wing.add(Wing14);
    }

    public void setSelectedBike(boolean b) {
        isSelectedBike = b;
    }
    public void setSelectedKart(boolean b) {
        isSelectedKart = b;
    }
    public void setSelectedQuad(boolean b) {
        isSelectedQuad = b;
    }

    //Getters
    public Part getBody(int i, int j) {
        switch (i) {
            case 0:
                return getKart(j);
            case 1:
                return getBike(j);
            case 2:
                return getQuad(j);
        }
        return null;
    }
    public ArrayList<Part> getBody(int bodyType) {
        switch (bodyType) {
            case 0: return getKart();
            case 1: return getBike();
            case 2: return getQuad();
        }
        return null;
    }
    private ArrayList<Part> getBody() {
        return Body;
    }

    private Part getQuad(int j) {
        return Quad.get(j);
    }
    private ArrayList<Part> getQuad() {
        return Quad;
    }

    private Part getBike(int j) {
        return Bike.get(j);
    }
    private ArrayList<Part> getBike() {
        return Bike;
    }

    private Part getKart(int j) {
        return Kart.get(j);
    }
    private ArrayList<Part> getKart() {
        return Kart;
    }

    public Part getWheel(int j) {
        return Wheel.get(j);
    }
    public ArrayList<Part> getWheel() {
        return Wheel;
    }

    public Part getWing(int j) {
        return Wing.get(j);
    }
    public ArrayList<Part> getWing() {
        return Wing;
    }

    public boolean isSelectedBike() {
        return isSelectedBike;
    }
    public boolean isSelectedKart() {
        return isSelectedKart;
    }
    public boolean isSelectedQuad() {
        return isSelectedQuad;
    }
    public boolean isSelectedBodyType(int i) {
        switch (i) {
            case 0: return isSelectedKart;
            case 1: return isSelectedBike;
            case 2: return isSelectedQuad;
        }
        return false;
    }

}