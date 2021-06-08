package model;

import processing.core.PApplet;

public class Logic {
	private PApplet app;
	private Circle[][] matrix;
	private int cordX;
	private int cordY;
	private int posX;
	private int posY;
	
	public Logic(PApplet app) {
		this.app = app;
		matrix = new Circle[10][10];
		
		cordX = 0;
		cordY = 0;
		posX = 0;
		posY = 0;
		calPos();
		addCircle();
	}
	
	public void calPos() {
		posX = (24*cordX) + 100;
		posY = (24*cordY) + 100;
	}
	
	public void addCircle() {
		matrix[cordX][cordY] = new Circle(posX, posY, app);
	}
	
	public void findCircle() {
		for(int x = 0; x < matrix.length; x++) {
			for(int y = 0; y < matrix.length; y++) {
				if(matrix[x][y] != null) {
					cordX = x;
					cordY = y;
				}
			}
		}
	}
	
	public void draw() {
		try {
			if(matrix[cordX][cordY] != null) {
				matrix[cordX][cordY].draw();
			}
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}

	public void moveCircleUp() {
		try {
			if(cordY - 1 > -1) {
				cordY -= 1;
				calPos();
				matrix[cordX][cordY] = new Circle(posX, posY, app);
				matrix[cordX][cordY + 1] = null;
			}
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}
	
	public void moveCircleLeft() {
		try {
			if(cordX - 1 > -1) {
				cordX -= 1;
				calPos();
				matrix[cordX][cordY] = new Circle(posX, posY, app);
				matrix[cordX][cordY + 1] = null;
			}
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}
	
	public void moveCircleDown() {
		try {
			if(cordY + 1 < matrix.length) {
				cordY += 1;
				calPos();
				matrix[cordX][cordY] = new Circle(posX, posY, app);
				matrix[cordX][cordY - 1] = null;
			}
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}
	
	public void moveCircleRight() {
		try {
			if(cordX + 1 < matrix.length) {
				cordX += 1;
				calPos();
				matrix[cordX][cordY] = new Circle(posX, posY, app);
				matrix[cordX][cordY - 1] = null;
			}
		}
		catch(Exception e) {
			e.getLocalizedMessage();
		}
	}
	
	public int getMatrixLenght() {
		return matrix.length;
	}
}
