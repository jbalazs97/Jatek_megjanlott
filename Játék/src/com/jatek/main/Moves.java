package com.jatek.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Moves extends GameObject{
	
	
	public void move() {

		velY=0;
		int out=0;
		int melyik = 0;
		do {

			
			if ((y >= boxTopY) && (y <= boxTopY+40)) melyik = 1;
			if ((y >= boxMidY) && (y <= boxMidY+40)) melyik = 2;
			if ((y >= boxBotY) && (y <= boxBotY+40)) melyik = 3;
			
			if (melyik == 1) if ( x >= boxTopX-100)	velX = -5;
			if (melyik == 2) if ( x >= boxMidX-100)	velX = -5;
			if (melyik == 3) if ( x >= boxBotX-100)	velX = -5;
			
			if (melyik == 0) if ( x >= 300 )	velX = -5;
					
			if ( x <= 50 ) { out++;velX=0; velY=5; }
			
		} while ( out == 1 );
		
		
	}
	
	public void move2() {
		
			velY2=0;
			int out=0;
			int melyik=0;
			do {
				
				if ((y2 >= boxTopY) && (y2 <= boxTopY+40)) melyik=1;	
				if ((y2 >= boxMidY) && (y2 <= boxMidY+40)) melyik=2;
				if ((y2 >= boxBotY) && (y2 <= boxBotY+40)) melyik=3;
							
				if (melyik == 1) if ( x2 <= boxTopX+160)	velX2 = 5;
				if (melyik == 2) if ( x2 <= boxMidX+160)	velX2 = 5;
				if (melyik == 3) if ( x2 <= boxBotX+160)	velX2 = 5;
						 
				if (melyik == 0) if ( x2 <= 560 )	velX2 = 5;
					
				if ( x2 >= 960-150 ) { out++;velX2=0; velY2=5; }
				
			} while (out==1);
			
			
		}
	
	public void boxTopMove() {
		boxTopXVelY = 5;
		if ( boxTopY >= 520 ) boxTopXVelY =0; 
		
	}
	public void boxMidMove() {
		boxMidXVelY = 5;
		if ( boxMidY >= 520 ) boxMidXVelY =0; 
		
	}
	public void boxBotMove() {
		boxBotXVelY = 5;
		if ( boxBotY >= 520 ) boxBotXVelY =0; 
		
	}
	
	public void restart() {
		
		velX=0; velY=0; velX2=0; velY2=0;
		
		
		delayV = 5;
		
		if (delay==400)  {  
			
			x=50;
			y=100;
			x2= 960-150;
			y2 = 50;
			boxTopX = 400;
			boxTopY=100;
			boxMidX=400;
			boxMidY=240;
			boxBotX=400;
			boxBotY=380;
			
			velY = 5;
			velY2 = 5;
			
			delayV=0;
			delay=0;
			if ( boxBotX == 220)
			player1Score+=1;
			else player2Score+=1;
		}
		
	}
	


	public Moves(int x, int y, int x2 ,int y2, int boxTopX, int boxTopY, int boxMidX, int boxMidY, int boxBotX, int boxBotY) {
		super(x, y,x2,y2,boxTopX,boxTopY,boxMidX,boxMidY,boxBotX,boxBotY);
		
		velY = 5;
		velY2 = 5;
	
	}

	public void tick() {
		
		boxTopY += boxTopXVelY;
		boxMidY += boxMidXVelY;
		boxBotY += boxBotXVelY;
		delay += delayV;
		
		//Player_1 move
		
				x += velX;
				y += velY;

				if ( y <= 0 || y >= Game.HEIGHT-50) velY *= -1;
				
				if (velX != 0) move(); 
				
		//Player_2 move
		
		x2 += velX2;
		y2 += velY2;
		
		if ( y2 <= 0 || y2 >= Game.HEIGHT-50) velY2 *= -1;
		
		if (velX2 != 0) move2();	
		
		//Box moves

					if ((x == (boxTopX-100)) &&  (y >= boxTopY) && (y <= (boxTopY+40))) {
						boxTopX += 60;
					}

					if ((x2 == (boxTopX+160)) &&  (y2 >= boxTopY) && (y2 <= (boxTopY+40))) {
						boxTopX -= 60;
						}
								
					if ( boxTopX == 220 || boxTopX == 580 ) {				
						boxTopMove();
						if ( boxTopY >= 520 ) restart();	
						}
							
						
					
				if ((x == (boxMidX-100)) &&  (y >= boxMidY) && (y <= (boxMidY+40))) {
					boxMidX += 60;
					}
				
				if ((x2 == (boxMidX+160)) &&  (y2 >= boxMidY) && (y2 <= (boxMidY+40))) {
					boxMidX -= 60;
				}
				
				if ( boxMidX == 220 || boxMidX == 580 ) {
					boxMidMove();
					if ( boxMidY >= 520 ) restart();	
				}
				
				if ((x == (boxBotX-100)) &&  (y >= boxBotY) && (y <= (boxBotY+40))) {
					boxBotX += 60;
					}
				
				if ((x2 == (boxBotX+160)) &&  (y2 >= boxBotY) && (y2 <= (boxBotY+40))) {
					boxBotX -= 60;
				}
				
				if ( boxBotX == 220 || boxBotX == 580 ) {	
					boxBotMove();
					if ( boxBotY >= 520 ) restart();	
				}
					
		

	
		
		
	}

	public void render(Graphics g) {
		
		Font fnt = new Font ("arial",1,50);
		
		g.setFont(fnt);
		
		g.setColor(Color.white);
		g.drawString(String.valueOf(player1Score), 200, 50);
		
		g.setColor(Color.white);
		g.drawString(String.valueOf(player2Score), 760, 50);
		
		
		 g.setColor(Color.white);
			g.fillRect(x, y, 100, 16);
			
			g.setColor(Color.blue);
			g.fillRect(x2, y2, 100, 16);
			
			
			
			g.setColor(Color.gray);
			g.fillRect(400, 0, 160, 100);
			
				//felso
				g.setColor(Color.red);
				g.fillRect(boxTopX, boxTopY, 160, 40);
			
			g.setColor(Color.gray);
			g.fillRect(400, 140, 160, 100);
			
				//kozepso
				g.setColor(Color.red);
				g.fillRect(boxMidX, boxMidY, 160, 40);
			
			g.setColor(Color.gray);
			g.fillRect(400, 280, 160, 100);
			
				//also
				g.setColor(Color.red);
				g.fillRect(boxBotX, boxBotY, 160, 40);
			
			g.setColor(Color.gray);
			g.fillRect(400, 420, 160, 400);
		
	}

}
