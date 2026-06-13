package net.nerfashton.alumina.item.material;

import java.util.ArrayList;

public enum DustEnum {
    GRAPHITE,
    SULFUR,
    PHOSPHOROUS,
    SELENIUM;

    public static ArrayList<String> getDusts() {
        ArrayList<String> list = new ArrayList<>();
        for (DustEnum dust : DustEnum.values()) {
            list.add(dust.name().toLowerCase());
        }
        return list;
    }
}
