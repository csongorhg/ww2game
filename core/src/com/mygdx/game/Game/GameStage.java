package com.mygdx.game.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.Assets.Assets;
import com.mygdx.game.Assets.Maps;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.Actor.OneSpriteActor;
import com.mygdx.game.ParentClasses.Actor.OneSpriteStaticActor;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyStage;
import com.mygdx.game.WorldGenerator.WorldMap;

import java.util.EnumMap;
import java.util.Random;

import sun.security.provider.SHA;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public class GameStage extends MyStage {

    private WorldMap worldMap;

    public GameStage(ExtendViewport game, SpriteBatch viewport, MyGdxGame batch) {
        super(game, viewport, batch);
    }

    @Override
    public void init() {

        /* Generate world */
        worldMap = new WorldMap();

        /* Read desired maps */
        worldMap.readMaps(Maps.OMAHA_BEACH_MAP);



    }

    @Override
    public void draw() {
        super.draw();

    }

    @Override
    public void act() {
        super.act();
    }

    @Override
    public void dispose() {
        super.dispose();

    }
}
