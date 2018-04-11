package com.net.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Newservlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("snd init methord process starts....");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		String Uname = request.getParameter("uname");
		String Pasword = request.getParameter("pasword");
		String Cader = request.getParameter("cader");
		String Workplace = request.getParameter("workplace");
		String Contactno = request.getParameter("contactno");
		
		out.println("Uname:"+Uname);
		out.println("Pasword:"+Pasword);
		out.println("Cader:"+Cader);
		out.println("Workplace:"+Workplace);
		out.println("Contactno:"+Contactno);
		
		System.out.println("Uname:"+Uname);
		System.out.println("Pasword:"+Pasword);
		System.out.println("Cader:"+Cader);
		System.out.println("Workplace:"+Workplace);
		System.out.println("Contactno:"+Contactno);
		
		
	}
	
	

}
