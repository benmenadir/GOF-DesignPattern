package gof;

public class Html extends Composite {
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("<html>");
		for(Element elt : getFils()) {
			sb.append(elt.toString());
		}
		sb.append("</html>");
		return sb.toString();
	}
}
