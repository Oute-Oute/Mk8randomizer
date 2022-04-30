package com.example.mk8randomizer.maps;

import java.util.ArrayList;

public class Cups {

    ArrayList<CupType> cupTypes = new ArrayList<>();
    private boolean multiSelect = false;


    public ArrayList<CupType> getCupTypes() {
        return cupTypes;
    }

    public Cups() {
        //CREATION DES MAPS

        //CLASSIQUE//
        //CHAMPIGNON
        Map map1 = new Map("Champidrome", "Switch");
        Map map2 = new Map("Parc Glougloop", "Switch");
        Map map3 = new Map("Piste aux délices", "Switch");
        Map map4 = new Map("Temple Thwomp", "Switch");
        //FLEUR
        Map map5 = new Map("Circuit Mario", "Switch");
        Map map6 = new Map("Promenade Toad", "Switch");
        Map map7 = new Map("Manoir trempé", "Switch");
        Map map8 = new Map("Cascades Maskass", "Switch");
        //ETOILE
        Map map9 = new Map("Aéroport Azur", "Switch");
        Map map10 = new Map("Lagon Tourbillon", "Switch");
        Map map11 = new Map("Club Mario", "Switch");
        Map map12 = new Map("Descente givrée", "Switch");
        //SPECIALE
        Map map13 = new Map("Voie céleste", "Switch");
        Map map14 = new Map("Désert Toussec", "Switch");
        Map map15 = new Map("Château de Bowser", "Switch");
        Map map16 = new Map("Route Arc-en-ciel", "Switch");

        //RETRO//
        //CARAPACE
        Map map17 = new Map("Prairie Meuh Meuh", "WII");
        Map map18 = new Map("Circuit Mario", "GBA");
        Map map19 = new Map("Plage Cheep Cheep", "DS");
        Map map20 = new Map("Autoroute Toad", "N64");
        //BANANE
        Map map21 = new Map("Désert Sec Sec", "GCN");
        Map map22 = new Map("Plaine Donut 3", "SNES");
        Map map23 = new Map("Autodrome royal", "N64");
        Map map24 = new Map("Forêt tropicale DK", "3DS");
        //FEUILLE
        Map map25 = new Map("Stade Wario", "DS");
        Map map26 = new Map("Royaume Sorbet", "GCN");
        Map map27 = new Map("Piste musicale", "3DS");
        Map map28 = new Map("Vallée Yoshi", "N64");
        //ECLAIR
        Map map29 = new Map("Horloge Tic-Tac", "DS");
        Map map30 = new Map("Égout Piranha", "3DS");
        Map map31 = new Map("Volcan grondant", "WII");
        Map map32 = new Map("Route Arc-en-ciel", "N64");

        //DLC//
        //OEUF
        Map map33 = new Map("Circuit Yoshi", "GCN");
        Map map34 = new Map("Arène d'Excitebike", "Switch");
        Map map35 = new Map("Route du dragon", "Switch");
        Map map36 = new Map("Mute City", "Switch");
        //TRIFORCE
        Map map37 = new Map("Mine Wario", "WII");
        Map map38 = new Map("Route Arc-en-ciel", "SNES");
        Map map39 = new Map("Station Glagla", "Switch");
        Map map40 = new Map("Circuit d'Hyrule", "Switch");
        //CROSSING
        Map map41 = new Map("Parc Baby", "GCN");
        Map map42 = new Map("Pays Fromage", "GBA");
        Map map43 = new Map("Passage Feuillage", "Switch");
        Map map44 = new Map("Animal Crossing", "Switch");
        //CLOCHETTE
        Map map45 = new Map("Koopapolis", "3DS");
        Map map46 = new Map("Route Ruban", "GBA");
        Map map47 = new Map("Métro Turbo", "Switch");
        Map map48 = new Map("Big Blue", "Switch");

        //PASS ADDITIONNEL//
        //TURBO DOREE
        Map map49 = new Map("Promenade à Paris", "TOUR");
        Map map50 = new Map("Circuit Toad", "3DS");
        Map map51 = new Map("Montagne Choco", "N64");
        Map map52 = new Map("Supermarché Coco", "WII");
        //MANEKI-NEKO
        Map map53 = new Map("Traversée de Tokyo", "TOUR");
        Map map54 = new Map("Corniche Champignon", "DS");
        Map map55 = new Map("Jardin volant", "GBA");
        Map map56 = new Map("Dojo ninja", "TOUR");
        //NAVET
        Map map57 = new Map("NC", "NC");
        Map map58 = new Map("NC", "NC");
        Map map59 = new Map("NC", "NC");
        Map map60 = new Map("NC", "NC");
        //HELICO
        Map map61 = new Map("NC", "NC");
        Map map62 = new Map("NC", "NC");
        Map map63 = new Map("NC", "NC");
        Map map64 = new Map("NC", "NC");
        //PIERRE
        Map map65 = new Map("NC", "NC");
        Map map66 = new Map("NC", "NC");
        Map map67 = new Map("NC", "NC");
        Map map68 = new Map("NC", "NC");
        //LUNE
        Map map69 = new Map("NC", "NC");
        Map map70 = new Map("NC", "NC");
        Map map71 = new Map("NC", "NC");
        Map map72 = new Map("NC", "NC");
        //FRUIT
        Map map73 = new Map("NC", "NC");
        Map map74 = new Map("NC", "NC");
        Map map75 = new Map("NC", "NC");
        Map map76 = new Map("NC", "NC");
        //BOOMERANG
        Map map77 = new Map("NC", "NC");
        Map map78 = new Map("NC", "NC");
        Map map79 = new Map("NC", "NC");
        Map map80 = new Map("NC", "NC");
        //PLUME
        Map map81 = new Map("NC", "NC");
        Map map82 = new Map("NC", "NC");
        Map map83 = new Map("NC", "NC");
        Map map84 = new Map("NC", "NC");
        //CERISES
        Map map85 = new Map("NC", "NC");
        Map map86 = new Map("NC", "NC");
        Map map87 = new Map("NC", "NC");
        Map map88 = new Map("NC", "NC");
        //GLAND
        Map map89 = new Map("NC", "NC");
        Map map90 = new Map("NC", "NC");
        Map map91 = new Map("NC", "NC");
        Map map92 = new Map("NC", "NC");
        //EPINES
        Map map93 = new Map("NC", "NC");
        Map map94 = new Map("NC", "NC");
        Map map95 = new Map("NC", "NC");
        Map map96 = new Map("NC", "NC");
        //FIN CREATION MAPS

        //CREATION CUPS
        Cup cup1 = new Cup("Coupe Champignon", map1, map2, map3, map4, "Classique", true);
        Cup cup2 = new Cup("Coupe Fleur", map5, map6, map7, map8, "Classique", true);
        Cup cup3 = new Cup("Coupe Étoile", map9, map10, map11, map12, "Classique", true);
        Cup cup4 = new Cup("Coupe Spéciale", map13, map14, map15, map16, "Classique", true);
        Cup cup5 = new Cup("Coupe Carapace", map17, map18, map19, map20, "Retro", true);
        Cup cup6 = new Cup("Coupe Banane", map21, map22, map23, map24, "Retro", true);
        Cup cup7 = new Cup("Coupe Feuille", map25, map26, map27, map28, "Retro", true);
        Cup cup8 = new Cup("Coupe Éclair", map29, map30, map31, map32, "Retro", true);
        Cup cup9 = new Cup("Coupe Œuf", map33, map34, map35, map36, "DLC", true);
        Cup cup10 = new Cup("Coupe Triforce", map37, map38, map39, map40, "DLC", true);
        Cup cup11 = new Cup("Coupe Crossing", map41, map42, map43, map44, "DLC", true);
        Cup cup12 = new Cup("Coupe Clochette", map45, map46, map47, map48, "DLC", true);
        Cup cup13 = new Cup("Coupe Turbo Dorée", map49, map50, map51, map52, "Pass Additionnel", true);
        Cup cup14 = new Cup("Coupe Maneki-Neko", map53, map54, map55, map56, "Pass Additionnel", true);
        Cup cup15 = new Cup("Coupe Navet", map57, map58, map59, map60, "Pass Additionnel", false);
        Cup cup16 = new Cup("Coupe Hélico", map61, map62, map63, map64, "Pass Additionnel", false);
        Cup cup17 = new Cup("Coupe Pierre", map65, map66, map67, map68, "Pass Additionnel", false);
        Cup cup18 = new Cup("Coupe Lune", map69, map70, map71, map72, "Pass Additionnel", false);
        Cup cup19 = new Cup("Coupe Fruit", map73, map74, map75, map76, "Pass Additionnel", false);
        Cup cup20 = new Cup("Coupe Boomerang", map77, map78, map79, map80, "Pass Additionnel", false);
        Cup cup21 = new Cup("Coupe Plume", map81, map82, map83, map84, "Pass Additionnel", false);
        Cup cup22 = new Cup("Coupe Cerises", map85, map86, map87, map88, "Pass Additionnel", false);
        Cup cup23 = new Cup("Coupe Gland", map89, map90, map91, map92, "Pass Additionnel", false);
        Cup cup24 = new Cup("Coupe à épines", map93, map94, map95, map96, "Pass Additionnel", false);
        //FIN CREATION CUPS

        //CREATION CUPS TYPE
        CupType cupType1 = new CupType("Classique", cup1, cup2, cup3, cup4);
        CupType cupType2 = new CupType("Retro", cup5, cup6, cup7, cup8);
        CupType cupType3 = new CupType("DLC", cup9, cup10, cup11, cup12);
        CupType cupType4 = new CupType("Pass Additionnel", cup13, cup14, cup15, cup16, cup17, cup18, cup19, cup20, cup21, cup22, cup23, cup24);
        //FIN CREATION CUPS TYPE

        //AJOUT CUP TYPES DANS LA LISTE
        cupTypes.add(cupType1);
        cupTypes.add(cupType2);
        cupTypes.add(cupType3);
        cupTypes.add(cupType4);
        //FIN AJOUT CUP TYPES DANS LA LISTE

        //FIN CONSTRUCTEUR


    }

    public boolean isMultiSelect() {
        return multiSelect;
    }
    public void setMultiSelect(boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

}
