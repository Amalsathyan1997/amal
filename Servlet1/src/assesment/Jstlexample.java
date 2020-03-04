package assesment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Jstlexample extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
{
	String name="Dilp";
	req.setAttribute("label",name);
	RequestDispatcher rd=req.getRequestDispatcher("Jsp1.jsp");
	rd.forward(req, res);
}
}

