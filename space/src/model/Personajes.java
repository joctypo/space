package model;



public abstract class Personajes {
	
	protected int posx;
	protected int posy;
	
	//Constructor de la padre
	public Personajes(int posX,int posY) {
		posx=posX;
		posy=posY;
	}
public void mover2() {
	
}
	
	//Un getter que saca el Posx al la L�gica 
	public int getPosx() {
		return posx;
	}
	
	//Un getter que saca el Posy al la L�gica
	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public void setPosx(int posx) {
		
		this.posx = posx;
	}

	
	
	
	
}
