package com.crazyprof.game.scenes;

import java.io.IOException;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.SceneCore;
import com.crazyprof.util.Transform;
import com.crazyprof.util.math.Vector4f;

public class SceneAlpha extends SceneCore{
	
	int next = 5;


	public static void Init() throws IOException {
		Transform monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
		Transform monkeyTransform2 = new Transform(new Vector4f(0.0f, 0.0f, -5.0f));
		Entity monkey1 = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform2, "yeknom");
		Entity monkey = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform, "monkey");
		entities.add(monkey);
		entities.add(monkey1);
		//Entity[] list = {monkey};
		Load(toListOfEntities());
		
	}


	public void Update() {
		System.out.println("Alpha Update");
		Render();
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		
	}
	
	

}
