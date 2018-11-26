package gof;

public class AttentePiece implements EtatPhotomaton {

    private Photomaton gp;
    private String message = "Pas de piece dans le monnayeur";

    AttentePiece(Photomaton gp) {
        this.gp = gp;
    }

    public void insererPiece() {
        System.out.println(
                "Selectionnez une photo");
        gp.setEtatCourant(gp.getEtatAttenteChoix());
 
    }

    public void recupererPiece() {
        System.out.println(message);
    }

    public void choisirModePaysage() {
        System.out.println(message);
    }

    public void choisirModePortait() {
        System.out.println(message);
    }

	@Override
	public void recupererPhoto() {
		System.out.println(message);
		
	}
}
