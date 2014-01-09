package br.com.tdv.logic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdv.dao.ContactDao;
import br.com.tdv.model.Contact;

public class AlterContactLogic implements Logic {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String getOrSet = request.getParameter("getOrSet");
		try {
			if("set".equals(getOrSet)) {
				this.set(request, response);			
			} else {
				this.get(request, response);
			}
		} catch (ServletException | IOException e) {
			e.printStackTrace();
			return ERROR;
		}		
		return OK;
	}
	
	public void get(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Contact contact = new ContactDao().getContact(id);
		request.setAttribute("contact", contact);
		request.getRequestDispatcher("alter_contact.jsp").forward(request, response);	
	}
	
	public void set(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contact contact = ContactLogicCommon.getContact(request);
		new ContactDao().update(contact);
		
		String message = "Contato Alterado com sucesso";
		System.out.println(message);	
		
		response.sendRedirect("controller?logic=ContactListLogic&message="+message);
	
	}

}
