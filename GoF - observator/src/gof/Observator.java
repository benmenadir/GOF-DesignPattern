package gof;

public interface Observator<T> {
	void update(Observable<T> observable);
}
