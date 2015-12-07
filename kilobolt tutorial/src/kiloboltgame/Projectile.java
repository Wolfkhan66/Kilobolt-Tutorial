package kiloboltgame;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile {
	private int x, y, speedX;

	
	public Projectile(int xPos, int yPos){
		
		x = xPos;
		y = yPos;
		speedX = 10;
	}

	public void update() {
		
	x += speedX;	
	

	}

}