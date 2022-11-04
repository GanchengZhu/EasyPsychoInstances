package com.dev.demo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.ScreenUtils;

import org.easypsycho.EasyPsycho;


public class EasyPsychoGame extends ApplicationAdapter {
    SpriteBatch batch;
    Logger logger;
    private int i = 0;
    private float s = 0f;
    private float total = 0f;
//    Text text;
    Texture texture;
//    int mask = GL20.GL_COLOR_BUFFER_BIT;

    @Override
    public void create() {
        batch = new SpriteBatch();
//        img = new Texture("img.png");
        logger = new Logger("EasyPsycho");
        Gdx.app.error("EasyPsycho", Gdx.graphics.getWidth() + " " + Gdx.graphics.getHeight());
//        text  = new Text("Hello World");
        texture = new Texture(Gdx.files.internal("a.jpg"));
    }


    @Override
    public void render() {
        ScreenUtils.clear(0.5f, 0.5f, 0.5f, 1);
//        total += Gdx.graphics.getDeltaTime();

//        if (i % 120 == 0) {
//            text.setDrawText("Hello World");
//            text.setFontSize(0.025f);
//            text.setBorderWidth(0.025f);
//            text.setColor(Color.BLACK);
//            text.setFlip(true);
//        }
//        if (i % 120 == 60) {
//            text.setDrawText("Easy Psycho");
//            text.setFontSize(0.05f);
//            text.setColor(Color.WHITE);
//            text.setFlip(false);
////            text.setPosition();
//        }

//        logger.error("test ...");
//        if (i % 1200 > 600) {
//
//        }
//        Config.SPRITE_BATCH.begin();
//        batch.begin();
        for (int i = 0; i < 10000; i++) {
            batch.begin();
            batch.draw(texture, MathUtils.random(Gdx.graphics.getWidth()), MathUtils.random(Gdx.graphics.getHeight()), 50, 50, 0, 1, 1, 0);
            batch.end();
        }
//        text.draw();

//        Config.SPRITE_BATCH.end();
        i++;
//        if (i == 60 * 10) System.exit(0);
        System.out.println(Gdx.graphics.getDeltaTime());
        System.out.println(i);
        if(Gdx.input.isTouched()){
            Gdx.app.exit();
        }
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
