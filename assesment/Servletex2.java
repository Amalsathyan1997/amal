package assesment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletex2 extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=(int)req.getAttribute("A");
		int k=i*i;
		PrintWriter out=res.getWriter();
		out.println(k);
	}

}
