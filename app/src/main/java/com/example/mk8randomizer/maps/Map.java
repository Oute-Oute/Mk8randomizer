package com.example.mk8randomizer.maps;

public class Map {
    float probability;
    String name;
    String image;
    String console;

    public Map(int probability, String name, String image, String console) {
        this.probability = probability;
        this.name = name;
        this.image = image;
        this.console = console;
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
