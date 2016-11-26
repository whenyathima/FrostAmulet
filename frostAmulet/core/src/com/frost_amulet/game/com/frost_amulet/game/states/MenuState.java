package com.frost_amulet.game.com.frost_amulet.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by dev on 26/11/16.
 */



public class MenuState extends State {

    Texture img;
    boolean leftPressed = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
    boolean rightPressed = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);

    public MenuState(SpriteBatch batch){
        this.batch  = batch;
        img = new Texture("core/assets/badlogic.jpg");

    }

    public void tick(){

    }

    public void render(){

        if (leftPressed) {
            batch.draw(img, 0, 0);
        }

    }


    public void dispose(){
        batch.dispose();
        img.dispose();

    }

}
