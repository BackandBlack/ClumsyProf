package com.crazyprof.util.level;

public class LevelManager {
	
	SceneManager sceneManager;
	
	static Level levels[];
	
	public LevelManager(Level levels[]){
		LevelManager.levels = levels;
	}
	
	public void start(){
		load(levels[0]);
		sceneManager.start();
	}
	
	public void load(Level level){
		sceneManager = null;
		sceneManager = new SceneManager(level.scenes);
		LevelLoader.load(level);
		Level.setCurrentLevel(level);
	}
	
	public void update(){
		sceneManager.update();
		if(levels[Level.currentLevelNum].isLevelCompleted && !levels[Level.currentLevelNum].isLastLevel){
			cleanUp();
			load(levels[++Level.currentLevelNum]);getClass();
			sceneManager.start();
		}
	}
	
	public void cleanUp(){
		levels[Level.currentLevelNum] = null;
	}
}
