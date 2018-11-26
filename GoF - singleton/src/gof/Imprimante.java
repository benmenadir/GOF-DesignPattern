package gof;

public class Imprimante {
	private static Imprimante instance;;
	
	static {
		instance = new Imprimante();
	}
	public static Imprimante getInstance() {
		return instance;
	}
	
	public void imprimer() {
		System.out.println("Impression");
	}
	private Imprimante() {}
}
