package com.mygdx.custom;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MyGdxGame;

public class GJScreen implements Screen {

    protected Stage stage;
    protected MyGdxGame game;
    protected Viewport viewport;
    
    public GJScreen(MyGdxGame game){
        this.game = game;
        stage = new Stage( );
        viewport= new FitViewport(game.WIDTH, game.HEIGHT);
    }
    
    @Override
    public void render(float delta) {
        stage.act(delta);
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        stage.setViewport(viewport);
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dispose() {
    }
    
    public Stage getStage(){
        return stage;
    }

}
