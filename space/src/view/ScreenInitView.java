package view;

import processing.core.PApplet;
import processing.core.PConstants;

public class ScreenInitView  {

	private PApplet app2;
	private int screen;
	
	
	// Aqu� linkeamos el Proccessing 
	public ScreenInitView(PApplet app2) {
		this.app2 =app2;
	}


	//Aqu� dibujamos la pantalla con los textos y botones
	public void drawScreenInit() {
		app2.background(0);
		drawInicio();
		drawBoton();
		
	}
	
	
	// Aqu� dibujamos el bot�n 
	private void drawBoton() {
		app2.fill(255,0,0);
		app2.rectMode(PConstants.CENTER);
		app2.rect(250,300,150,80);
		app2.textSize(25);
		app2.fill(255);
		app2.textAlign(PConstants.CENTER);
		app2.text("Start",250,310);
	}

	
	//Aqu� dibujamos el texto
	private void drawInicio() {
		app2.textSize(35);
		app2.fill(255);
		app2.textAlign(PConstants.CENTER);
		app2.text("Welcome to Space Invaders",250,150);	
	}
	
	
	//Aqui se hace la funci�n de clickear
	public int Cliquear() {
		
		if (app2.mouseX>176 && app2.mouseX<325 && app2.mouseY>260 && app2.mouseY<339) {
			screen=1;
		}
		return screen;
	}
	


	
}
