package com.mygdx.game.WorldGenerator;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.mygdx.game.Assets.Maps;

import java.util.ArrayList;
import java.util.EnumMap;

/**
 * Created by Hegedüs Csongor on 7/5/2018.
 */

public class WorldMap {

    private ArrayList<WorldRow> worldRows;
    private String blocksArray[];

    public WorldMap() {

    }

    public void readMaps(Maps maps) {
        FileHandle fileHandle = Gdx.files.internal(maps.toString());
        blocksArray = fileHandle.readString().split("\n");
        for (String blockRow : blocksArray) {
            System.out.println(blockRow + "\n");
        }
    }
}
