package com.crazyprof.game.scenes;

import java.io.IOException;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.SceneCore;
import com.crazyprof.util.Transform;
import com.crazyprof.util.math.Vector4f;

public class SceneKappa extends SceneCore {

	public static void Init() throws IOException {
		Transform monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
		Entity monkey = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform, "monladfjy");
		entities.add(monkey);

	}

	@Override
	public void Update() {
		System.out.println("Kappa Update");

	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub

	}

}
