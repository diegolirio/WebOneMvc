package br.com.tdv.logic;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdv.dao.ContactDao;
import br.com.tdv.model.Contact;

public class NewContactLogic implements Logic {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Contact contact = ContactLogicCommon.getContact(request);
		new ContactDao().save(contact);
		
		String message = "Contato gravado com sucesso";
		System.out.println(message);	
		
		try {
			response.sendRedirect("controller?logic=ContactListLogic&message="+message);
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}
		return OK;
	}

}
