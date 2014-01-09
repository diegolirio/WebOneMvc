package br.com.tdv.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.tdv.model.Contact;

public class ContactDao {
	
	private static List<Contact> list = new ArrayList<Contact>();
	
	public List<Contact> getAllList() {
		return list;
	}
	
	public void save(Contact contact) {
		contact.setId(list.size()+1);
		list.add(contact);
	}
	
	public void delete(Contact contact) {
		for(Contact c : list) {
			if(c.getId() == contact.getId()) {
				list.remove(c);
				break;
			}
		}
	}

}
