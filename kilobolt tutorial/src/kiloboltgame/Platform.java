package kiloboltgame;

import java.awt.Color;
import java.awt.Graphics;

public class Platform {

	private int x, y, width, height;

	public Platform(int type, int platx, int platy) {

		x = platx;
		y = platy;
		width = 150;
		height = 60;

	}

	public void update(Robot robot) {
		detectCollision(robot);
		int robotRight = robot.getCenterX() + 36;
		int robotLeft = robot.getCenterX() - 36;
		int robotTop = robot.getCenterY() - 64;
		int robotBot = robot.getCenterY() + 64;
	

	}

	public void drawPlatform(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);
	}

	public void detectCollision(Robot robot) {
		int robotRight = robot.getCenterX() + 36;
		int robotLeft = robot.getCenterX() - 36;
		int robotTop = robot.getCenterY() - 64;
		int robotBot = robot.getCenterY() + 64;

		if (robotBot > y && robotTop < y + height) {
			if (robotRight + robot.getSpeedX() > x && robotLeft <= (x + width)
					&& robot.getSpeedX() > 0) {
				robot.setSpeedX(0);
				robot.setCenterX(x - 37);
				System.out.println("1");

			}

			else if (robotLeft + robot.getSpeedX() < (x + width) && robotRight > x
					&& robot.getSpeedX() < 0) {
				robot.setSpeedX(0);
				robot.setCenterX(x + width + 37);
				System.out.println("2");


			}
		}

		if (robotRight > x && robotLeft < x + width) {
	
			
			if (robotBot + robot.getSpeedY() > y && robotTop < y + height
					&& robot.getSpeedY() > 0) {
				//robot.setSpeedY(0);
				robot.setCenterY(y - 66);
				robot.setJumped(false);
				System.out.println("3");


			}

			else if (robotTop + robot.getSpeedY() < y + height && robotBot > y
					&& robot.getSpeedY() < 0) {
				//robot.setSpeedY(0);
				robot.setCenterY(y + 65 + height);
				robot.setJumped(false);
				System.out.println("4");


			}
			

		}
		
		

	}

}
