package com.crazyprof.util.level;

import java.io.IOException;

public class SceneLoader {

	public static void load(Scene scene){
		try {
			scene.init();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(scene.getName() + " is being loaded.");
	}
	
}
