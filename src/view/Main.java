package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	
	private Controller c;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(500, 500);
	}

	public void setup() {
		c = new Controller(this);
	}
	
	public void draw() {
		background(255);
		c.draw();
	}
	
	public void mouseClick() {
		
	}
	
	public void keyPressed() {
		if(key == CODED) {
			if(keyCode == UP) {
				c.moveUp();
			}
			if(keyCode == DOWN) {
				c.moveDown();
			}
			if(keyCode == RIGHT) {
				c.moveRight();
			}
			if(keyCode == LEFT) {
				c.moveLeft();

			}
		}
	}
}
