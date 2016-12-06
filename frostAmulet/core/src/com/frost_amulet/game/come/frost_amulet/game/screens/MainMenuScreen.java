package com.frost_amulet.game.come.frost_amulet.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.frost_amulet.game.FrostAmulet;

/**
 * Created by dev on 2/12/16.
 */
public class MainMenuScreen implements Screen {

    FrostAmulet game;
    Texture img;

    boolean LMBPressed;
    int mousePosX;
    int mousePosY;



    int tickCounter = 1;

    public MainMenuScreen(FrostAmulet game){
        this.game = game;
        img = new Texture("core/assets/badlogic.jpg");
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        tick();

        game.batch.begin();

        game.batch.draw(img, 0, 0);

        game.batch.end();
    }


    private void tick(){
        //reset mouse
        resetMouse();
        //check mouse position
        //compare to buttons
        //check mouse click
    }

    public boolean touchDown(InputEvent event,
                             float x,
                             float y,
                             int pointer,
                             int button){
        x = mousePosX;
        y = mousePosY;
        if (button ==0){
            LMBPressed = true;
        }




        return true;
    }

    private void resetMouse(){
        LMBPressed = false;
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
