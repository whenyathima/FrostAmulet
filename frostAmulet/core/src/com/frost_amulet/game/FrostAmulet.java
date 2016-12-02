package com.frost_amulet.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frost_amulet.game.come.frost_amulet.game.screens.MainMenuScreen;


public class FrostAmulet extends Game {


    /** gameStates array holds the game states, constructured in the create method of the FrostAmulet class */
    public SpriteBatch batch;
    public BitmapFont font;

    private int gameHeight;
    private int gameWidth;

    Screen currentScreen;


    @Override
	public void create () {

        /** Obligatory graphics object, passed to each state upoin construction in the create method fo the FrostAmulet class */
        batch = new SpriteBatch();
        font = new BitmapFont();

        gameHeight = Handler.getGameHeight();
        gameWidth = Handler.getGameWidth();

        Handler.setBatch(batch);
        Handler.setFont(font);
        Handler.setGame(this);

        this.setScreen(currentScreen = new MainMenuScreen(this));

        // Add in all the loading code here

	}

	@Override
    public void render (){


        Gdx.gl.glClearColor(1, 0, 0, 1);                    //Clear the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);           //Causes the screen to flicker when removed

       // currentScreen.tick();

        batch.begin();

        super.render();

        batch.end();





    }
	
	@Override
	public void dispose () {

	}

}
