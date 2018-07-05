package com.mygdx.game.Assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Hegedüs Csongor on 6/12/2018.
 */

public class Assets {

    public static AssetManager assetManager;

    public static void create() {
        assetManager = new AssetManager();
        Texture.setAssetManager(assetManager);
    }

    public static void load() {
        assetManager.load(GRASS_PATTERN);
        assetManager.load(WATER_PATTERN);
        assetManager.load(BARBED_WIRE_FENCE_OBJECT);
    }

    public static void unload() {
        assetManager.dispose();
    }

    /**
    TEXTURES
    */

    /** PATTERRNS */
    public static final AssetDescriptor<Texture> GRASS_PATTERN
            = new AssetDescriptor<Texture>("patterns/grass_pattern.jpg", Texture.class);
    public static final AssetDescriptor<Texture> WATER_PATTERN
            = new AssetDescriptor<Texture>("patterns/water_pattern.png", Texture.class);

    /** OBJECTS */
    public static final AssetDescriptor<Texture> BARBED_WIRE_FENCE_OBJECT
            = new AssetDescriptor<Texture>("objects/barbed_wire_fence_object.png", Texture.class);
}
