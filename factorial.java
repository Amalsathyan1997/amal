import java.util.*;
class factorial{
	public static void main(String[] args)

	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no to find the factorial");
	int no=sc.nextInt();
	int fact=1;
	
	if(no<0)
		{System.out.println("no factorial exist for a negative number");
		}
	else
	{
	for(int i=1;i<=no;++i)
	{fact=fact*i;}
	System.out.println("the factorial is equal to:" +fact);
	}
	
}













}