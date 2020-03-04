

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam1 extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

PrintWriter out=response.getWriter();
out.print("<h1>Init Parameter Names are : ");
Enumeration enumeration=getServletContext().getInitParameterNames();
while(enumeration.hasMoreElements())

{
out.print(enumeration.nextElement()+"");
}
ServletContext con1=getServletContext();
out.println("<h1>Company"+con1.getInitParameter("Company"));
out.print("Venue"+con1.getInitParameter("Venue"));
out.println("Training:"+con1.getInitParameter("Training"));
out.print("<h1>Company:"+getServletContext().getInitParameter("Company"));
out.print("Venue"+getServletContext().getInitParameter("Venue"));
out.print("Training:"+getServletContext().getInitParameter("Training"));

try
{
	String url=getServletContext().getInitParameter("url");
	String usr=getServletContext().getInitParameter("user");
	String pass=getServletContext().getInitParameter("password");

	Class.forName(getServletContext().getInitParameter("driver"));
	Connection con=DriverManager.getConnection("url","usr","pass");
	System.out.println("connecting");
}
catch(SQLException | ClassNotFoundException b)

{
	System.out.println(b);
}
}

}