package com.example.mk8randomizer.vehicles;

import java.io.Serializable;
import java.util.Locale;

public class Part implements Serializable {
    private String name;
    private String type;

    public Part(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    private String getType() {
        return type;
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
        name = name.replace(".", "_");
        switch (this.getType()) {
            case "Kart": name = "vehicle_body_kart_corps_" + name+"_8"; break;
            case "Bike": name = "vehicle_body_bike_corps_" + name+"_8"; break;
            case "Quad": name = "vehicle_body_quad_corps_" + name+"_8"; break;
            case "Wheel": name = "vehicle_wheel_" + name+"_8"; break;
            case "Wing": name = "vehicle_wingl_" + name +"_8"; break;
        }
        return name;
    }
}
