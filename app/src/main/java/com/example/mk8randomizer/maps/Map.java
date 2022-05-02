package com.example.mk8randomizer.maps;

import java.io.Serializable;

public class Map implements Serializable {
    String name;
    String console;
    boolean alreadySelected;

    public Map(String name, String console, Boolean alreadySelected) {
        this.name = name;
        this.console = console;
        this.alreadySelected = alreadySelected;
    }

    public String getName() {
        return name;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public Boolean getAlreadySelected() {
        return alreadySelected;
    }

    public void setAlreadySelected(Boolean alreadySelected) {
        this.alreadySelected = alreadySelected;
    }
}
