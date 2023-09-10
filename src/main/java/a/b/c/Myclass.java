package a.b.c;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.Spring;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myclass extends HttpServlet {
	
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	PrintWriter po=res.getWriter();
	String n=req.getParameter("name");
	po.println("Your name is:"+n);
}

}
