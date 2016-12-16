package com.crazyprof.game;

import java.awt.event.KeyEvent;
import java.io.IOException;

import com.crazyprof.entity.Camera;
import com.crazyprof.game.levels.IntroLevel;
import com.crazyprof.rendering.Display;
import com.crazyprof.rendering.LevelTemplate;
import com.crazyprof.rendering.RenderContext;
import com.crazyprof.rendering.Renderer;
import com.crazyprof.rendering.SceneTemplate;
import com.crazyprof.util.Bitmap;
import com.crazyprof.util.Mesh;
import com.crazyprof.util.Transform;
import com.crazyprof.util.level.Level;
import com.crazyprof.util.level.LevelManager;
import com.crazyprof.util.level.Scene;
import com.crazyprof.util.math.Matrix4f;
import com.crazyprof.util.math.Quaternion;
import com.crazyprof.util.math.Vector4f;

import jdk.nashorn.internal.ir.WhileNode;

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
		// Define Levels(made up of scene classes)
		IntroLevel introLevel = new IntroLevel();
		introLevel.Init();
		
		//Here to update game and scenes
		while(true){
			LevelTemplate.runnables.get(0);
		}
	}
}