package view;

import processing.core.PApplet;
import view.ScreenInitView;
import view.ScreenGameView;
import view.ScreenResultView;


public class Main extends PApplet {

	int pantallas;
	ScreenInitView SIV;
	ScreenGameView SGV;
	ScreenResultView SRV;
	
	
	public static void main(String[] args) {
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(500,500);
		//frameRate(30);
	}
	
	public void setup() {
		pantallas=0;
		SIV = new ScreenInitView(this);
		SGV = new ScreenGameView(this);
		SRV= new ScreenResultView();
	
	}
	
	public void draw(){
		background(0);
		switch (pantallas) {
		
		case 0:	
			SIV.drawScreenInit();
			fill(255);
			textSize(30);
			text("X "+ mouseX+"Y: "+ mouseY, mouseX ,mouseY);
			
			break;
		case 1:
			
			SGV.drawScreenGame();
			
			
			break;
		case 2:
			
			
			
			break;
		
		
		}
	}
	
	public void mouseClicked() {
		switch (pantallas) {
		case 0:
			pantallas= SIV.Cliquear();
			break;
		}
	}
	
	public void keyPressed() {
		switch (pantallas) {
		case 1:
			SGV.teclas();
		break;
		
		}
		
		
	}
	
	
	
}
