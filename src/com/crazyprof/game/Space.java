package com.crazyprof.game;

import java.io.IOException;
import java.util.ArrayList;

import com.crazyprof.entity.Entity;
import com.crazyprof.util.Bitmap;
import com.crazyprof.util.Mesh;
import com.crazyprof.util.Transform;
import com.crazyprof.util.math.Vector4f;

public class Space {
	
	public static ArrayList<Entity> spaceEntities = new ArrayList<Entity>();
	static Mesh monkeyMesh;
	static Bitmap monkeyTexture;
	static Transform monkeyTransform;
	
	public static void Init(){
		
		try {
			monkeyMesh = new Mesh("./res/smoothMonkey0.obj");
			monkeyTexture = new Bitmap("./res/bricks2.jpg");
			monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
			Entity monkey = new Entity(monkeyMesh, monkeyTexture, monkeyTransform);
			spaceEntities.add(monkey);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		
	}
	
	public void close(){
		
	}

}
