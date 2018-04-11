package com.net.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Nextone  implements Servlet{

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
		System.out.println("init  methord starts here");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("text/html;charset=utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
	
		out.println("<html><body>");
		out.println("<form action=page2ser>");
		out.println("USERID:<input type=\"text\" name=\"uname\"></br>");
		out.println("psd:<input type=password  name=\"pasword\"></br>");
		out.println("designation:<input type=\"text\" name=\"cader\"></br>");
		out.println("office:<input type=\"text\" name=\"workplace\"></br>");
		out.println("cellno:<input type=\"text\" name=\"contactno\"></br>");
		out.println("<input type=submit value=submit></br>");
		out.println("</body></html>");
		
		
	}
	

}
