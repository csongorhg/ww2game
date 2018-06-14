package com.mygdx.game.Assets;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
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
        assetManager.load(TESZT);
    }

    public static void unload() {
        assetManager.dispose();
    }

    /** Textures */
    public static final AssetDescriptor<Texture> TESZT
            = new AssetDescriptor<Texture>("badlogic.jpg", Texture.class);
}
