package com.xworkz.firstweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 8,urlPatterns = "/friend")
public class FriendServlet extends HttpServlet {
	public FriendServlet() {
		System.out.println("My Best Friend");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Dostaaaa");
	}

}
