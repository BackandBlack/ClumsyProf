package com.crazyprof.game.levels;

import java.io.IOException;

import com.crazyprof.game.scenes.SceneAlpha;
import com.crazyprof.game.scenes.SceneBeta;
import com.crazyprof.game.scenes.SceneKappa;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;

/*
 * First, every level must extend "Level"
 */

public class IntroLevel extends Level{
	
	/*
	 * First you make static scenes of all of the scenes 
	 * you wish to add to the level.
	 */
	
	static SceneAlpha S_Alpha = new SceneAlpha();
	static SceneBeta S_Beta  = new SceneBeta();
	static SceneKappa S_Kappa = new SceneKappa();
	
	/*
	 * You must them put them into an array of scenes.
	 * They must be in order that you want them to occur.
	 */
	
	static Scene[] IntroLevelScenes = {S_Alpha, S_Beta, S_Kappa};

	/*
	 * You will need to add the constructor and call the "super"
	 * method and pass in the level number, name of the level,
	 * and the scenes to the level in an array.
	 */
	
	public IntroLevel() {
		super(0, "Intro Level", IntroLevelScenes);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.crazyprof.util.level.Level#init()
	 * 
	 * Here is where you init() the first scene by putting
	 * the scene array name from above and indexing to the 
	 * first scene which is '0' and calling the init method.
	 */
	
	public void init() throws IOException{
		IntroLevelScenes[0].init();
	}

}
