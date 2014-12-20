package Moteur.Terrain;

import Moteur.Animal;
import Moteur.Plante;


public class Case {

	private Plante plante;
	
	//protected EtreMort nourriture;
	
	private Animal animalPresent;
	
	public int valeurSel;
	
	private boolean obstacle; // impossible d'acceder , impossible de voir a travers
	private boolean visible; // true = visible , else = contenu invisible depuis la position x , y de l'Animal
	
	
	public Case(){
		this.obstacle=false;
		this.setVisible(true);
	}

	public boolean isObstacle() {
		return obstacle;
	}

	public void setObstacle(boolean obstacle) throws Exception {
		this.obstacle = obstacle;
		if (obstacle){
		this.visible=false;
		this.setAnimalPresent(null);
		this.setPlante(null);
		}
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean accessible) {
		
		this.visible = accessible;
		if (accessible){this.obstacle=false;}
	}


	public Plante getPlante() {
		return plante;
	}

	public void setPlante(Plante plante) throws Exception {
		if (plante==null){
			this.plante=null;
		}
		else if (this.isObstacle()){
			this.plante=null;
			throw new Exception("Impossible de mettre une Plante sur une case obstacle");
		}
		else{
		this.plante = plante;
		}
	}

	public Animal getAnimalPresent() {
		return animalPresent;
	}

	public void setAnimalPresent(Animal animalPresent) throws Exception {
		if(animalPresent==null){
			this.animalPresent=null;
		}
		else if (this.isObstacle()){
			this.animalPresent=null;
			throw new Exception("Impossible de mettre un Animal sur une case obstacle");
		}
		else{
		this.animalPresent = animalPresent;
		}
	}

}