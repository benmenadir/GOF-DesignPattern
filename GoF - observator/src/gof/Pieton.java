package gof;

public class Pieton implements Observator<String> {
	private String nom;
	
	public Pieton(String nom) {
		this.nom = nom;
	}

	@Override
	public void update(Observable<String> observable) {
		if(observable.getState().equals("rouge")) {
			System.out.println(nom+" attend le bonhomme vert");
			return;
		}
		if(observable.getState().equals("vert")) {
			System.out.println(nom+" traverse");
			return;
		}
		
	}

}
