package com.frost_amulet.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType;

/**
 * Created by dev on 29/11/16.
 */
public class Handler {

    private static int height;
    private static int width;
    private static SpriteBatch batch;
    private static BitmapFont font;
    private static FrostAmulet game;

    public static void Start(){
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();

    }



    public static int getGameHeight(){
        return height;
    }
    public static void setGameHeight(int height){
        Handler.height = height;
    }

    public static int getGameWidth(){
        return width;
    }
    public static void setGameWidth(int width){
        Handler.width = width;
    }

    public static SpriteBatch getBatch(){
        return batch;
    }
    public static void setBatch(SpriteBatch batch){
        Handler.batch = batch;
    }

    public static BitmapFont getFont(){
        return font;
    }
    public static void setFont(BitmapFont font){
        Handler.font = font;
    }

    public static FrostAmulet getGame(){
        return game;
    }
    public static void setGame(FrostAmulet game){
        Handler.game = game;
    }

}
