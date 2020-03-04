package assesment;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class servletex3 extends HttpServlet (HttpServletRequest req, HttpServletResponce res)
{
	public void service()
	{
		String name="dileep";
		String phone="realme";
		PrintWriter out=res.getWriter();
		out.print(name+phone);
		
	}

}
