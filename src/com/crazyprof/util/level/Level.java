package com.crazyprof.util.level;

public class Level {
	
	//SceneManager sceneManager;
	
	public static String[] levelNames;
	public static int numberOfLevels;
	public static int currentLevelNum = 0;
	public static Level currentLevel;
	public static Level lastLevel;
	
	public boolean isLevelCompleted = false;
	public boolean isLastLevel = false;
	String levelName;
	public Scene scenes[];
	
	public Level(int level, String name, Scene scenes[]){
		lastLevel = this;
		numberOfLevels++;
		//levelNames[level+1] = name;
		levelName = name;
		//sceneManager = new SceneManager(scenes);
		scenes[scenes.length-1].setLastScene(true);
		this.scenes = scenes;
		System.out.println("\nLevel: " + name + " has been loaded.");
		System.out.println("This Level contains " + scenes.length + " scenes");
		for(int i=0; i<scenes.length; i++){
			System.out.println("\t Scene " + i +":\t" + scenes[i].getName());
		}
		System.out.println("\n");
	}
	
	public String getName(){
		return levelName;
	}
	
	public void setLevelComplete(boolean bool){
		isLevelCompleted = bool;
	}

	public void setLastLevel(boolean bool) {
		isLastLevel = bool;
	}
	
	public static void setCurrentLevel(Level level){
		currentLevel = level;
	}
	
	public static Level getCurrentLevel(){
		return currentLevel;
	}

}
