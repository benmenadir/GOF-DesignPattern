package design.patterns.factory;

import java.util.List;

import design.patterns.factory.dao.ContactDAO;
import design.patterns.factory.dao.DaoFactory;
import design.patterns.factory.dao.AbstractDaoFactory;
import design.patterns.factory.metier.Contact;

public class TestAbstractFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String cle = "test";
		AbstractDaoFactory factory = DaoFactory.getFactory(cle);
		ContactDAO contactDao = factory.getContactDAO();
		List<Contact> contacts = contactDao.getAllContacts();
		for(Contact c : contacts)
			System.out.println(c);

	}

}
