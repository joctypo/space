package model;

public class Enemigo extends Personajes {

	private int cambia=5;
	public Enemigo(int posX, int posY) {
		
		super(posX, posY);
		
		
		// TODO Auto-generated constructor stub
	}
	public void mover2() {
			posx=posx+cambia;
			if(posx>=475) {
				cambia*=-1;
				posy=posy+5;
			}
			if (posx<=25) {
				cambia*=-1;
				posy=posy+5;
			}
		
	}
	
	
}
