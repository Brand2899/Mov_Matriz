package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	private PApplet app;
	private Logic l;
	
	public Controller(PApplet app) {
		this.app = app;
		l = new Logic(app);
	}
	
	public void draw() {
		l.draw();
	}
	
	public void moveUp() {
		l.moveCircleUp();
	}
	
	public void moveDown() {
		l.moveCircleDown();
	}
	
	public void moveLeft() {
		l.moveCircleLeft();
	}
	
	public void moveRight() {
		l.moveCircleRight();
	}
	
	public int matrixLenght() {
		return l.getMatrixLenght();
	}
}
