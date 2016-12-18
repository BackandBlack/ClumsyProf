package com.crazyprof.game.levels;

import java.io.IOException;

import com.crazyprof.game.scenes.SceneAlpha;
import com.crazyprof.game.scenes.SceneBeta;
import com.crazyprof.game.scenes.SceneKappa;
import com.crazyprof.rendering.LevelTemplate;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;

public class Naboo extends Level{
	
	public Naboo(int level, String name, Scene[] scenes) {
		super(level, name, scenes);
		// TODO Auto-generated constructor stub
	}




	static Scene S_Alpha = new Scene("Alpha", SceneAlpha.entities);
	static Scene S_Beta  = new Scene("Beta" , SceneBeta.entities);
	static Scene S_Kappa = new Scene("Kappa", SceneKappa.entities);
//	scenes = {S_Alpha, S_Beta, S_Kappa};
//	level = new Level(0, "Naboo", scenes);
	
	

	
	public void Init() throws IOException {
		//level.setLastLevel(true);
		SceneAlpha.Init();
	}
}
