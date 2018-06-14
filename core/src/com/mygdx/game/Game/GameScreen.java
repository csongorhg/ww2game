package com.mygdx.game.Game;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyScreen;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyStage;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public class GameScreen extends MyScreen {

    protected GameStage gameStage;
    private MyStage myStage;

    public GameScreen(MyGdxGame game) {
        super(game);
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
        gameStage  = new GameStage(new ExtendViewport(1280,1920, new OrthographicCamera(1280,1920)), spriteBatch, game);
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
