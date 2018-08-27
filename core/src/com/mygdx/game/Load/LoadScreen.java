package com.mygdx.game.Load;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.Assets.Assets;
import com.mygdx.game.Game.GameScreen;
import com.mygdx.game.Menu.MenuScreen;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyScreen;

/**
 * Created by Hegedüs Csongor on 6/12/2018.
 */

public class LoadScreen extends MyScreen {

    private Stage stage;

    public LoadScreen(MyGdxGame game) {
        super(game);
        stage = new Stage();

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        if (Assets.assetManager.update()) {
            game.setScreen(new MenuScreen(game));
        }
    }

    @Override
    public void show() {
        Assets.assetManager.finishLoading();
        Assets.load();
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
