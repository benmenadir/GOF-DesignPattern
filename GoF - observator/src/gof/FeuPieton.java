package gof;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FeuPieton implements Observable<String> {
	private List<Observator<String>> pietons = new ArrayList<>();
	private String state = "rouge";
	
	@Override
	public void add(Observator<String> observator) {
		pietons.add(observator);
		
	}

	@Override
	public void remove(Observator<String> observator) {
		pietons.remove(observator);
		
	}

	@Override
	public String getState() {
		return state;
	}

	private void notifyObservators() {
		Iterator<Observator<String>> it = pietons.iterator();
		while(it.hasNext()) {
			Observator<String> p = it.next();
			p.update(this);
		}	
	}

	public void setState(String state) {
		this.state = state;
		notifyObservators();
	}

}
