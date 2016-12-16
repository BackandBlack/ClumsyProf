package com.crazyprof.util.level;

public class SceneManager {

	Scene scenes[];
	
	public SceneManager(){
	
	}
	
	public SceneManager(Scene scenes[]){
		this.scenes = scenes;
	}
	
	public void start(){
		SceneLoader.load(scenes[0]);
		Scene.currentSceneNum = 0;
	}
	
	public void load(Scene scene){
		SceneLoader.load(scene);
		Scene.setCurrentScene(scene);
	}
	
	public void update(){
		if(scenes[Scene.currentSceneNum].isSceneCompleted){
			if(!scenes[Scene.currentSceneNum].isLastScene){
				cleanUp();
				load(scenes[++Scene.currentSceneNum]);
			}else {
				if(Level.currentLevelNum != Level.numberOfLevels){
					Level.currentLevel.setLevelComplete(true);
				}else{
					System.out.println("End of Game.");
				}
			}
		}
	}
	
	public void cleanUp(){
		
		scenes[Scene.currentSceneNum] = null;
	}
	
}
