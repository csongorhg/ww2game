package com.mygdx.game.ParentClasses.ScreenAndStage;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.Init.InitableInterface;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public abstract class MyStage extends Stage implements InitableInterface {

    public final MyGdxGame game;

    private float cameraTargetX = 0;
    private float cameraTargetY = 0;
    private float cameraTargetZoom = 0;
    private float cameraMoveSpeed = 0;

    protected MyStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch);
        this.game = game;
        setCameraResetToCenterOfScreen();
        init();
    }

    public void addBackEventStackListener() {
        addListener(new InputListener() {

            @Override
            public boolean keyDown(InputEvent event, int keycode) {
                if (keycode == Input.Keys.BACK) {
                    game.setScreenBackByStackPop();
                }
                return true;
            }
        });
    }

    public Actor getLastAddedActor() {
        return getActors().get(getActors().size - 1);
    }

    public void setCameraZoomXY(float x, float y, float zoom) {
        OrthographicCamera c = (OrthographicCamera) getCamera();
        c.zoom = zoom;
        c.position.set(x, y, 0);
        c.update();
    }

    public void setCameraMoveToXY(float x, float y, float zoom, float speed) {
        cameraTargetX = x;
        cameraTargetY = y;
        cameraTargetZoom = zoom;
        cameraMoveSpeed = speed;
    }

    public void setCameraResetToCenterOfScreen() {
        OrthographicCamera c = (OrthographicCamera) getCamera();
        ExtendViewport v = (ExtendViewport) getViewport();
        c.setToOrtho(false, getViewport().getWorldWidth(), getViewport().getWorldHeight());
        c.translate((v.getWorldWidth() - v.getMinWorldWidth() / 2) < 0 ? 0 : -((v.getWorldWidth() - v.getMinWorldWidth()) / 2),
                ((v.getWorldHeight() - v.getMinWorldHeight()) / 2) < 0 ? 0 : -((v.getWorldHeight() - v.getMinWorldHeight()) / 2));
        c.update();
    }

    public void setCameraResetToLeftBottomOfScreen() {
        OrthographicCamera c = (OrthographicCamera) getCamera();
        Viewport v = getViewport();
        setCameraZoomXY(v.getWorldWidth() / 2, v.getWorldHeight() / 2, 1);
        c.update();

    }

    public void resize(int screenWidth, int screenHeight){
        getViewport().update(screenWidth, screenHeight, true);
        resized();
    }

    protected void resized(){
        setCameraResetToCenterOfScreen();
    };


    @Override
    public void dispose() {
        super.dispose();
    }
}
