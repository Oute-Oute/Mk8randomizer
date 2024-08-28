package com.example.mk8randomizer.maps;

import java.io.Serializable;
import java.util.ArrayList;

public class Cups implements Serializable{

    ArrayList<CupType> cupTypes = new ArrayList<>();
    private boolean multiSelect = false;


    public ArrayList<CupType> getCupTypes() {
        return cupTypes;
    }

    public Cups() {
        //CREATION DES MAPS

        //CLASSIQUE//
        //CHAMPIGNON
        Map map1 = new Map("Champidrome", "Switch", false);
        Map map2 = new Map("Parc Glougloop", "Switch", false);
        Map map3 = new Map("Piste aux délices", "Switch", false);
        Map map4 = new Map("Temple Thwomp", "Switch", false);
        //FLEUR
        Map map5 = new Map("Circuit Mario", "Switch", false);
        Map map6 = new Map("Promenade Toad", "Switch", false);
        Map map7 = new Map("Manoir trempé", "Switch", false);
        Map map8 = new Map("Cascades Maskass", "Switch", false);
        //ETOILE
        Map map9 = new Map("Aéroport Azur", "Switch", false);
        Map map10 = new Map("Lagon Tourbillon", "Switch", false);
        Map map11 = new Map("Club Mario", "Switch", false);
        Map map12 = new Map("Descente givrée", "Switch", false);
        //SPECIALE
        Map map13 = new Map("Voie céleste", "Switch", false);
        Map map14 = new Map("Désert Toussec", "Switch", false);
        Map map15 = new Map("Château de Bowser", "Switch", false);
        Map map16 = new Map("Route Arc-en-ciel", "Switch", false);

        //RETRO//
        //CARAPACE
        Map map17 = new Map("Prairie Meuh Meuh", "WII", false);
        Map map18 = new Map("Circuit Mario GBA", "GBA", false);
        Map map19 = new Map("Plage Cheep Cheep", "DS", false);
        Map map20 = new Map("Autoroute Toad", "N64", false);
        //BANANE
        Map map21 = new Map("Désert Sec Sec", "GCN", false);
        Map map22 = new Map("Plaine Donut 3", "SNES", false);
        Map map23 = new Map("Autodrome royal", "N64", false);
        Map map24 = new Map("Forêt tropicale DK", "3DS", false);
        //FEUILLE
        Map map25 = new Map("Stade Wario", "DS", false);
        Map map26 = new Map("Royaume Sorbet", "GCN", false);
        Map map27 = new Map("Piste musicale", "3DS", false);
        Map map28 = new Map("Vallée Yoshi", "N64", false);
        //ECLAIR
        Map map29 = new Map("Horloge Tic-Tac", "DS", false);
        Map map30 = new Map("Égout Piranha", "3DS", false);
        Map map31 = new Map("Volcan grondant", "WII", false);
        Map map32 = new Map("Route Arc-en-ciel N64", "N64", false);

        //DLC//
        //OEUF
        Map map33 = new Map("Circuit Yoshi", "GCN", false);
        Map map34 = new Map("Arène d'Excitebike", "Switch", false);
        Map map35 = new Map("Route du dragon", "Switch", false);
        Map map36 = new Map("Mute City", "Switch", false);
        //TRIFORCE
        Map map37 = new Map("Mine Wario", "WII", false);
        Map map38 = new Map("Route Arc-en-ciel SNES", "SNES", false);
        Map map39 = new Map("Station Glagla", "Switch", false);
        Map map40 = new Map("Circuit d'Hyrule", "Switch", false);
        //CROSSING
        Map map41 = new Map("Parc Baby", "GCN", false);
        Map map42 = new Map("Pays Fromage", "GBA", false);
        Map map43 = new Map("Passage Feuillage", "Switch", false);
        Map map44 = new Map("Animal Crossing", "Switch", false);
        //CLOCHETTE
        Map map45 = new Map("Koopapolis", "3DS", false);
        Map map46 = new Map("Route Ruban", "GBA", false);
        Map map47 = new Map("Métro Turbo", "Switch", false);
        Map map48 = new Map("Big Blue", "Switch", false);

        //PASS ADDITIONNEL//
        //TURBO DOREE
        Map map49 = new Map("Promenade à Paris", "TOUR", false);
        Map map50 = new Map("Circuit Toad", "3DS", false);
        Map map51 = new Map("Montagne Choco", "N64", false);
        Map map52 = new Map("Supermarché Coco", "WII", false);
        //MANEKI-NEKO
        Map map53 = new Map("Traversée de Tokyo", "TOUR", false);
        Map map54 = new Map("Corniche Champignon", "DS", false);
        Map map55 = new Map("Jardin volant", "GBA", false);
        Map map56 = new Map("Dojo ninja", "TOUR", false);
        //NAVET
        Map map57 = new Map("Escapade New-Yorkaise", "TOUR", false);
        Map map58 = new Map("Circuit Mario 3", "SNES", false);
        Map map59 = new Map("Desert Kalimari", "N64", false);
        Map map60 = new Map("Flippeur Waluigi", "DS", false);
        //HELICO
        Map map61 = new Map("Sprint a Sydney", "TOUR", false);
        Map map62 = new Map("Pays neigeux", "GBA", false);
        Map map63 = new Map("Gorge champignon", "WII", false);
        Map map64 = new Map("Cite sorbet", "Switch", false);
        //PIERRE
        Map map65 = new Map("Détour à Londres", "TOUR", false);
        Map map66 = new Map("Lac Boo", "GBA", false);
        Map map67 = new Map("Mont Éboulis", "3DS", false);
        Map map68 = new Map("Bois Vermeil", "WII", false);
        //LUNE
        Map map69 = new Map("Balade Berlinoise", "TOUR", false);
        Map map70 = new Map("Jardin Peach", "DS", false);
        Map map71 = new Map("Mont Festif", "TOUR", false);
        Map map72 = new Map("Route Arc-en-ciel", "3DS", false);
        //FRUIT
        Map map73 = new Map("Virée à Amsterdam", "TOUR", false);
        Map map74 = new Map("Riverside Parc", "GBA", false);
        Map map75 = new Map("Pic DK", "WII", false);
        Map map76 = new Map("Île de Yoshi", "Switch", false);
        //BOOMERANG
        Map map77 = new Map("Bousculade à Bangkok", "TOUR", false);
        Map map78 = new Map("Circuit Mario", "DS", false);
        Map map79 = new Map("Stade Waluigi", "N64", false);
        Map map80 = new Map("Poursuite à Singapour", "TOUR", false);
        //PLUME
        Map map81 = new Map("Athènes antique", "TOUR", false);
        Map map82 = new Map("Paquebot Daisy", "N64", false);
        Map map83 = new Map("Route Clair de Lune", "WII", false);
        Map map84 = new Map("Course à la propreté", "Switch", false);
        //CERISES
        Map map85 = new Map("Road-Trip à Los Angeles", "TOUR", false);
        Map map86 = new Map("Pays Crépuscule", "GBA", false);
        Map map87 = new Map("Cap Koopa", "WII", false);
        Map map88 = new Map("Virages à Vancouver", "TOUR", false);
        //GLAND
        Map map89 = new Map("Rome romantique", "TOUR", false);
        Map map90 = new Map("Montagne DK", "N64", false);
        Map map91 = new Map("Circuit Daisy", "WII", false);
        Map map92 = new Map("Ruines Plante Piranha", "TOUR", false);
        //EPINES
        Map map93 = new Map("Méandres Madrilènes", "TOUR", false);
        Map map94 = new Map("Monde glacé d'Harmonie", "3DS", false);
        Map map95 = new Map("Château de Bowser 3", "SNES", false);
        Map map96 = new Map("Route Arc-en-ciel", "WII", false);
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
        Cup cup15 = new Cup("Coupe Navet", map57, map58, map59, map60, "Pass Additionnel", true);
        Cup cup16 = new Cup("Coupe Hélico", map61, map62, map63, map64, "Pass Additionnel", true);
        Cup cup17 = new Cup("Coupe Pierre", map65, map66, map67, map68, "Pass Additionnel", true);
        Cup cup18 = new Cup("Coupe Lune", map69, map70, map71, map72, "Pass Additionnel", true);
        Cup cup19 = new Cup("Coupe Fruit", map73, map74, map75, map76, "Pass Additionnel", true);
        Cup cup20 = new Cup("Coupe Boomerang", map77, map78, map79, map80, "Pass Additionnel", true);
        Cup cup21 = new Cup("Coupe Plume", map81, map82, map83, map84, "Pass Additionnel", true);
        Cup cup22 = new Cup("Coupe Cerises", map85, map86, map87, map88, "Pass Additionnel", true);
        Cup cup23 = new Cup("Coupe Gland", map89, map90, map91, map92, "Pass Additionnel", true);
        Cup cup24 = new Cup("Coupe à épines", map93, map94, map95, map96, "Pass Additionnel", true);
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
