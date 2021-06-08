package model;

import processing.core.PApplet;

public class Circle {
	private int posX;
	private int posY;
	private PApplet app;
	
	public Circle(int posX, int posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
	}
	
	public void draw() {
		app.fill(0, 0, 0);
		app.noStroke();
		app.circle(posX, posY, 20);
	}
}