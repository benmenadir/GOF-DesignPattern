package gof;

public class Photomaton {

	private AttentePiece etatAttentePiece = new AttentePiece(this);
	private AttenteChoix etatAttenteChoix = new AttenteChoix(this);
	private EtatDeveloppement etatDeveloppement = new EtatDeveloppement(this);
	private HorsService etatHorsService = new HorsService(this);
	private EtatPhotomaton etatCourant = etatAttentePiece;
	
	public AttentePiece getEtatAttentePiece() {
		return etatAttentePiece;
	}
	public AttenteChoix getEtatAttenteChoix() {
		return etatAttenteChoix;
	}
	public EtatDeveloppement getEtatDeveloppement() {
		return etatDeveloppement;
	}
	public HorsService getEtatHorsService() {
		return etatHorsService;
	}
	public EtatPhotomaton getEtatCourant() {
		return etatCourant;
	}
	public void setEtatCourant(EtatPhotomaton etatCourant) {
		this.etatCourant = etatCourant;
	}
	
	// DELEGATION D'APPEL
    public void insererPiece() {
    	this.etatCourant.insererPiece();
    }
    public void recupererPiece() {
    	this.etatCourant.recupererPiece();
    }
    public void choisirModeIdentite() {
    	this.etatCourant.choisirModePaysage();
    }
    public void choisirModePortait() {
    	this.etatCourant.choisirModePortait();
    }
    public void recupererPhoto() {
    	this.etatCourant.recupererPhoto();
    }
}
