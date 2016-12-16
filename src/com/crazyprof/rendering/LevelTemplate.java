package com.crazyprof.rendering;

import java.util.ArrayList;

import com.crazyprof.util.level.Scene;

public interface LevelTemplate extends SceneTemplate {
	
	public static ArrayList<Scene> runnables = new ArrayList<Scene>();

	public void Init();
	
}
