package com.mygdx.custom;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.mygdx.final_values.AssetList;

public class TargetGrid extends Group {
    
    private GJActor targetGrid00;
    private GJActor targetGrid01;
    private GJActor targetGrid02;
    private GJActor targetGrid10;
    private GJActor targetGrid11;
    private GJActor targetGrid12;
    private GJActor targetGrid20;
    private GJActor targetGrid21;
    private GJActor targetGrid22;
    
    private TextureRegion target;
    private TextureAtlas atlas;
    
    
    public TargetGrid(){
        atlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        target = atlas.findRegion(AssetList.Assets.ASSET_TARGET.getPath());
        targetGrid00 = new GJActor(target);
        targetGrid01 = new GJActor(target);
        targetGrid02 = new GJActor(target);
        targetGrid10 = new GJActor(target);
        targetGrid11 = new GJActor(target);
        targetGrid12 = new GJActor(target);
        targetGrid20 = new GJActor(target);
        targetGrid21 = new GJActor(target);
        targetGrid22 = new GJActor(target);
    }

}
