package com.crazyprof.game.globals;

import java.io.IOException;

import com.crazyprof.util.Mesh;

public class GlobalMeshs {
	
	public static Mesh monkeyMesh;
	
	public static void load() throws IOException{
		monkeyMesh = new Mesh("./res/smoothMonkey0.obj");
	}

}
