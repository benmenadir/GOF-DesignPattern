package gof;

public class Form extends Composite {
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("<form>");
		for(Element elt : getFils()) {
			sb.append(elt.toString());
		}
		sb.append("</form>");
		return sb.toString();
	}
}
