package com.crazyprof.game.globals;

import java.io.IOException;

import com.crazyprof.util.Bitmap;

public class GlobalTextures {
	
	public static Bitmap monkeyTexture;
	
	public static void load() throws IOException{
		
		monkeyTexture = new Bitmap("./res/bricks2_normal.jpg");
		
	}

}
