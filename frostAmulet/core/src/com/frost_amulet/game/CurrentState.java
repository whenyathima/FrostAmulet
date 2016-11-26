package com.frost_amulet.game;

/**
 * Created by dev on 26/11/16.
 */
public enum CurrentState{
    MENU_STATE(0);

    private final int value;
    private CurrentState(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}   // The current State enum.

