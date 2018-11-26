package gof;

public class MainObservator {

	public static void main(String[] args) {
		FeuPieton feu = new FeuPieton();
		
		Pieton p1 = new Pieton("Gaston");
		Pieton p2 = new Pieton("Batman");
		Pieton p3 = new Pieton("Adèle");
		
		feu.add(p1);
		feu.add(p2);
		feu.add(p3);
		
		feu.setState("rouge");
		feu.setState("vert");
		
	}

}
