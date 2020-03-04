package house;
import java.util.*;
public class Kitchen {
	public static void main(String[] args)
	{
		String [] appliances=new String[] {"pan","cutlery"};
		for(int i=0;i<2;i++)
		{
		 System.out.println(appliances[i]);
		}
	Kitchen k=new Kitchen();
	k=null;
	System.gc();
	}
	protected void finalize()
	{
		System.out.println("garbage collection started");
	}
	
	
}
