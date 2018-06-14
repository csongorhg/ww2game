package com.mygdx.game.ParentClasses.Actor;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by Hegedüs Csongor on 6/12/2018.
 */

public class OneSpriteStaticActor extends OneSpriteActor{

    public OneSpriteStaticActor(String file) {
        super(new Sprite(new Texture(file)));
    }

    public OneSpriteStaticActor(Texture texture) {
        super(new Sprite(texture));
    }

    public Texture getTexture() {
        return sprite.getTexture();
    }
}
