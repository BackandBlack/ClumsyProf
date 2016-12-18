package com.crazyprof.util.level;

public class LevelManager {
	
	SceneManager sceneManager;
	static int currentLevelNum = 0;
	static Level currentLevel;
	static Level lastLevel;
	static Level levels[];
	
	public LevelManager(Level levels[]){
		LevelManager.levels = levels;
		lastLevel = levels[levels.length-1];
		lastLevel.setLastLevel(true);
	}
	
	public void start(){
		load(levels[0]);
		sceneManager.start();
	}
	
	public void load(Level level){
		sceneManager = null;
		sceneManager = new SceneManager(level.scenes);
		LevelLoader.load(level);
		setCurrentLevel(level);
	}
	
	public void update(){
		sceneManager.update();
		if(levels[currentLevelNum].isLevelCompleted && !levels[currentLevelNum].isLastLevel){
			cleanUp();
			load(levels[++currentLevelNum]);
			sceneManager.start();
		}
	}
	
	public void cleanUp(){
		levels[currentLevelNum] = null;
	}
	
	public static void setCurrentLevel(Level level){
		currentLevel = level;
	}
	
	public static Level getCurrentLevel(){
		return currentLevel;
	}
}
