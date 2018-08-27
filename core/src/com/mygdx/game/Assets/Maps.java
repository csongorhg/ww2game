package com.mygdx.game.Assets;

/**
 * Created by Hegedüs Csongor on 7/5/2018.
 */

public enum Maps {
    OMAHA_BEACH_MAP("maps/omaha_beach_map.txt");

    private final String text;

    Maps(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

