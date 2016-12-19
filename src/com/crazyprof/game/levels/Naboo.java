package com.crazyprof.game.levels;

import java.io.IOException;

import com.crazyprof.game.scenes.SceneAlpha;
import com.crazyprof.game.scenes.SceneBeta;
import com.crazyprof.game.scenes.SceneKappa;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;

public class Naboo extends Level{
	
	static SceneAlpha S_Alpha = new SceneAlpha();
	static SceneBeta S_Beta  = new SceneBeta();
	static SceneKappa S_Kappa = new SceneKappa();
	static Scene[] scenes = {S_Alpha, S_Beta, S_Kappa};
	
	public Naboo() {
		super(1, "Naboo", scenes);
	}

	@Override
	public void init() throws IOException {
		scenes[0].init();
	}
}
