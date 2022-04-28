package com.example.mk8randomizer.maps;

import java.util.ArrayList;

public class CupType {
    String name;
    ArrayList<Cup> cups = new ArrayList<>();
    private boolean multiSelect = false;


    public ArrayList<Cup> getCups() {
        return cups;
    }

    public CupType(String name, Cup cup1, Cup cup2, Cup cup3, Cup cup4) {
        this.name = name;
        cups.add(cup1);
        cups.add(cup2);
        cups.add(cup3);
        cups.add(cup4);
    }

    public CupType(String name, Cup cup1, Cup cup2, Cup cup3, Cup cup4, Cup cup5, Cup cup6, Cup cup7, Cup cup8, Cup cup9, Cup cup10, Cup cup11, Cup cup12) {
        this.name = name;
        cups.add(cup1);
        cups.add(cup2);
        cups.add(cup3);
        cups.add(cup4);
        cups.add(cup5);
        cups.add(cup6);
        cups.add(cup7);
        cups.add(cup8);
        cups.add(cup9);
        cups.add(cup10);
        cups.add(cup11);
        cups.add(cup12);
    }

    public boolean isMultiSelect() {
        return multiSelect;
    }
    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

}
