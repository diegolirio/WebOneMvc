package br.com.tdv.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AlterContactLogic implements Logic {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// busca Contact para devolver ao Form(html)
		return OK;
	}

}
