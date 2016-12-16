package com.crazyprof.game;

import java.io.IOException;
import java.util.ArrayList;

import com.crazyprof.entity.Entity;
import com.crazyprof.util.Bitmap;
import com.crazyprof.util.Mesh;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Matrix4f;
import com.crazyprof.util.math.Vector4f;

public class Mustafar {
	
	public static ArrayList<Entity> labEntities = new ArrayList<Entity>();
	static Mesh monkeyMesh;
	static Bitmap monkeyTexture;
	static Transform monkeyTransform;
	
	public static void Init(){
		
		try {
			monkeyMesh = new Mesh("./res/smoothMonkey0.obj");
			monkeyTexture = new Bitmap("./res/bricks.jpg");
			monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
			Entity monkey = new Entity(monkeyMesh, monkeyTexture, monkeyTransform);
			labEntities.add(monkey);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run(){
		
	}
	
	public void close(){
		labEntities = null;
	}
}
