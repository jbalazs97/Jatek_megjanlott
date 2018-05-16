package com.jatek.main;

import java.awt.Graphics;

public abstract class GameObject {

	protected int x, y;
	protected int velX, velY;
	protected int x2,y2;
	protected int velX2, velY2;
	protected int boxTopX,boxTopY;
	protected int boxMidX,boxMidY;
	protected int boxBotX,boxBotY;
	protected int boxTopXVelY;
	protected int boxMidXVelY;
	protected int boxBotXVelY;
	protected int delay=0,delayV;
	protected int player1Score=0;
	protected int player2Score=0;
	

	
	public GameObject(int x, int y, int x2, int y2, int boxTopX, int boxTopY, int boxMidX, int boxMidY, int boxBotX, int boxBotY) {
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.boxTopX = boxTopX;
		this.boxTopY = boxTopY;
		this.boxMidX = boxMidX;
		this.boxMidY = boxMidY;
		this.boxBotX = boxBotX;
		this.boxBotY = boxBotY;
		
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getVelX2() {
		return velX2;
	}

	public void setVelX2(int velX2) {
		this.velX2 = velX2;
	}

	public int getVelY2() {
		return velY2;
	}

	public void setVelY2(int velY2) {
		this.velY2 = velY2;
	}

	public int getBoxTopX() {
		return boxTopX;
	}

	public void setBoxTopX(int boxTopX) {
		this.boxTopX = boxTopX;
	}

	public int getBoxTopY() {
		return boxTopY;
	}

	public void setBoxTopY(int boxTopY) {
		this.boxTopY = boxTopY;
	}

	public int getBoxMidX() {
		return boxMidX;
	}

	public void setBoxMidX(int boxMidX) {
		this.boxMidX = boxMidX;
	}

	public int getBoxMidY() {
		return boxMidY;
	}

	public void setBoxMidY(int boxMidY) {
		this.boxMidY = boxMidY;
	}

	public int getBoxBotX() {
		return boxBotX;
	}

	public void setBoxBotX(int boxBotX) {
		this.boxBotX = boxBotX;
	}

	public int getBoxBotY() {
		return boxBotY;
	}

	public void setBoxBotY(int boxBotY) {
		this.boxBotY = boxBotY;
	}

	

	
}
