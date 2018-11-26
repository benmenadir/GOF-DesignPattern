package gof;

public class Div extends Composite {
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("<div>");
		for(Element elt : getFils()) {
			sb.append(elt.toString());
		}
		sb.append("</div>");
		return sb.toString();
	}
}
