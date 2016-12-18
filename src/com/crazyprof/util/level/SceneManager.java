package com.crazyprof.util.level;

public class SceneManager {

	Scene scenes[];
	static int currentSceneNum = 0;
	static Scene currentScene;
	static Scene lastScene;
	
	public SceneManager(){
	
	}
	
	public SceneManager(Scene scenes[]){
		this.scenes = scenes;
		lastScene = scenes[scenes.length-1];
	}
	
	public void start(){
		SceneLoader.load(scenes[0]);
		currentSceneNum = 0;
	}
	
	public void load(Scene scene){
		SceneLoader.load(scene);
		setCurrentScene(scene);
	}
	
	public void update(){
		if(scenes[currentSceneNum].isSceneCompleted){
			if(!scenes[currentSceneNum].isLastScene){
				cleanUp();
				load(scenes[++currentSceneNum]);
			}else {
				//LevelManager.levels.length-1 gets number of levels
				if(LevelManager.currentLevelNum != LevelManager.levels.length-1){
					LevelManager.currentLevel.setLevelComplete(true);
				}else{
					System.out.println("End of Game.");
				}
			}
		}
	}
	
	public void cleanUp(){
		scenes[currentSceneNum] = null;
	}
	
	public static void setCurrentScene(Scene scene){
		currentScene = scene;
	}
	
	public static Scene getCurrentScene(){
		return currentScene;
	}
	
}
