package gof;

public class EtatDeveloppement implements EtatPhotomaton {
	private Photomaton gp;

	public EtatDeveloppement(Photomaton p)
	{
		gp=p;
	}
	public void choisirModePaysage() {
		// TODO Auto-generated method stub

	}


	public void choisirModePortait() {
		// TODO Auto-generated method stub

	}


	public void recupererPiece() {
		// TODO Auto-generated method stub

	}


	public void insererPiece() {
		// TODO Auto-generated method stub

	}
	@Override
	public void recupererPhoto() {
		System.out.println("Photo récupérée");
		gp.setEtatCourant(gp.getEtatAttentePiece());
		
	}

}
