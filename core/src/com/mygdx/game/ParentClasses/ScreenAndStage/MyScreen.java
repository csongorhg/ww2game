package com.mygdx.game.ParentClasses.ScreenAndStage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.Init.InitableInterface;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public abstract class MyScreen implements Screen, InitableInterface {

    protected SpriteBatch spriteBatch;
    public final MyGdxGame game;
    private float bgColor_r, bgColor_g, bgColor_b;

    protected MyScreen(MyGdxGame game) {
        spriteBatch = new SpriteBatch();
        this.game = game;
        init();
    }

    public void setBackgroundColor(float r, float g, float b) {
        this.bgColor_r = r;
        this.bgColor_g = g;
        this.bgColor_b = b;
    }

    public MyGdxGame getGame() {
        return game;
    }

    @Override
    public void dispose() {
        spriteBatch.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(bgColor_r, bgColor_g, bgColor_b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void init() {

    }
}
