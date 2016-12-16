package com.crazyprof.game.levels;

import java.io.IOException;
import java.util.ArrayList;

import com.crazyprof.game.scenes.SceneAlpha;
import com.crazyprof.game.scenes.SceneBeta;
import com.crazyprof.game.scenes.SceneKappa;
import com.crazyprof.rendering.LevelTemplate;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;

public class IntroLevel implements LevelTemplate{
	
	static Scene S_Alpha = new Scene("Alpha", SceneAlpha.entities);
	static Scene S_Beta  = new Scene("Beta" , SceneBeta.entities);
	static Scene S_Kappa = new Scene("Kappa", SceneKappa.entities);
	static Scene IntroLevelScenes[] = {S_Alpha, S_Beta, S_Kappa};
	public static Level introLevel = new Level(0, "Intro Level", IntroLevelScenes);

	
	public void Init() throws IOException{
//		LevelTemplate.runnables.add(S_Alpha);
//		LevelTemplate.runnables.add(S_Beta);
//		LevelTemplate.runnables.add(S_Kappa);
		introLevel.setLastLevel(true);
		SceneAlpha.Init();
	}
	
	public Scene getSceneAlpha(){
		return S_Alpha;
	}

}
