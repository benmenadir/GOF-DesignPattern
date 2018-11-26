package gof;

import java.util.ArrayList;
import java.util.List;

public abstract class ObservableAdapateur<T> implements Observable<T> {
	private List<Observator<T>> observators = new ArrayList<>();
}
