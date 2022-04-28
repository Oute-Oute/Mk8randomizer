package com.example.mk8randomizer.maps;

public class Map {
    String name;
    String console;

    public Map(String name, String console) {
        this.name = name;
        this.console = console;
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
}
