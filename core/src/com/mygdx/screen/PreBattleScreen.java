package com.mygdx.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.mygdx.custom.GJActor;
import com.mygdx.custom.GJClickableActor;
import com.mygdx.custom.GJScreen;
import com.mygdx.custom.TargetGrid;
import com.mygdx.final_values.AssetList;
import com.mygdx.final_values.ConstantPositions;
import com.mygdx.game.MyGdxGame;

public class PreBattleScreen extends GJScreen{

    private GJActor background;
    private AssetManager assetManager;
    private TextureAtlas preBattleAtlas;
    private GJClickableActor fighter;
    private TargetGrid targetGrid;
    
    private Group topPortion;
    private Group bottomPortion;
    
    public PreBattleScreen(MyGdxGame game) {
        super(game);
        targetGrid = new TargetGrid();
        preBattleAtlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        background = new GJActor(preBattleAtlas.findRegion(AssetList.Assets.ASSET_BG_FIELD.getPath()));
        fighter = new GJClickableActor(preBattleAtlas.findRegion(AssetList.Assets.ASSET_FIGHTER.getPath()));
        
        topPortion = new Group();
        
        topPortion.setWidth(MyGdxGame.WIDTH);
        topPortion.setHeight(MyGdxGame.HEIGHT/2);
        
        
        
        topPortion.setY(MyGdxGame.HEIGHT-topPortion.getHeight());
        fighter.setScale(0.8f);
        fighter.setY(topPortion.getHeight()/2 - (fighter.getHeight()/2+ConstantPositions.SPACING_XSMALL));

        topPortion.addActor(background);
        topPortion.addActor(targetGrid);
        topPortion.addActor(fighter);
        
        stage.addActor(topPortion);
        Gdx.input.setInputProcessor(stage);
    }
    
    @Override
    public void render(float delta) {
        super.render(delta);
    }

}
