package com.crazyprof.util.level;

import java.util.ArrayList;

import com.crazyprof.entity.Entity;

public class Scene {
	
	public static String[] sceneNames;
	public int numberOfScenes;
	public static int currentSceneNum = 0;
	public static Scene currentScene;
	public static Scene lastScene;
	
	public boolean isSceneCompleted = false;
	public boolean isLastScene = false;
	String sceneName;
	
	ArrayList<Entity> entities;
	
	public Scene(String name, ArrayList<Entity> entities){
		lastScene = this;
		numberOfScenes++;
		sceneName = name;
		this.entities =  new ArrayList<Entity>(entities);
		System.out.println("Scene: " + name + " has been loaded.");
	}
	
	public String getName(){
		return sceneName;
	}
	
	public void setSceneComplete(boolean bool){
		isSceneCompleted = bool;
	}

	public void setLastScene(boolean bool) {
		isLastScene = bool;
	}
	
	public static void setCurrentScene(Scene scene){
		currentScene = scene;
	}
	
	public static Scene getCurrentScene(){
		return currentScene;
	}

}
