package com.example.db_maps_connectivity;

import androidx.annotation.NonNull;

public class FruitsModel {

    public final String name;
    public final int quality;

    public FruitsModel(String name, int quality) {
        this.name = name;
        this.quality = quality;
    }

    @NonNull
    @Override
    public String toString() {
        return "FruitsModel{" +
                "name='" + name + '\'' +
                ", quality=" + quality +
                '}';
    }
}
