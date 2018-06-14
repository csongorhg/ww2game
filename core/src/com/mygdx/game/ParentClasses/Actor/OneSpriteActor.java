package com.mygdx.game.ParentClasses.Actor;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.mygdx.game.ParentClasses.Init.InitableInterface;

/**
 * Created by Hegedüs Csongor on 6/12/2018.
 */

public abstract class OneSpriteActor extends MyActor implements InitableInterface {

    protected Sprite sprite;

    public OneSpriteActor(Sprite sprite) {
        if (sprite != null) {
            this.sprite = sprite;
            init();
        }
    }

    @Override
    public void init() {
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        sprite.draw(batch);
    }

    @Override
    protected void positionChanged() {
        super.positionChanged();
        sprite.setPosition(getX(), getY());
    }

    @Override
    protected void rotationChanged() {
        super.rotationChanged();
        sprite.setRotation(getRotation());
    }

    @Override
    protected void sizeChanged() {
        super.sizeChanged();
        sprite.setSize(getWidth(), getHeight());
    }

}
