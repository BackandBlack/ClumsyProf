package com.crazyprof.util.level;

import java.io.IOException;

public class LevelLoader {
	
	public static void load(Level level){
		try {
			level.init();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(level.getName() + " is being loaded.");
	}

}
