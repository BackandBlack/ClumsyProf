package com.crazyprof.game.scenes;

import java.io.IOException;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.Renderer;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Vector4f;

public class SceneBeta extends Scene {
	
	int fin = 0;

	public SceneBeta() {
		super("Scene Beta");
	}
	
	@Override
	public void init() throws IOException {
		Transform monkeyTransform = new Transform(new Vector4f(1.0f, 0.0f, 3.0f));
		Transform monkeyTransform1 = new Transform(new Vector4f(2.0f, 0.0f, 3.0f));
		Transform monkeyTransform2 = new Transform(new Vector4f(3.0f, 0.0f, 3.0f));
		Transform monkeyTransform3 = new Transform(new Vector4f(4.0f, 0.0f, 3.0f));
		Transform monkeyTransform4 = new Transform(new Vector4f(5.0f, 0.0f, 3.0f));
		Transform monkeyTransform5 = new Transform(new Vector4f(6.0f, 0.0f, 3.0f));
		Transform monkeyTransform6 = new Transform(new Vector4f(7.0f, 0.0f, 3.0f));
		Transform monkeyTransform7 = new Transform(new Vector4f(8.0f, 0.0f, 3.0f));
		Transform monkeyTransform8 = new Transform(new Vector4f(9.0f, 0.0f, 3.0f));
		Transform monkeyTransform9 = new Transform(new Vector4f(10.0f, 0.0f, 3.0f));
		Transform monkeyTransform10 = new Transform(new Vector4f(11.0f, 0.0f, 3.0f));
		Transform monkeyTransform11 = new Transform(new Vector4f(12.0f, 0.0f, 3.0f));
		
		Entity monkey   = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture2, monkeyTransform, "yeknom");
		Entity monkey1  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform1, "yeknom");
		Entity monkey2  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture2, monkeyTransform2, "yeknom");
		Entity monkey3  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform3, "yeknom");
		Entity monkey4  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture2, monkeyTransform4, "yeknom");
		Entity monkey5  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform5, "yeknom");
		Entity monkey6  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture2, monkeyTransform6, "yeknom");
		Entity monkey7  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform7, "yeknom");
		Entity monkey8  = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture2, monkeyTransform8, "yeknom");
		Entity monkey9 = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform9, "yeknom");
		Entity monkey10 = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture2, monkeyTransform10, "yeknom");
		Entity monkey11 = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform11, "yeknom");
		entities.add(monkey);
		entities.add(monkey1);
		entities.add(monkey2);
		entities.add(monkey3);
		entities.add(monkey4);
		entities.add(monkey5);
		entities.add(monkey6);
		entities.add(monkey7);
		entities.add(monkey8);
		entities.add(monkey9);
		entities.add(monkey10);
		entities.add(monkey11);
		load(toListOfEntities());
	}

	@Override
	public void update() {
		if(fin >= 100){
			setSceneComplete(true);
			close();
		}else{
			System.out.println("Beta Update");
			Renderer.Render();
			fin++;
		}
	}

}
