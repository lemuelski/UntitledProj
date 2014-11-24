package com.mygdx.custom;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.mygdx.final_values.AssetList;

public class TargetGrid extends Group {
    
    private GJUnitGrid targetGrid00;
    private GJUnitGrid targetGrid01;
    private GJUnitGrid targetGrid02;
    private GJUnitGrid targetGrid10;
    private GJUnitGrid targetGrid11;
    private GJUnitGrid targetGrid12;
    private GJUnitGrid targetGrid20;
    private GJUnitGrid targetGrid21;
    private GJUnitGrid targetGrid22;
    
    private TextureRegion target;
    private TextureAtlas atlas;
    
    
    public TargetGrid(){
        atlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        target = atlas.findRegion(AssetList.Assets.ASSET_TARGET.getPath());
        targetGrid00 = new GJUnitGrid("00");
        targetGrid01 = new GJUnitGrid("01");
        targetGrid02 = new GJUnitGrid("02");
        targetGrid10 = new GJUnitGrid("10");
        targetGrid11 = new GJUnitGrid("11");
        targetGrid12 = new GJUnitGrid("12");
        targetGrid20 = new GJUnitGrid("20");
        targetGrid21 = new GJUnitGrid("21");
        targetGrid22 = new GJUnitGrid("22");
        
        this.addActor(targetGrid00);
        this.addActor(targetGrid01);
        this.addActor(targetGrid02);
        this.addActor(targetGrid10);
        this.addActor(targetGrid11);
        this.addActor(targetGrid12);
        this.addActor(targetGrid20);
        this.addActor(targetGrid21);
        this.addActor(targetGrid22);
        
        int row=0;
        int col = 0;
        
        for (Actor actor:this.getChildren()){
            Gdx.app.log("lem", "inside");
            actor.setX((col*actor.getWidth()));
            actor.setY(row*actor.getHeight());
            if (col==2){
                col =0;
                row++;
            }
            else{
                col++;    
            }
        } 
    }

}
