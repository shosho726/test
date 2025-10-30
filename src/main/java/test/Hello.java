package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/chapter3/hello"})
public class Hello extends HttpServlet {
	
	public void doGet (
		HttpServletRequest req, HttpServletResponse resp
	) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("Hello Servlet!");
		out.println("TEST");
		out.println("TEST!!!!!!");
		out.println("Fork");
		out.println("ハリルです");
		out.println(new java.util.Date());
	}
}