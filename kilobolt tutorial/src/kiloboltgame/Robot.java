package kiloboltgame;

import java.awt.Color;
import java.awt.Graphics;

public class Robot {

	int centerX = 100;
	int centerY = 418;
	boolean jumped = false;
			
	int speedX = 0;
	int speedY = 1;
	int width = 10;
	int height = 10;
	


	public void update() {
		centerX += speedX;
		centerY += speedY;
		
		if (centerY + speedY >= 418){
			centerY = 418;
		}
		

		
		if (jumped == true){
			speedY += 1;
			
			if (centerY + speedY >= 418){
				centerY = 418;
				speedY = 0;
				jumped = false;
			}
			
		}
		
		if (centerX + speedX >= 740){
			centerX = 739;
		}
		
		if (centerX + speedX <= 60){
			centerX = 61;
		}
	} 
	
	public void moveRight(){
		speedX = 6;
	}
	
	public void moveLeft(){
		speedX = -6;
	}
	
	public void stop(){
		speedX = 0;
	}
	public void drawBot(Graphics g, Color c) {

		//TEMP
		
		g.setColor(Color.CYAN);
		g.drawRect(centerX - 36, centerY - 64, 72, 128);
//		String str1 = Integer.toString(centerX - 36);
//		String str2 = Integer.toString(centerY - 64);
//		String str3 = Integer.toString(centerX + 36);
//		String str4 = Integer.toString(centerY + 64);
//		
//		System.out.println("Top Left X" + str1);
//		System.out.println("Top Left Y" + str2);
//		System.out.println("Bottom Right X" + str3);
//		System.out.println("Bottom Right Y" + str4);
		
		g.setColor(c);
		int bodyWidth = 40;
		int bodyHeight = 44;

		int bodyX = centerX - bodyWidth / 2;
		int bodyY = centerY - bodyHeight / 2;
		int bodyX2 = bodyX + bodyWidth;
		int bodyY2 = bodyY + bodyHeight;

		int headWidth = 32;
		int headHeight = 32;

		int armLength = 30;
		int armHeight = 16;

		int legHeight = 16;
		int legWidth = 16;

		int feetWidth = 32;
		int feetHeight = 12;

		// Body X, Y

		g.drawRect(bodyX, bodyY, bodyWidth, bodyHeight);

		// Head

		g.drawRect(centerX - headWidth / 2, bodyY - headHeight - 10, headWidth,
				headHeight);

		// Arms

		g.drawRect(bodyX - armLength - 10, bodyY, armLength, armHeight);
		g.drawRect(bodyX2 + 10, bodyY, armLength, armHeight);

		// Legs

		g.drawRect(bodyX, bodyY2 + 10, legWidth, legHeight);
		g.drawRect(bodyX2 - legWidth, bodyY2 + 10, legWidth, legHeight);

		// Feet

		g.drawRect(bodyX - feetWidth / 2, bodyY2 + 10 + legHeight, feetWidth,
				feetHeight);
		g.drawRect(bodyX2 - feetWidth / 2, bodyY2 + 10 + legHeight, feetWidth,
				feetHeight);
		


	}

	public void jump() {
		if (jumped == false){
			speedY = -15;
			jumped = true;
		}
				
	}
	
	//GETTERS AND SETTERS
	
	public int getCenterX() {
		return centerX;
	}
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}
	
	public  int getCenterY() {
		return centerY;
	}
	
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}
	
	public int getSpeedX() {
		return speedX;
	}
	
	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	
	public int getSpeedY() {
		return speedY;
	}
	
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
		
	}
	
	public void setJumped(boolean jumped) {
		this.jumped = jumped;
	}
}
