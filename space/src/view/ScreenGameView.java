package view;

import processing.core.PApplet;
import processing.core.PConstants;
import controller.ScreenGameController;

public class ScreenGameView {
	private PApplet app3;
	ScreenGameController SGC;
	
	//aqui se declara el controlador para poder utilizarlo
	public ScreenGameView(PApplet app3) {
		this.app3=app3;
		this.SGC = new ScreenGameController(app3);
		
	}
	
	
	//Aquí dibuja los personajes del juego
	public void drawScreenGame() {
		app3.background(0);
		drawhero();
		drawEnemy();
		
	}


	//Aquí creo el heroe 
	private void drawhero() {
		app3.rectMode(PConstants.CENTER);
		app3.fill(255,0,0);
		app3.rect(SGC.getposx(),470,50,30);
	}
	
	
	
	private void drawEnemy() {
		for (int i=1;i<25;i++) {
			SGC.setPosx(i);
			SGC.setPosy(i);
			app3.fill(0,255,0);
			app3.rect(SGC.getposxe(),SGC.getposye(),50,30);
			
		}
		
		SGC.movimientoenemy();
		
	}

	public void teclas() {
		SGC.tecla();
	}


	
}
