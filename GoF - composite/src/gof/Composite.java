package gof;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite implements Element {
	private List<Element> elements = new ArrayList<>();
	
	public void addElement(Element element) {
		elements.add(element);
	}
	
	protected List<Element> getFils(){
		return elements;
	}
}
