package com.frost_amulet.game.com.frost_amulet.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frost_amulet.game.FrostAmulet;
import com.frost_amulet.game.Handler;

/**
 * Created by dev on 26/11/16.
 */
public abstract class State {

    protected SpriteBatch batch;
    protected boolean isRunning;
    protected FrostAmulet game;

    public abstract void tick();
    public abstract void render();
    public abstract void dispose();

    public State(){
    this.batch  = Handler.getBatch();
    this.game = Handler.getGame();
    }

    public State getState(){
        return this;
    }
}
