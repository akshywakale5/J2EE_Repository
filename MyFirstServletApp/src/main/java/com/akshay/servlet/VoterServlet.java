package com.akshay.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class VoterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		Integer i=Integer.parseInt(req.getParameter("age"));
		String name=req.getParameter("name");
		if (i>18) {
			pw.println("<h1 style=\"color:green\">"+name+" you are eligible for voting"+"</h1>");
		}
		else {
			pw.println("<h1 style= \"color:red\">"+name+" you are not eligible for voting"+"</h1>");
		}
		
		
	}

}
