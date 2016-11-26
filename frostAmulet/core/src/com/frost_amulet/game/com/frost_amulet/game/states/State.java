package com.frost_amulet.game.com.frost_amulet.game.states;

/**
 * Created by dev on 26/11/16.
 */
public abstract class State {

    public boolean isRunning;

    public abstract void tick();
    public abstract void render();
    public abstract void dispose();

    public State getState(){
        return this;
    }
}
