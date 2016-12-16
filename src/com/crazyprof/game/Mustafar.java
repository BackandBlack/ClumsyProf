package com.crazyprof.game;

import java.io.IOException;
import java.util.ArrayList;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.SceneTemplate;
import com.crazyprof.util.Bitmap;
import com.crazyprof.util.Mesh;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Matrix4f;
import com.crazyprof.util.math.Vector4f;

public class Mustafar implements SceneTemplate{
	
	public static ArrayList<Entity> labEntities = new ArrayList<Entity>();
	
	public static ArrayList[] entityList = {labEntities};
	
	public void Init() throws IOException{
		
		Transform monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
		Entity monkey = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform);
		labEntities.add(monkey);
		
	}
	
	public void Update(){
		
	}
	
	public void Close(){
	
	}
}
