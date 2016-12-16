package com.crazyprof.rendering;

import java.io.IOException;
import java.util.ArrayList;

import com.crazyprof.entity.Entity;
import com.crazyprof.util.level.Scene;

public abstract class SceneCore {
	
	public static ArrayList<Entity> entities = new ArrayList<Entity>();
	
//	public default void addToRunnables(){
//		runnables[runnables.length] = this;
//	}
	
	public static void Init() throws IOException{
		
	};
	
	public static void Load(Entity[] entities){
		Renderer.Load(entities);
	}
	
	public void Update(){
		Render();
	}
	
	public static void Render(){
		Renderer.Render();
	};
	
	public void Close(){
		Renderer.CleanUp();
	};
	
	public static Entity[] toListOfEntities(){
		Entity[] listOfEntities = new Entity[entities.size()];
		
		for(int i=0; i<entities.size();i++){
			listOfEntities[i] = entities.get(i);
		}
		
		return listOfEntities;
	}

}
