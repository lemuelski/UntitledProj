package com.mygdx.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.mygdx.custom.GJActor;
import com.mygdx.custom.GJClickableActor;
import com.mygdx.custom.GJScreen;
<<<<<<< HEAD
import com.mygdx.custom.GJThumbnail;
=======
>>>>>>> 83bbf345b3c11cc57efc3ee7958bba24fa9c1ce9
import com.mygdx.custom.TargetGrid;
import com.mygdx.final_values.AssetList;
import com.mygdx.final_values.ConstantPositions;
import com.mygdx.game.MyGdxGame;
import com.mygdx.interfaces.PressCallback;

public class PreBattleScreen extends GJScreen{

    private GJActor background;
    private AssetManager assetManager;
    private TextureAtlas preBattleAtlas;
    private GJClickableActor fighter;
    private TargetGrid targetGrid;
    
    private Group topPortion;
    private Group bottomPortion;
    private GJThumbnail thumbnail;
    
    public PreBattleScreen(MyGdxGame game) {
        super(game);
        targetGrid = new TargetGrid();
        preBattleAtlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        background = new GJActor(preBattleAtlas.findRegion(AssetList.Assets.ASSET_BG_FIELD.getPath()));
        
        topPortion = new Group();
        
        //in the future must be in DAO
        thumbnail = new GJThumbnail(AssetList.Assets.ASSET_THUMB_FIGHTER.getPath());
        
        topPortion.setWidth(MyGdxGame.WIDTH);
        topPortion.setHeight(MyGdxGame.HEIGHT/2);
<<<<<<< HEAD

=======
        
        
        
>>>>>>> 83bbf345b3c11cc57efc3ee7958bba24fa9c1ce9
        topPortion.setY(MyGdxGame.HEIGHT-topPortion.getHeight());
        fighter.setScale(0.8f);
        fighter.setY(topPortion.getHeight()/2 - (fighter.getHeight()/2+ConstantPositions.SPACING_XSMALL));

        topPortion.addActor(background);
        topPortion.addActor(targetGrid);
<<<<<<< HEAD
       
        topPortion.addActor(thumbnail);
=======
        topPortion.addActor(fighter);
>>>>>>> 83bbf345b3c11cc57efc3ee7958bba24fa9c1ce9
        
        stage.addActor(topPortion);
        Gdx.input.setInputProcessor(stage);
    }
    
    @Override
    public void render(float delta) {
        super.render(delta);
    }

}
