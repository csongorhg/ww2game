package com.mygdx.game.Game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyScreen;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyStage;

import java.util.Random;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public class GameScreen extends MyScreen {

    protected GameStage gameStage;
    private MyStage myStage;
    private Array<ShapeRenderer> shapeRendererArray;

    public GameScreen(MyGdxGame game) {
        super(game);shapeRendererArray = new Array<ShapeRenderer>();
        for (int i = 0; i < 100; i++) {
            shapeRendererArray.add(new ShapeRenderer());
        }
        System.out.println("width: " +gameStage.getViewport().getWorldWidth());
        System.out.println("gdx: "+ Gdx.graphics.getWidth() );
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        gameStage.act(delta);
        gameStage.draw();
    }

    @Override
    public void dispose() {
        gameStage.dispose();
        super.dispose();
    }

    @Override
    public void init() {
        gameStage  = new GameStage(new ExtendViewport(1080,1920, new OrthographicCamera(1080,1920)), spriteBatch, game);
    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }
}
