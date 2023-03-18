package com.xworkz.actor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/wish")
public class ServletMyWish extends HttpServlet {
	public ServletMyWish() {
		System.out.println("Welcome My Wish");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("actorname");
		String title= req.getParameter("title");
		String occur= req.getParameter("occur");
		String days= req.getParameter("days");
		String language= req.getParameter("language");
		String height= req.getParameter("height");
		
		String DOB=req.getParameter("DOB");
		String place= req.getParameter("place");
		String fathername= req.getParameter("fathername");
		String mothername= req.getParameter("mothername");
		String noOfFilms= req.getParameter("noOfFilms");
		String noOfAward= req.getParameter("noOfAward");
		
		String firstFilm=req.getParameter("firstFilm");
		String firstAward= req.getParameter("firstAward");
		String married= req.getParameter("married");
		String famousMovie= req.getParameter("famousMovie");
		String awardWiningMovie= req.getParameter("awardWiningMovie");
		String BestbugetMovie= req.getParameter("BestbugetMovie");
		
		String bestCollectionMovie=req.getParameter("bestCollectionMovie");
		String bestLanguage= req.getParameter("bestLanguage");
		String income= req.getParameter("income");
		PrintWriter write=resp.getWriter();
		
		
		write.print("<html><body><h1 style='color:red'>This is the name of actor "+name+"</h1></body></html>");
		write.print("<html><body><h1 style='color:blue'>This is the title of actor  "+title+"</h1></body></html>");
		write.print("<html><body><h1 style='color:orange'>This is the occur of actor "+occur+"</h1></body></html>");
		write.print("<html><body><h1 style='color:pink'>This is the days of actor "+days+"</h1></body></html>");
		write.print("<html><body><h1 style='color:lightblue'>This is the language of actor "+language+"</h1></body></html>");
		
		write.print("<html><body><h1 style='color:red'>This is the income of actor "+income+"</h1></body></html>");
		write.print("<html><body><h1 style='color:blue'>This is the height of actor  "+height+"</h1></body></html>");
		write.print("<html><body><h1 style='color:orange'>This is the firstFilm of actor "+firstFilm+"</h1></body></html>");
		write.print("<html><body><h1 style='color:pink'>This is the firstAward of actor "+firstAward+"</h1></body></html>");
		write.print("<html><body><h1 style='color:lightblue'>This is the fathername of actor "+fathername+"</h1></body></html>");
		
		write.print("<html><body><h1 style='color:red'>This is the famousMovie of actor "+famousMovie+"</h1></body></html>");
		write.print("<html><body><h1 style='color:blue'>This is the DOB of actor  "+DOB+"</h1></body></html>");
		write.print("<html><body><h1 style='color:orange'>This is the days of actor "+days+"</h1></body></html>");
		write.print("<html><body><h1 style='color:pink'>This is the bestLanguage of actor "+bestLanguage +"</h1></body></html>");
		write.print("<html><body><h1 style='color:lightblue'>This is the bestCollectionMovie of actor "+bestCollectionMovie+"</h1></body></html>");
		
		write.print("<html><body><h1 style='color:red'>This is the BestbugetMovie of actor "+BestbugetMovie+"</h1></body></html>");
		write.print("<html><body><h1 style='color:blue'>This is the awardWiningMovie of actor  "+awardWiningMovie+"</h1></body></html>");
		write.print("<html><body><h1 style='color:orange'>This is the mothername of actor "+mothername+"</h1></body></html>");
		write.print("<html><body><h1 style='color:pink'>This is the noOfAward of actor "+noOfAward+"</h1></body></html>");
		write.print("<html><body><h1 style='color:lightblue'>This is the noOfFilms of actor "+noOfFilms+"</h1></body></html>");
		write.print("<html><body><h1 style='color:red'>This is the Maried of actor "+married+"</h1></body></html>");

		resp.setContentType("text/html");
	}

}
