package com.frost_amulet.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frost_amulet.game.com.frost_amulet.game.states.MenuState;
import com.frost_amulet.game.com.frost_amulet.game.states.State;



/**
 * The @gameState   String which determine the current state of the game, affecting tick and render methods
 */

public class FrostAmulet extends ApplicationAdapter {

    SpriteBatch batch;
	Texture img;
    public State[] gameStates = {new MenuState()}; //, new OverworldState, EncounterState, }
    private State currentState = gameStates[1];



	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("/Users/dev/FrostAmulet/frostAmulet/core/assets/badlogic.jpg");



        // Add in all the loading code here

	}

	@Override
	public void render () {


        currentState.render();

		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
