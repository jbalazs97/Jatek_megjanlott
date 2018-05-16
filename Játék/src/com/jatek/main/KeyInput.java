package com.jatek.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);

				if (tempObject.getVelX()==0)
				if (key == KeyEvent.VK_W) tempObject.setVelX(5);

				if (tempObject.getVelX2()==0)
				if (key == KeyEvent.VK_UP) tempObject.setVelX2(-5);			
			
		}
		
	}
	
	public void keyRelealsed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for (int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
							
				if (key == KeyEvent.VK_W) tempObject.setVelX(0);
				
				if (key == KeyEvent.VK_UP) tempObject.setVelX2(0);			
			
		}
		
	}
	
}
