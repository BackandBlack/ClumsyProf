package com.crazyprof.entity;

import java.io.IOException;

import com.crazyprof.util.Bitmap;
import com.crazyprof.util.Mesh;
import com.crazyprof.util.Transform;

public class Entity {
	
	private Mesh mesh;
	private Bitmap bitmap;
	private Transform transform;
	
	public Entity(Mesh mesh, Bitmap texture, Transform transform) throws IOException{
		this.mesh = mesh;
		bitmap = texture;
		this.transform = transform;
	}

	public Mesh getMesh() {
		return mesh;
	}
	
	public Transform getTransform(){
		return transform;
	}

	public Bitmap getTexture() {
		return bitmap;
	}
}
