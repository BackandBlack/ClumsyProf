package com.crazyprof.rendering;

import java.io.IOException;

import com.crazyprof.entity.Camera;
import com.crazyprof.entity.Entity;
import com.crazyprof.game.Main;
import com.crazyprof.util.math.Matrix4f;

public class Renderer {
	
	public static Entity[] renderableEntities;
	
	float rotCounter = 0.0f;
	static long previousTime = System.nanoTime();
	static Camera camera;
	static RenderContext target;
	
	public Renderer() throws IOException{
		target = Main.display.GetFrameBuffer();		
		camera = new Camera(new Matrix4f().InitPerspective((float)Math.toRadians(70.0f),
			   	(float)target.GetWidth()/(float)target.GetHeight(), 0.1f, 1000.0f));
	}
	
	public static void Load(Entity[] entities){
		renderableEntities = entities;
	}
	
	public static void Render(){
		long currentTime = System.nanoTime();
		float delta = (float)((currentTime - previousTime)/1000000000.0);
		previousTime = currentTime;

		camera.Update(Main.display.GetInput(), delta);
		Matrix4f vp = camera.GetViewProjection();

		target.Clear((byte)0x00);
		target.ClearDepthBuffer();

		for(int i=0;i<renderableEntities.length; i++){
			renderableEntities[i].getMesh().Draw(target, vp, renderableEntities[i].getTransform().GetTransformation(), renderableEntities[i].getTexture());
		}

		Main.display.SwapBuffers();
	}

	public static void CleanUp() {
		
	}

}
