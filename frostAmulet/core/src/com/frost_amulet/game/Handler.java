package com.frost_amulet.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by dev on 29/11/16.
 */
public class Handler {

    private static int height;
    private static int width;
    private static SpriteBatch batch;
    private static FrostAmulet game;

    public static void Handler(){

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

    public static FrostAmulet getGame(){
        return game;
    }
    public static void setGame(FrostAmulet game){
        Handler.game = game;
    }

}