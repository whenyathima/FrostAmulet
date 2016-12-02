package com.frost_amulet.game.come.frost_amulet.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frost_amulet.game.FrostAmulet;

/**
 * Created by dev on 2/12/16.
 */
public class MainMenuScreen implements Screen {

    FrostAmulet game;
    Texture img;

    int tickCounter = 1;

    public MainMenuScreen(FrostAmulet game){
        this.game = game;
        img = new Texture("core/assets/badlogic.jpg");
    }


    @Override
    public void show() {

    }

    public void tick(){
        tickCounter += 1;
    }

    @Override
    public void render(float delta) {
       // game.batch.begin();
        game.batch.draw(img, 0, 0);
       // game.batch.end();
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
