package com.crazyprof.game.globals;

import java.io.IOException;

import com.crazyprof.util.Mesh;

public class GlobalMeshs {
	
	/*
	 * Declare all of the names of your meshes here.
	 * Use specific names to keep track of all of the
	 * meshes. After creating the name proceed to put
	 * the URI of the file name in the load method when
	 * creating a new Mesh(). 
	 * 
	 */
	
	public static Mesh monkeyMesh;
	public static Mesh barrelMesh;
	
	public static void load() throws IOException{
		monkeyMesh = new Mesh("./res/smoothMonkey0.obj");
		barrelMesh = new Mesh("./res/barrel.obj");
	}

}
