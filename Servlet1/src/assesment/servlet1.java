package assesment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet1  extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String s1=req.getParameter("num1");
		String s2=req.getParameter("num2");
		int i=3;
		int j=4;
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		out.println(k);
	}
}
