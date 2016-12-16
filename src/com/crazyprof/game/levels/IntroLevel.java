package com.crazyprof.game.levels;

import java.util.ArrayList;

import com.crazyprof.game.scenes.SceneAlpha;
import com.crazyprof.game.scenes.SceneBeta;
import com.crazyprof.game.scenes.SceneKappa;
import com.crazyprof.rendering.LevelTemplate;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;

public class IntroLevel {
	
	Scene S_Alpha = new Scene("Alpha", SceneAlpha.entities);
	Scene S_Beta  = new Scene("Beta" , SceneBeta.entities);
	Scene S_Kappa = new Scene("Kappa", SceneKappa.entities);
	Scene IntroLevelScenes[] = {S_Alpha, S_Beta, S_Kappa};
	Level IntroLevel = new Level(0, "Intro Level", IntroLevelScenes);
	
	public void Init(){
		LevelTemplate.runnables.add(S_Alpha);
		LevelTemplate.runnables.add(S_Beta);
		LevelTemplate.runnables.add(S_Kappa);
	}

}
