package com.frost_amulet.game.com.frost_amulet.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by dev on 26/11/16.
 */
public class MenuState extends State {

    Texture img;

    public MenuState(SpriteBatch batch){
        this.batch  = batch;
        img = new Texture("/Users/dev/FrostAmulet/frostAmulet/core/assets/badlogic.jpg");

    }

    public void render(){

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();


    }

    public void tick(){

    }

    public void dispose(){
        batch.dispose();
        img.dispose();

    }

}
