package gof;

public class Miel extends BonbonDecorator {

	public Miel(Bonbon bonbon) {
		super(bonbon);
		setGout("miel");
	}
	
}
