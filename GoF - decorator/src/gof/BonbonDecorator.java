package gof;

public abstract class BonbonDecorator extends Bonbon {
	private Bonbon bonbon;
	private String gout;
	
	
	
	public BonbonDecorator(Bonbon bonbon) {
		this.bonbon = bonbon;
	}

	
	public void setGout(String gout) {
		this.gout = gout;
	}

	@Override
	public String manger() {
		return gout + " - " +  bonbon.manger();
	}
}
