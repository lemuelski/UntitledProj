package com.mygdx.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.mygdx.custom.GJActor;
import com.mygdx.custom.GJScreen;
import com.mygdx.final_values.AssetList;
import com.mygdx.game.MyGdxGame;

public class PreBattleScreen extends GJScreen{

    GJActor background;
    AssetManager assetManager;
    TextureAtlas preBattleAtlas;
    
    public PreBattleScreen(MyGdxGame game) {
        super(game);
        preBattleAtlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        background = new GJActor(preBattleAtlas.findRegion(AssetList.Assets.ASSET_BG_FIELD.getPath()));
        float scaler = MyGdxGame.WIDTH/background.getWidth();
        Gdx.app.log("tag", scaler+"");
        background.setScale(scaler);
        stage.addActor(background);
    }
    
    @Override
    public void render(float delta) {
        super.render(delta);
    }

}
