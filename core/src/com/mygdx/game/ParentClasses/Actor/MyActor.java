package com.mygdx.game.ParentClasses.Actor;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.ParentClasses.Init.InitableInterface;

/**
 * Created by Hegedüs Csongor on 6/12/2018.
 */

public abstract class MyActor extends Actor implements InitableInterface {

    protected float elapsedTime;

    public MyActor() {
        super();
        elapsedTime = 0;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        elapsedTime += delta;
    }

    public float getElapsedTime() {
        return elapsedTime;
    }
}
