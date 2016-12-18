package com.crazyprof.util.level;

import java.io.IOException;

public abstract class Level {

	public boolean isLevelCompleted = false;
	public boolean isLastLevel = false;
	String levelName;
	public Scene scenes[];
	
	public Level(int level, String name, Scene scenes[]){
		levelName = name;
		scenes[scenes.length-1].setLastScene(true);
		this.scenes = scenes;
//		System.out.println("\nLevel: " + name + " has been added to the queue.");
//		System.out.println("This Level contains " + scenes.length + " scenes");
//		for(int i=0; i<scenes.length; i++){
//			System.out.println("\t Scene " + i +":\t" + scenes[i].getName());
//		}
//		System.out.println("\n");
	}
	
	public abstract void init() throws IOException;
	
	public Scene getScene(int sceneNumber){
		return scenes[sceneNumber];
	}
	
	public Scene[] getAllScenes(){
		return scenes;
	}
	
	public Level getLevel(){
		return this;
	}
	
	public void cleanUp(){
		for(int i=0; i<scenes.length;i++){
			scenes[i] = null;
		}
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
	
	

}
