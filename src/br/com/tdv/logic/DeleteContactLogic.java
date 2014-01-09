package br.com.tdv.logic;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdv.dao.ContactDao;
import br.com.tdv.model.Contact;

public class DeleteContactLogic implements Logic {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Contact contact = new Contact();
		contact.setId(Integer.parseInt(request.getParameter("id")));
		new ContactDao().delete(contact);
		String message = "Contato Excluído com sucesso";
		System.out.println("\n =================== Contato Excluído com sucesso ===================== \n");
		try {
			response.sendRedirect("controller?logic=ContactListLogic&message="+message);
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}		
		return OK;
	}

}
