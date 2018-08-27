package com.mygdx.game.Menu;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.mygdx.game.Assets.Assets;
import com.mygdx.game.MyGdxGame;
import com.mygdx.game.ParentClasses.Actor.OneSpriteStaticActor;
import com.mygdx.game.ParentClasses.ScreenAndStage.MyStage;

/**
 * Created by Hegedüs Csongor on 6/6/2018.
 */

public class MenuStage extends MyStage {

    private OneSpriteStaticActor playButton, optionsButton, quitButton;


    public MenuStage(ExtendViewport game, SpriteBatch viewport, MyGdxGame batch) {
        super(game, viewport, batch);
    }

    @Override
    public void init() {

        /* Play */
        playButton = new OneSpriteStaticActor(Assets.assetManager.get(Assets.GRASS_PATTERN));
        playButton.setSize(((ExtendViewport)getViewport()).getMinWorldWidth() / 5 * 3,((ExtendViewport)getViewport()).getMinWorldHeight() / 6);
        playButton.setPosition(
                ((ExtendViewport)getViewport()).getMinWorldWidth() / 2 - playButton.getWidth() / 2,
                ((ExtendViewport) getViewport()).getMinWorldHeight() / 3 * 2  + ((ExtendViewport) getViewport()).getMinWorldHeight() / 6 - playButton.getHeight() / 2
        );
        addActor(playButton);

        /* Options */
        optionsButton = new OneSpriteStaticActor(Assets.assetManager.get(Assets.WATER_PATTERN));
        optionsButton.setSize(((ExtendViewport)getViewport()).getMinWorldWidth() / 5 * 3,((ExtendViewport)getViewport()).getMinWorldHeight() / 6);
        optionsButton.setPosition(
                ((ExtendViewport)getViewport()).getMinWorldWidth() / 2 - optionsButton.getWidth() / 2,
                ((ExtendViewport) getViewport()).getMinWorldHeight() / 3  + ((ExtendViewport) getViewport()).getMinWorldHeight() / 6 - optionsButton.getHeight() / 2
        );
        addActor(optionsButton);

        /* Quit */
        quitButton = new OneSpriteStaticActor(Assets.assetManager.get(Assets.MENU_BACKGROUND));
        quitButton.setSize(((ExtendViewport)getViewport()).getMinWorldWidth() / 5 * 3,((ExtendViewport)getViewport()).getMinWorldHeight() / 6);
        quitButton.setPosition(
                ((ExtendViewport)getViewport()).getMinWorldWidth() / 2 - quitButton.getWidth() / 2,
                ((ExtendViewport) getViewport()).getMaxWorldHeight()  + ((ExtendViewport) getViewport()).getMinWorldHeight() / 6 - quitButton.getHeight() / 2
        );
        addActor(quitButton);

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
