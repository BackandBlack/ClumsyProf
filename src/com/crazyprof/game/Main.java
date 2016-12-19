package com.crazyprof.game;

import java.io.IOException;

import com.crazyprof.game.globals.GlobalMeshs;
import com.crazyprof.game.globals.GlobalTextures;
import com.crazyprof.game.levels.IntroLevel;
import com.crazyprof.game.levels.Naboo;
import com.crazyprof.game.scenes.SceneAlpha;
import com.crazyprof.rendering.Display;
import com.crazyprof.rendering.Renderer;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.LevelManager;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.level.SceneManager;

public class Main
{
	public static Display display;

	public static void main(String[] args) throws IOException
	{
		/*
		 * This you must load the Meshes and Textures from the
		 * GlobalMeshs and Global Texture Classes. This will result
		 * in an error if not done. (NULL POINTER EXCEPTION in the 
		 * Renderer Class at renderalbleEntities)
		 * 
		 */
		GlobalMeshs.load();
		GlobalTextures.load();
		
		/*
		 * This is where you put the constructor for your levels.
		 * This must be done after the Globals are loaded so the 
		 * meshes can be initialized and loaded. After constructing
		 * the levels, you need to Init() the levels.
		 * 
		 */
		Naboo naboo = new Naboo();
		naboo.init();
		IntroLevel introLevel = new IntroLevel();
		
		/*
		 * This is where the Level Manager is constructed and started.
		 * You must add your level to the level Array in chronological
		 * order so the manager can run them in order.
		 * 
		 */
		Level levels[] = {naboo, introLevel};
		LevelManager levelManager = new LevelManager(levels);
		levelManager.start();
		
		/*
		 * The Display must be created before the renderer bacause I can't
		 * Code. Sorry...
		 */
		display = new Display(800, 600, LevelManager.getCurrentLevel().getName());
		
		/*
		 * Just construct the renderer here and forget about it.
		 */
		Renderer renderer = new Renderer();
				
		/*
		 * In the while loop update the level manager and update the current
		 * scene but accessing it from the current level.
		 * 
		 */
		while(true){
			levelManager.update();
			LevelManager.getCurrentLevel().scenes[SceneManager.currentSceneNum].update();
//			introLevel.getSceneAlpha().Upda;
//			sceneAlpha.Update();
			if(LevelManager.getCurrentLevel().isLastLevel && LevelManager.getCurrentLevel().isLevelCompleted){
				break;
			}
		}
		
		
	}
}