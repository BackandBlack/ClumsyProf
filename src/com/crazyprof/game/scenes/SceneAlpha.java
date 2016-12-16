package com.crazyprof.game.scenes;

import java.io.IOException;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.SceneTemplate;
import com.crazyprof.util.Transform;
import com.crazyprof.util.math.Vector4f;

public class SceneAlpha implements SceneTemplate{


	@Override
	public void Init() throws IOException {
		Transform monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
		Entity monkey = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform);
		entities.add(monkey);
	}

	@Override
	public void Update() {
		System.out.println("Alpha Update");
		
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		
	}
	
	

}
