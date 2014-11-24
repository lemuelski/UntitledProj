package com.mygdx.custom;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.mygdx.final_values.AssetList;

public class GJUnitGrid extends Group{

    private GJActor targetGrid;
    private TextureRegion targetCircle;
    private TextureAtlas atlas;
    
    public GJUnitGrid(String name) {
        atlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        targetCircle = atlas.findRegion(AssetList.Assets.ASSET_TARGET.getPath());
        
        targetGrid = new GJActor(targetCircle);
        this.addActor(targetGrid);
        this.setWidth(targetCircle.getRegionWidth());
        this.setHeight(targetCircle.getRegionHeight());
        this.setName(name);
    }
    
    public void addUnit(Actor unit){
        this.addActor(unit);
        unit.setName("unit");
    }
    
}
