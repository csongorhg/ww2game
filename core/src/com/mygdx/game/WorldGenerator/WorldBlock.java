package com.mygdx.game.WorldGenerator;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.ParentClasses.Actor.OneSpriteStaticActor;

/**
 * Created by Hegedüs Csongor on 7/5/2018.
 */

public class WorldBlock extends OneSpriteStaticActor {

    public WorldBlock(String file) {
        super(file);
    }

    public WorldBlock(Texture texture) {
        super(texture);
    }
}
