package com.dev.demo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.ScreenUtils;

import org.easypsycho.Core;
import org.easypsycho.EasyPsycho;
import org.easypsycho.ExperimentAdapter;
import org.easypsycho.visual.Canvas;
import org.easypsycho.visual.Image;


public class EasyPsychoImageTest extends ExperimentAdapter {
    Image image;
    long start;

    @Override
    public void create() {
        super.create();
        image = new Image("badlogic.jpg");
    }

    @Override
    public void onFrame(Canvas canvas, float deltaTime) {
        ScreenUtils.clear(Color.GRAY);
        start = Core.getNanoTime();
        image.drawOnCanvas(canvas);
        EasyPsycho.logger.info(String.valueOf(Core.intervalMillis(start)));
        if (Gdx.input.isTouched()) {
            Gdx.app.exit();
        }
    }
}