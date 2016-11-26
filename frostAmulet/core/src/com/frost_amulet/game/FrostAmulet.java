package com.frost_amulet.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.frost_amulet.game.com.frost_amulet.game.states.MenuState;
import com.frost_amulet.game.com.frost_amulet.game.states.State;


public class FrostAmulet extends ApplicationAdapter {

    /** CurrentState an enum which links game state names with a corresponding number in the gameStates array */
    private CurrentState currentState;

    /** gameStates array holds the game states, constructured in the create method of the FrostAmulet class */
    private State[] gameStates;


    @Override
	public void create () {
        /* Obligatory graphics object, passed to each state upoin construction in the create method fo the FrostAmulet class */
        SpriteBatch batch = new SpriteBatch();


        /** Creation of all the game states in the game, passing in the graphics object batch*/
        State[] gameStates = {new MenuState(batch)}; //, new OverworldState, EncounterState, }

        /** Dirty work around, I wasn't able to move the game state initializer up above the create class due to batch, and so this is required for the render method to access it */
        this.gameStates = gameStates;

        /** Sets the initial game state to the menu state, corresponding value 1*/
        currentState = CurrentState.MENU_STATE;

        // Add in all the loading code here

	}

	@Override
    public void render (){

	    gameStates[currentState.getValue()].render();
        gameStates[currentState.getValue()].tick();



    }
	
	@Override
	public void dispose () {

	    /** Dispose of all the states in sequence, might want to put a save funciton above here "to stop save scum"*/
        for (State gameState : gameStates) {
            gameState.dispose();
        }
	}

	public void setCurrentState(CurrentState currentState){
	    this.currentState = currentState;
    }

	public CurrentState getCurrentState(){
	    return currentState;
    }

}
