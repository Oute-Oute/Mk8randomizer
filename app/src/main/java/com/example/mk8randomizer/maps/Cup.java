package com.example.mk8randomizer.maps;

import java.util.ArrayList;

public class Cup {
    String image;
    ArrayList<Map> maps = new ArrayList<>();
    float probability;
    String type;
    Boolean selected= true;
    private String name;

    Cup(String name, Map map1, Map map2, Map map3, Map map4, String type){
        this.name = name;
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        this.type = type;
    }

    public Map getRandomMap() {
        float random = (float) Math.random();
        if (random < probability) {
            return maps.get(0);
        } else {
            return maps.get(1);
        }
    }

    public void addMap(Map map) {
        maps.add(map);
    }

    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    public Map getMap(int index) {
        return maps.get(index);
    }

    public int getSize() {
        return maps.size();
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean select) {
        this.selected = select;
    }
}