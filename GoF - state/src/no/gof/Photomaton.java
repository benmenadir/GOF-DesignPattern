package no.gof;

public class Photomaton {
	public enum Transition{
		INSERTION_PIECE,CHOIX_MODE,IMPRIMANTE_EN_PANNE,RECUPERATION_PHOTO;
	}
	enum Etat{
		ATTENTE_PIECE, ATTENTE_MODE, IMPRESSION;
	}
	
	private Etat current = null;
	public Photomaton() {
		current = Etat.ATTENTE_PIECE;
		System.out.println("En attente de pi�ce");
	}
	
	public void gestionEtats(Transition transition) {
		if(current==Etat.ATTENTE_PIECE && transition==Transition.INSERTION_PIECE) {
			System.out.println("Pi�ce ajout�e, s�lectionnez le mode portrait/paysage");
			current = Etat.ATTENTE_MODE;
			return;	
		}
		if(current==Etat.ATTENTE_MODE && transition == Transition.CHOIX_MODE) {
			System.out.println("Prise de la photo");
			current = Etat.IMPRESSION;
			return;
		}
	}
	
	public static void main(String[] args) {
		Photomaton photomaton = new Photomaton();
		
		photomaton.gestionEtats(Transition.INSERTION_PIECE);
	}
}
