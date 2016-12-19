package com.crazyprof.game.globals;

import java.io.IOException;

import com.crazyprof.util.Bitmap;

public class GlobalTextures {
	
	/*
	 * Declare all of the names of your textures here.
	 * Use specific names to keep track of all of the
	 * textures. After creating the name proceed to put
	 * the URI of the file name in the load method when
	 * creating a new Bitmap(). 
	 * 
	 */
	
	public static Bitmap monkeyTexture;
	public static Bitmap monkeyTexture2;
	
	public static void load() throws IOException{
		
		monkeyTexture = new Bitmap("./res/bricks2.jpg");
		monkeyTexture2 = new Bitmap("./res/bricks.jpg");
		
	}

}
