package com.frost_amulet.game.com.frost_amulet.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frost_amulet.game.FrostAmulet;
import com.frost_amulet.game.Handler;

/**
 * Created by dev on 26/11/16.
 */



public class MenuState extends State {

    public Texture img;
    boolean leftPressed = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
    boolean rightPressed = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);
    float[] mousePosition = new float[2];

    public MenuState(){
        super();

        img = new Texture("core/assets/badlogic.jpg");
    }

    public void tick(){
        leftPressed = Gdx.input.isButtonPressed(Input.Buttons.LEFT);
        mousePosition[0] = Gdx.input.getX();
        mousePosition[1] = Gdx.input.getY();
        rightPressed = Gdx.input.isButtonPressed(Input.Buttons.RIGHT);

    }

    public void render(){

        if (leftPressed) {
            batch.draw(img, (int) mousePosition[0] - img.getWidth()/2, Handler.getGameHeight() - (int) mousePosition[1] - img.getHeight()/2);
        }

    }


    public void dispose(){
        batch.dispose();
        img.dispose();

    }

}
