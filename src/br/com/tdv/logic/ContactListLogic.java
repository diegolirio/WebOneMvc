package br.com.tdv.logic;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdv.dao.ContactDao;
import br.com.tdv.model.Contact;

public class ContactListLogic implements Logic {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		List<Contact> list = new ContactDao().getAllList();
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("contact_list.jsp");
		System.out.println("Retornado lista de contatos ( "+list.size()+" )... para => contact_list.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
			return ERROR;
		}		
		return OK;
	}

}
