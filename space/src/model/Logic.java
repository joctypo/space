package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logic {
	PApplet app6;
	private int posx;
	private int posye=100;
	private int posxe=50;
	private int contador=0;
	ArrayList<Personajes> personas;
	
	//Aqu� se linkea el app y definimos el arraylist, tambi�n definimos el posx original del heroe
	public Logic(PApplet app6) {
		personas=new ArrayList <Personajes>();
		creararreglo();
		posx=personas.get(0).getPosx();
	}
	
	// Aqu� rellenamos un arreglo para saber donde van los enemigos y el heroe
	private void creararreglo() {
		personas.add(new Heroe(250,450));
		for (int i=1;i<25;i++) {
		
				
				personas.add(new Enemigo(posxe,posye));
				posxe=posxe+80;
				contador +=1;
				
				if (contador == 6) {
					
					posye=posye+50;
					posxe=50;
					contador=0;
				}
				
			
		}
	}

	
	//Aqui creamos balas 
	public void anadirbalas() {
		app6.fill(0);
	}
	
	
	//Esta funci�n suma el cambio al mover 
	public void mover(int i) {
		
		if(posx>25 && posx<475) {
		posx=posx+i;	
		}
		if(posx>=475 && i==-25) {
		posx=posx+i;
		}
		if (posx<=25 && i==25) {
		posx=posx+i;
		}
	}
	
	
	//Esta funci�n envia el Posx a el controller
	public int getPosx() {
		
		return posx;
	}

	public void posyenemy(int posy) {
		
		posye=personas.get(posy).getPosy();
		
	}
	
	
	public int posye() {
		return posye;
		
	}

	
	public void posxenemy(int posx2) {
		posxe=personas.get(posx2).getPosx();
		
	}

	public int posxe() {
	
		return posxe;
	}

	public void comosemueve() {
		for(int i=1;i<25;i++) {
		personas.get(i).mover2();
		}
		
	}

	
	



}
