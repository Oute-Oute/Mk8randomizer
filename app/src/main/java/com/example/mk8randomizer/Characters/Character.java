package com.example.mk8randomizer.Characters;

import java.io.Serializable;
import java.util.Locale;

public class Character implements Serializable {

    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getImageName() {
        String name = this.getName();
        name = name.toLowerCase(Locale.ROOT);
        name = name.replace(" ", "_");
        name = name.replace("-", "_");
        name = name.replace("é", "e");
        name = name.replace("à", "a");
        name = name.replace("œ", "oe");
        name = name.replace("è", "e");
        name = name.replace("ê", "e");
        name = name.replace("î", "i");
        name = name.replace("ï", "i");
        name = name.replace("ü", "u");
        name = name.replace("ç", "c");
        name = name.replace("ù", "u");
        name = name.replace("ô", "o");
        name = name.replace("î", "i");
        name = name.replace("ï", "i");
        name = name.replace("û", "u");
        name = name.replace(".", "");
        name = name.replace("'", "");
        name= "character_" + name+"_icon";
        return name;
    }
}

