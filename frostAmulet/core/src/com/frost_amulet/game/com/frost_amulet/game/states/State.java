package com.frost_amulet.game.com.frost_amulet.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by dev on 26/11/16.
 */
public abstract class State {

    public SpriteBatch batch;
    public boolean isRunning;

    public abstract void tick();
    public abstract void render();
    public abstract void dispose();

    public State getState(){
        return this;
    }
}
