/*
 * File: Pyramid.java
 * ------------------
 * This program is a stub for the Pyramid problem, which draws
 * a brick pyramid.
 */

import acm.program.*;
import acm.graphics. *;
import java.awt.*;

public class Pyramid extends GraphicsProgram {
	private static final double width = 30;
	private static final double height = 12; 
	private static int bricksInBase = 14;
	private int xCurser = 100;
	private int yCurser = 479;
	
	public void run() {	
		for (int i = 1; i < 15; i++){
			buildLayer();
			yCurser = yCurser - 12;
			xCurser = 100 + 15*i;
			bricksInBase = 14 - 1 * i;
			 
		}
	}
	private void buildLayer() {
		for (int i = 0; i < bricksInBase; i++){
			GRect brick = new GRect(width, height);
			add(brick);
			brick.setLocation(xCurser, yCurser);
			xCurser = xCurser + 30;
		}
	}
}