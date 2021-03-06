package gof;

public class AttenteChoix implements EtatPhotomaton {

    Photomaton gp;

    AttenteChoix(Photomaton gp) {
        this.gp = gp;
    }

    public void insererPiece() {
        System.out.println(
                "Vous avez deja paye, reprennez votre piece");
    }

    public void recupererPiece() {
        gp.setEtatCourant(gp.getEtatAttentePiece());
    }

    public void choisirModePaysage() {
        gp.setEtatCourant(gp.getEtatDeveloppement());
    }

    public void choisirModePortait() {
    	gp.setEtatCourant(gp.getEtatDeveloppement());
    }

	@Override
	public void recupererPhoto() {
		System.out.println("Sélectionner le mode de photo");
		
	}

}
