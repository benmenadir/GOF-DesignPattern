package gof;

public class Chocolat extends BonbonDecorator {

	public Chocolat(Bonbon bonbon) {
		super(bonbon);
		setGout("chocolat");
	}
	
}
