package com.frost_amulet.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.frost_amulet.game.FrostAmulet;
import com.frost_amulet.game.Handler;

public class DesktopLauncher {

    private static final int GAME_WIDTH = 600;
    private static final int GAME_HEIGHT = 600;

	public static void main (String[] arg) {

	    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = GAME_WIDTH;
        config.height= GAME_HEIGHT;
        config.resizable = false;
        config.title = "Frost Amulet";

        Handler.setGameHeight(GAME_HEIGHT);
        Handler.setGameWidth(GAME_WIDTH);

		new LwjglApplication(new FrostAmulet(), config);

	}
}
