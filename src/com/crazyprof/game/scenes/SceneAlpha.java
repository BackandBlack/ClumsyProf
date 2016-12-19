package com.crazyprof.game.scenes;

import java.io.IOException;

import com.crazyprof.entity.Entity;
import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.rendering.Renderer;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Vector4f;

/*
 * First, every scene must extend "Scene"
 */

public class SceneAlpha extends Scene{
	
	//This var is just to switch scenes ass seen in the update method
	int fin = 0;
	
	/*
	 * You will need to add the constructor and call the "super"
	 * method and pass in the name of the scene.
	 */
	public SceneAlpha() {
		super("Alpha");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.crazyprof.util.level.Scene#init()
	 * 
	 * The override tag is not needed her since this is an 
	 * abstract method and must be implemented no matter what.
	 * 
	 * The init() method is where all of the entities are created.
	 * 
	 * ### You must add the entities to the "entities" ArrayList.
	 * The ArrayList is apart of the Scene abstract class. This is
	 * neccesary is need to see them in the scene. To do this, do 
	 * "entities.add().
	 * 
	 * ### You must call the load(toListOfEntities()) at the end to 
	 * them into the renderer.
	 */
	
	@Override
	public void init() throws IOException {
		Transform monkeyTransform = new Transform(new Vector4f(0.0f, 0.0f, 3.0f));
		Transform monkeyTransform2 = new Transform(new Vector4f(0.0f, 0.0f, -5.0f));
		Entity monkey1 = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform2, "yeknom");
		Entity monkey = new Entity(GlobalMeshs.monkeyMesh, GlobalTextures.monkeyTexture, monkeyTransform, "monkey");
		entities.add(monkey);
		entities.add(monkey1);
		load(toListOfEntities());
	}

	/*
	 * (non-Javadoc)
	 * @see com.crazyprof.util.level.Scene#update()
	 * 
	 * The override tag is needed here to obviously override the
	 * default update() method in scene otherwise this will never 
	 * be called. You do not need an update method but to add 
	 * logic to the game you need it.
	 */
	
	@Override
	public void update() {
		if(fin >= 100){
			setSceneComplete(true);
			close();
		}else{
			System.out.println("Alpha Update");
			Renderer.Render();
			fin++;
		}
	}
	
}
