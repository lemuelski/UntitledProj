package com.mygdx.custom;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.final_values.AssetList;
import com.mygdx.interfaces.PressCallback;

/*Will hold Data 
 * such as:
 * Atlass File name : for creation of Actor (Unit)
 * 
 * */

public class GJThumbnail extends Group{

    private TextureAtlas atlas;
    private GJActor thumbBG;
    private GJActor thumbUnit;
    
    //create Separate Actor in the future
    //will hold DAO
    private GJActor unit;
    
    //for future use each unit will have separate altas
    //for now use gamescreen atlas
    private String unitPath;
    
    //not yet used
    private String unitPathAtlas;
    
    private float alpha = 1.0f;
    private boolean trigger = false;
   
    public GJThumbnail(String unitPath){
        atlas = new TextureAtlas(AssetList.Assets.ATLAS_GAMESCREEN.getPath());
        thumbBG = new GJActor(atlas.findRegion(AssetList.Assets.ASSET_THUMB_BG.getPath()));
        thumbUnit = new GJActor(atlas.findRegion(unitPath));
        unit = new GJClickableActor(atlas.findRegion(AssetList.Assets.ASSET_FIGHTER.getPath()));
        
        this.addActor(thumbBG);
        this.addActor(thumbUnit);
        
        this.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                makeTransparent();
            }
        });
    }
    
     @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.setColor(1, 1, 1, alpha);
        super.draw(batch, parentAlpha);
        batch.setColor(1,1,1,1);
    }
     
   private void makeTransparent(){
       if (!trigger)
           alpha = 0.5f;
       else
           alpha = 1.0f;
       
       trigger = !trigger;
   }
   
   public boolean isPressed(){
       return trigger;
   }
  
   public class PressListener  implements PressCallback{
       @Override
       public Actor onPress() {
           return unit;
       }
   }

}
