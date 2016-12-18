package com.crazyprof.util.level;

import java.io.IOException;
import java.util.ArrayList;
import com.crazyprof.entity.Entity;
import com.crazyprof.rendering.Renderer;

public abstract class Scene {

	public boolean isSceneCompleted = false;
	public boolean isLastScene = false;
	String sceneName;
	
	public ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public Scene(String name, ArrayList<Entity> entities){
		sceneName = name;
		this.entities =  new ArrayList<Entity>(entities);
		System.out.println("Scene: " + name + " has been added to the queue.");
	}
	
	public Scene(String name){
		sceneName = name;
		System.out.println("Scene: " + name + " has been added to the queue.");
	}
	
	public abstract void init() throws IOException;
	
//	public static void load(Entity[] entities){
//		Renderer.Load(entities);
//	}
//	
//	public void update(){
//		Render();
//	}
//	
//	public static void render(){
//		Renderer.Render();
//	}
//	
//	public void close(){
//		Renderer.CleanUp();
//	}
	
	public String getName(){
		return sceneName;
	}
	
	public void setSceneComplete(boolean bool){
		isSceneCompleted = bool;
	}

	public void setLastScene(boolean bool) {
		isLastScene = bool;
	}
	
	

	public Entity[] toListOfEntities(){
		Entity[] listOfEntities = new Entity[entities.size()];
		
		for(int i=0; i<entities.size();i++){
			listOfEntities[i] = entities.get(i);
		}
		
		return listOfEntities;
	}
}
