package com.mygdx.game.Menu;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.Assets.Assets;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.Actor.OneSpriteStaticActor;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyScreen;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyStage;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public class MenuScreen extends MyScreen {

    protected MenuStage menuStage;
    private MyStage backgroundStage;

    public MenuScreen(MyGdxGame game) {
        super(game);
    }

    @Override
    public void render(float delta) {
        super.render(delta);

        backgroundStage.act(delta);
        backgroundStage.draw();

        menuStage.act(delta);
        menuStage.draw();

    }

    @Override
    public void dispose() {
        menuStage.dispose();
        super.dispose();
    }

    @Override
    public void init() {

        /* Background in menu */
        backgroundStage = new MyStage(new StretchViewport(1080, 1920, new OrthographicCamera(1080, 1920)), spriteBatch, game) {

            private OneSpriteStaticActor backGroundActor;

            @Override
            public void init() {
                backGroundActor = new OneSpriteStaticActor(Assets.assetManager.get(Assets.MENU_BACKGROUND));
                backGroundActor.setBounds(0, 0, getViewport().getWorldWidth(), getViewport().getWorldHeight());
                addActor(backGroundActor);
            }

            @Override
            protected void resized() {

            }
        };

        /* Implementing menu */
        menuStage = new MenuStage(new ExtendViewport(1080,1920, new OrthographicCamera(1080,1920)), spriteBatch, game);
        Gdx.input.setInputProcessor(menuStage);
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
