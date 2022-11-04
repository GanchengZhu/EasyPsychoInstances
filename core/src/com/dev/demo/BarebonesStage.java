package com.dev.demo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.viewport.*;

public class BarebonesStage extends ApplicationAdapter {
	Stage stage;

	public void create () {
		stage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(stage);

		Skin skin = new Skin(Gdx.files.internal("skin.json"));
		Label label = new Label("Some Label", skin);
		TextButton button = new TextButton("Some Button", skin);

		Table table = new Table();
		stage.addActor(table);
		table.setFillParent(true);

		table.debug();
		table.defaults().space(6);
		table.add(label);
		table.add(button);
	}

	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}

	public void resize (int width, int height) {
		// Pass false to not modify the camera position.
		stage.getViewport().update(width, height, true);
	}

}