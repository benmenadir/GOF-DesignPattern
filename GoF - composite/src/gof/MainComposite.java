package gof;

public class MainComposite {

	public static void main(String[] args) {
		Html page = new Html();
		Form form = new Form();
		form.addElement(new Input());
		page.addElement(form);
		
		System.out.println(page);
	}

}
