package bank;

 class TwoStrings{
	 synchronized	static void print(String str1,String str2)
	{
		System.out.print(str1);
		try
		{
			Thread.sleep(500);
		}
		catch(Exception ie)
		{
			
		}
		System.out.println(str2);
		
	}
}
class printStringsThread implements Runnable
{
	Thread td;
	String str1,str2;
	
	printStringsThread(String str1,String str2)
	{
		this.str1=str1;
		this.str2=str2;
		td=new Thread(this);
		td.start();
		
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
	}
}
class TestThread
{
	public static void  main(String args[])
	{
		new printStringsThread("hello","there");
		new printStringsThread("how are","you");
		new printStringsThread("Thank you","very much");
	}
}