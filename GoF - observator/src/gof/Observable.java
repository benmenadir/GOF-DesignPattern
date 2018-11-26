package gof;

public interface Observable<T> {
	void add(Observator<T> observator);
	void remove(Observator<T> observator);
	T getState();
	
}
