package br.com.tdv.logic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logic {
	
	public final static String OK = "OK";
	public final static String ERROR = "ERROR";
	public final static String WARNING = "WARNING";
	
	public String execute(HttpServletRequest request, HttpServletResponse response);
	
	//public abstract void dispatcher(HttpServletRequest request, HttpServletResponse response, String url);

}
