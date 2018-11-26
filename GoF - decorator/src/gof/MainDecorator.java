package gof;

public class MainDecorator {

	public static void main(String[] args) {
		Bonbon bonbon = new Chocolat(new Epinard(new Miel(new NoyauSucre())));
		String gout = bonbon.manger();
		System.out.println(gout);
	}

}
