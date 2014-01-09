package br.com.tdv.logic;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tdv.dao.ContactDao;
import br.com.tdv.model.Contact;

public class NewContactLogic implements Logic {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Contact contact = new Contact();
		contact.setNome(request.getParameter("nome"));
		contact.setEmail(request.getParameter("email"));
		contact.setEndereco(request.getParameter("endereco"));
		contact.setTelefone(request.getParameter("telefone"));
		System.out.println(request.getParameter("dataNascimento"));
		contact.setDataNascimento(Calendar.getInstance());
		//contact.getDataNascimento().setTime(new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dataNascimento")));
		new ContactDao().save(contact);
		
		String message = "Contato gravado com sucesso";
		System.out.println(message);
		
		
		try {
			response.sendRedirect("controller?logic=ContactListLogic&message="+message);
		} catch (IOException e) {
			e.printStackTrace();
			return ERROR;
		}
		
		/*
		RequestDispatcher rd = request.getRequestDispatcher("controller?logic=ContactListLogic");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
			return ERROR;
		}
		*/						
		return OK;
	}

}
