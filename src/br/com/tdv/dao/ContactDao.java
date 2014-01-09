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
	
	public Contact getContact(int id) {
		Contact contact = null;
		for (Contact c : list) {
			if(c.getId() == id) {
				contact = c;
				break;
			}
		}
		return contact;
	}
	
	public void update(Contact contact) {
		for (Contact c : list) {
			if(c.getId() == contact.getId()) {				
				int index = list.indexOf(c);
				list.get(index).setNome(contact.getNome());
				list.get(index).setEmail(contact.getEmail());
				list.get(index).setDataNascimento(contact.getDataNascimento());
				list.get(index).setTelefone(contact.getTelefone());
				list.get(index).setEndereco(contact.getEndereco());				
			}
			break;
		}
	}

}
