package com.softgaroo.cclgdxdemos;

import org.cclgdx.actions.base.CCActionCallback;
import org.cclgdx.director.CCDirector;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MainActivity extends AndroidApplication {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();

		final CCDirector director = CCDirector.sharedDirector();

		director.setReadyCallback(new CCActionCallback() {
			@Override
			public void execute() {
				director.runWithScene(DemoMainMenuLayer.scene());
			}
		});

		initialize(director.getGame(), cfg);
	}
}