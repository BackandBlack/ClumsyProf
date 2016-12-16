package com.crazyprof.rendering;

import java.io.IOException;
import java.util.ArrayList;

import com.crazyprof.entity.Entity;
import com.crazyprof.util.level.Scene;

public interface SceneTemplate {
	
	public ArrayList<Entity> entities = new ArrayList<Entity>();
	
//	public default void addToRunnables(){
//		runnables[runnables.length] = this;
//	}
	
	public void Init() throws IOException;
	
	public void Update();
	
	public default void Render(){
		Renderer.render();
	}
	
	public void Close();

}
