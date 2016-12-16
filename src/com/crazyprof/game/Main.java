package com.crazyprof.game;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.crazyprof.entity.Camera;
import com.crazyprof.rendering.Display;
import com.crazyprof.rendering.RenderContext;
import com.crazyprof.util.Bitmap;
import com.crazyprof.util.Mesh;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.LevelManager;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Matrix4f;
import com.crazyprof.util.math.Quaternion;
import com.crazyprof.util.math.Vector4f;

/**
 * The sole purpose of this class is to hold the main method.
 *
 * Any other use should be placed in a separate class
 */
public class Main
{
	// Lazy exception handling here. You can do something more interesting 
	// depending on what you're doing
	public static void main(String[] args) throws IOException
	{
		Mustafar.Init();
		Scene lab = new Scene("Lab", Mustafar.labEntities);
		Scene space = new Scene("Space", Space.spaceEntities);
		Scene scenesForLevel1[] = {lab, space};
		Level level1 = new Level(0, "Mustafar", scenesForLevel1);
		Level levels[] = {level1};
		
//		Scene Alpha = new Scene("Alpha");
//		Scene Beta = new Scene("Beta");
//		Scene Kappa = new Scene("Kappa");
//		Scene scenesForLevel1[] = {Alpha, Beta, Kappa};
//		
//		Level Level1 = new Level(0, "Level 1", scenesForLevel1);
//		
//		Scene Moo = new Scene("Moo");
//		Scene Loo = new Scene("Loo");
//		Scene Poo = new Scene("Poo");
//		Scene Koo = new Scene("Koo");
//		Scene scenesForLevel2[] = {Moo, Loo, Poo, Koo};
//		
//		Level Level2 = new Level(1, "Level 2", scenesForLevel2);
//		
//		Scene Mason = new Scene("Mason");
//		Scene Evon = new Scene("Evon");
//		Scene Vortex = new Scene("Vortex");
//
//		Scene scenesForLevel3[] = {Mason, Evon, Vortex};
//		
//		Level Level3 = new Level(2, "Level 3", scenesForLevel3);
//		Level3.setLastLevel(true);
//		
//		Level levels[] = {Level1, Level2, Level3};
//		
		LevelManager levelManager = new LevelManager(levels);
		levelManager.start();
//		
//		
//		while(true){
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			levelManager.update();
////			System.out.println("Current lvl: " + Level.currentLevel.hashCode());
////			System.out.println("Current scn: " + Scene.currentScene.hashCode());
////			for(int i=0;i<scenesForLevel1.length; i++){
////				scenesForLevel1[i].setSceneComplete(true);
////			}
//			Alpha.setSceneComplete(true);
//			Beta.setSceneComplete(true);
//			Kappa.setSceneComplete(true);
//			Moo.setSceneComplete(true);
//			Loo.setSceneComplete(true);
//			Poo.setSceneComplete(true);
//			Koo.setSceneComplete(true);
//			Mason.setSceneComplete(true);
//			Evon.setSceneComplete(true);
//			Vortex.setSceneComplete(true);
////			Level1.setLevelComplete(true);
////			Level2.setLevelComplete(true);
////			Level3.setLevelComplete(true);
//			if(Level.getCurrentLevel() == Level.lastLevel && Level.getCurrentLevel().isLevelCompleted){
//				break;
//			}
//		}
		
		Display display = new Display(800, 600, Level.getCurrentLevel().getName());
		RenderContext target = display.GetFrameBuffer();
		Camera camera = new Camera(new Matrix4f().InitPerspective((float)Math.toRadians(70.0f),
			   	(float)target.GetWidth()/(float)target.GetHeight(), 0.1f, 1000.0f));
		
		float rotCounter = 0.0f;
		long previousTime = System.nanoTime();
		while(true)
		{
			
			long currentTime = System.nanoTime();
			float delta = (float)((currentTime - previousTime)/1000000000.0);
			previousTime = currentTime;

			camera.Update(display.GetInput(), delta);
			Matrix4f vp = camera.GetViewProjection();

//			monkeyTransform = monkeyTransform.Rotate(new Quaternion(new Vector4f(0,1,0), delta));

			target.Clear((byte)0x00);
			target.ClearDepthBuffer();
//			monkey.Draw(target, vp,.GetTransformation(), texture2);
			Mustafar.labEntities.get(0).getMesh().Draw(target, vp, 
											Mustafar.labEntities.get(0).getTransform().GetTransformation(), 
											Mustafar.labEntities.get(0).getTexture());
			
//			terrainMesh.Draw(target, vp, terrainTransform.GetTransformation(), texture);

			display.SwapBuffers();
			levelManager.update();
		}
		
		

	}
}