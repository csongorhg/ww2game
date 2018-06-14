package com.mygdx.game.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyStage;

import java.util.Random;

import sun.security.provider.SHA;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public class GameStage extends MyStage {
    private Array<ShapeRenderer> shapeRendererArray;

    public GameStage(ExtendViewport game, SpriteBatch viewport, MyGdxGame batch) {
        super(game, viewport, batch);
        shapeRendererArray = new Array<ShapeRenderer>();
        for (int i = 0; i < 100; i++) {
            shapeRendererArray.add(new ShapeRenderer());
        }
        System.out.println("width: " +getViewport().getWorldWidth());
        System.out.println("gdx: "+ Gdx.graphics.getWidth() );
    }

    @Override
    public void init() {
        setCameraResetToLeftBottomOfScreen();
    }

    @Override
    public void draw() {
        super.draw();
        float size = getViewport().getWorldWidth() / 5;
        float x = -size;
        float y = -size;
        for (int i = 0; i < 100; i++) {
            float r = new Random().nextFloat();
            float g = new Random().nextFloat();
            float b = new Random().nextFloat();
            ShapeRenderer shapeRenderer = shapeRendererArray.get(i);
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(r, g, b, 1);
            x = x + getViewport().getWorldWidth() / 5 >= getViewport().getWorldWidth() ? 0 : x + getViewport().getWorldWidth() / 5;
            y = x == 0 ? y + size : y;
            shapeRenderer.rect(x, y, size, size);
            shapeRenderer.end();
            shapeRendererArray.set(i, shapeRenderer);
        }
    }

    @Override
    public void act() {
        super.act();
    }

    @Override
    public void dispose() {
        super.dispose();
        for (ShapeRenderer shapeRenderer: shapeRendererArray
             ) {
            shapeRenderer.dispose();
        }
    }
}
