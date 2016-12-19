package com.crazyprof.game.scenes;

import java.io.IOException;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.Renderer;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Vector4f;

public class SceneKappa extends Scene {
	
	int fin = 0;

	public SceneKappa() {
		super("Scene Kappa");
	}
	
	@Override
	public void init() throws IOException {
		Transform monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
		Entity monkey = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform, "monladfjy");
		entities.add(monkey);
		load(toListOfEntities());
	}

	@Override
	public void update() {
		if(fin >= 100){
			setSceneComplete(true);
			close();
		}else{
			System.out.println("Kappa Update");
			Renderer.Render();
			fin++;
		}
	}

}
