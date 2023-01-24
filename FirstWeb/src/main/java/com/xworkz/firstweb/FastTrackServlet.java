package com.xworkz.firstweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/track")
public class FastTrackServlet extends HttpServlet {
	
	public FastTrackServlet() {
		System.out.println("Hi fast");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is servlet");
	}

}
