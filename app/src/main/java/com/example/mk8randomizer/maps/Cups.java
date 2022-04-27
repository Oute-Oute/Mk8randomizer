package com.example.mk8randomizer.maps;

import java.util.ArrayList;

public class Cups {
    ArrayList<Cup> cups = new ArrayList<>();
    private boolean multiSelect = false;
    public ArrayList<Cup> getCups() {
        return cups;
    }

    public boolean isMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public Cups() {
        //CREATION DES MAPS
        //CHAMPIGNON
        Map map1 = new Map(1, "Champidrome", "link", "Switch");
        Map map2 = new Map(1, "Parc Glougloop", "link", "Switch");
        Map map3 = new Map(1, "Piste aux délices", "link", "Switch");
        Map map4 = new Map(1, "Temple Thwomp", "link", "Switch");
        //FLEUR
        Map map5 = new Map(1, "Circuit Mario", "link", "Switch");
        Map map6 = new Map(1, "Promenade Toad", "link", "Switch");
        Map map7 = new Map(1, "Manoir trempé", "link", "Switch");
        Map map8 = new Map(1, "Cascades Maskass", "link", "Switch");
        //ETOILE
        Map map9 = new Map(1, "Aéroport Azur", "link", "Switch");
        Map map10 = new Map(1, "Lagon Tourbillon", "link", "Switch");
        Map map11 = new Map(1, "Club Mario", "link", "Switch");
        Map map12 = new Map(1, "Descente givrée", "link", "Switch");
        //SPECIALE
        Map map13 = new Map(1, "Voie céleste", "link", "Switch");
        Map map14 = new Map(1, "Désert Toussec", "link", "Switch");
        Map map15 = new Map(1, "Château de Bowser", "link", "Switch");
        Map map16 = new Map(1, "Route Arc-en-ciel", "link", "Switch");
        //RETRO//
        //CARAPACE
        Map map17 = new Map(1, "Prairie Meuh Meuh", "link", "WII");
        Map map18 = new Map(1, "Circuit Mario", "link", "GBA");
        Map map19 = new Map(1, "Plage Cheep Cheep", "link", "DS");
        Map map20 = new Map(1, "Autoroute Toad", "link", "N64");
        //BANANE
        Map map21 = new Map(1, "Désert Sec Sec", "link", "GCN");
        Map map22 = new Map(1, "Plaine Donut 3", "link", "SNES");
        Map map23 = new Map(1, "Autodrome royal", "link", "N64");
        Map map24 = new Map(1, "Forêt tropicale DK", "link", "3DS");
        //FEUILLE
        Map map25 = new Map(1, "Stade Wario", "link", "DS");
        Map map26 = new Map(1, "Royaume Sorbet", "link", "GCN");
        Map map27 = new Map(1, "Piste musicale", "link", "3DS");
        Map map28 = new Map(1, "Vallée Yoshi", "link", "N64");
        //ECLAIR
        Map map29 = new Map(1, "Horloge Tic-Tac", "link", "DS");
        Map map30 = new Map(1, "Égout Piranha", "link", "3DS");
        Map map31 = new Map(1, "Volcan grondant", "link", "WII");
        Map map32 = new Map(1, "Route Arc-en-ciel", "link", "N64");
        //DLC//
        //OEUF
        Map map33 = new Map(1, "Circuit Yoshi", "link", "GCN");
        Map map34 = new Map(1, "Arène d'Excitebike", "link", "Switch");
        Map map35 = new Map(1, "Route du dragon", "link", "Switch");
        Map map36 = new Map(1, "Mute City", "link", "Switch");
        //TRIFORCE
        Map map37 = new Map(1, "Mine Wario", "link", "WII");
        Map map38 = new Map(1, "Route Arc-en-ciel", "link", "SNES");
        Map map39 = new Map(1, "Station Glagla", "link", "Switch");
        Map map40 = new Map(1, "Circuit d'Hyrule", "link", "Switch");
        //CROSSING
        Map map41 = new Map(1, "Parc Baby", "link", "GCN");
        Map map42 = new Map(1, "Pays Fromage", "link", "GBA");
        Map map43 = new Map(1, "Passage Feuillage", "link", "Switch");
        Map map44 = new Map(1, "Animal Crossing", "link", "Switch");
        //CLOCHETTE
        Map map45 = new Map(1, "Koopapolis", "link", "3DS");
        Map map46 = new Map(1, "Route Ruban", "link", "GBA");
        Map map47 = new Map(1, "Métro Turbo", "link", "Switch");
        Map map48 = new Map(1, "Big Blue", "link", "Switch");
        //PASS ADDITIONNEL//
        //TURBO DOREE
        Map map49 = new Map(1, "Promenade à Paris", "link", "TOUR");
        Map map50 = new Map(1, "Circuit Toad", "link", "3DS");
        Map map51 = new Map(1, "Montagne Choco", "link", "N64");
        Map map52 = new Map(1, "Supermarché Coco", "link", "WII");
        //MANEKI-NEKO
        Map map53 = new Map(1, "Traversée de Tokyo", "link", "TOUR");
        Map map54 = new Map(1, "Corniche Champignon", "link", "DS");
        Map map55 = new Map(1, "Jardin volant", "link", "GBA");
        Map map56 = new Map(1, "Dojo ninja", "link", "TOUR");
        //NAVET
        Map map57 = new Map(0, "NC", "NC", "NC");
        Map map58 = new Map(0, "NC", "NC", "NC");
        Map map59 = new Map(0, "NC", "NC", "NC");
        Map map60 = new Map(0, "NC", "NC", "NC");
        //HELICO
        Map map61 = new Map(0, "NC", "NC", "NC");
        Map map62 = new Map(0, "NC", "NC", "NC");
        Map map63 = new Map(0, "NC", "NC", "NC");
        Map map64 = new Map(0, "NC", "NC", "NC");
        //PIERRE
        Map map65 = new Map(0, "NC", "NC", "NC");
        Map map66 = new Map(0, "NC", "NC", "NC");
        Map map67 = new Map(0, "NC", "NC", "NC");
        Map map68 = new Map(0, "NC", "NC", "NC");
        //LUNE
        Map map69 = new Map(0, "NC", "NC", "NC");
        Map map70 = new Map(0, "NC", "NC", "NC");
        Map map71 = new Map(0, "NC", "NC", "NC");
        Map map72 = new Map(0, "NC", "NC", "NC");
        //FRUIT
        Map map73 = new Map(0, "NC", "NC", "NC");
        Map map74 = new Map(0, "NC", "NC", "NC");
        Map map75 = new Map(0, "NC", "NC", "NC");
        Map map76 = new Map(0, "NC", "NC", "NC");
        //BOOMERANG
        Map map77 = new Map(0, "NC", "NC", "NC");
        Map map78 = new Map(0, "NC", "NC", "NC");
        Map map79 = new Map(0, "NC", "NC", "NC");
        Map map80 = new Map(0, "NC", "NC", "NC");
        //PLUME
        Map map81 = new Map(0, "NC", "NC", "NC");
        Map map82 = new Map(0, "NC", "NC", "NC");
        Map map83 = new Map(0, "NC", "NC", "NC");
        Map map84 = new Map(0, "NC", "NC", "NC");
        //CERISES
        Map map85 = new Map(0, "NC", "NC", "NC");
        Map map86 = new Map(0, "NC", "NC", "NC");
        Map map87 = new Map(0, "NC", "NC", "NC");
        Map map88 = new Map(0, "NC", "NC", "NC");
        //GLAND
        Map map89 = new Map(0, "NC", "NC", "NC");
        Map map90 = new Map(0, "NC", "NC", "NC");
        Map map91 = new Map(0, "NC", "NC", "NC");
        Map map92 = new Map(0, "NC", "NC", "NC");
        //EPINES
        Map map93 = new Map(0, "NC", "NC", "NC");
        Map map94 = new Map(0, "NC", "NC", "NC");
        Map map95 = new Map(0, "NC", "NC", "NC");
        Map map96 = new Map(0, "NC", "NC", "NC");
        //FIN CREATION MAPS

        //CREATION CUPS
        Cup cup1 = new Cup("Coupe Champignon", map1, map2, map3, map4, "Classique");
        Cup cup2 = new Cup("Coupe Fleur", map5, map6, map7, map8, "Classique");
        Cup cup3 = new Cup("Coupe Étoile", map9, map10, map11, map12, "Classique");
        Cup cup4 = new Cup("Coupe Spéciale", map13, map14, map15, map16, "Classique");
        Cup cup5 = new Cup("Coupe Carapace", map17, map18, map19, map20, "Retro");
        Cup cup6 = new Cup("Coupe Banane", map21, map22, map23, map24, "Retro");
        Cup cup7 = new Cup("Coupe Feuille", map25, map26, map27, map28, "Retro");
        Cup cup8 = new Cup("Coupe Éclair", map29, map30, map31, map32, "Retro");
        Cup cup9 = new Cup("Coupe Œuf", map33, map34, map35, map36, "DLC");
        Cup cup10 = new Cup("Coupe Triforce", map37, map38, map39, map40, "DLC");
        Cup cup11 = new Cup("Coupe Crossing", map41, map42, map43, map44, "DLC");
        Cup cup12 = new Cup("Coupe Clochette", map45, map46, map47, map48, "DLC");
        Cup cup13 = new Cup("Coupe Turbo Dorée", map49, map50, map51, map52, "Pass Additionnel");
        Cup cup14 = new Cup("Coupe Maneki-Neko", map53, map54, map55, map56, "Pass Additionnel");
        Cup cup15 = new Cup("Coupe Navet", map57, map58, map59, map60, "Pass Additionnel");
        Cup cup16 = new Cup("Coupe Hélico", map61, map62, map63, map64, "Pass Additionnel");
        Cup cup17 = new Cup("Coupe Pierre", map65, map66, map67, map68, "Pass Additionnel");
        Cup cup18 = new Cup("Coupe Lune", map69, map70, map71, map72, "Pass Additionnel");
        Cup cup19 = new Cup("Coupe Fruit", map73, map74, map75, map76, "Pass Additionnel");
        Cup cup20 = new Cup("Coupe Boomerang", map77, map78, map79, map80, "Pass Additionnel");
        Cup cup21 = new Cup("Coupe Plume", map81, map82, map83, map84, "Pass Additionnel");
        Cup cup22 = new Cup("Coupe Cerises", map85, map86, map87, map88, "Pass Additionnel");
        Cup cup23 = new Cup("Coupe Gland", map89, map90, map91, map92, "Pass Additionnel");
        Cup cup24 = new Cup("Coupe à épines", map93, map94, map95, map96, "Pass Additionnel");
        //FIN CREATION CUPS
        //AJOUT CUPS DANS LA LISTE
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
        cups.add(cup13);
        cups.add(cup14);
        cups.add(cup15);
        cups.add(cup16);
        cups.add(cup17);
        cups.add(cup18);
        cups.add(cup19);
        cups.add(cup20);
        cups.add(cup21);
        cups.add(cup22);
        cups.add(cup23);
        cups.add(cup24);
        //FIN AJOUT CUPS DANS LA LISTE
        //FIN CONSTRUCTEUR


    }
}
