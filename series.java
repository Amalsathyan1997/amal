import java.util.*;
class series{
	public static void main(String[] args)


	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int no= sc.nextInt();
	for(int i=1;i<=no;i++)
	{
	if(i==no){if(i%2==0)
		{System.out.print(-i);}
		else
		{System.out.print(i);}
		}
	else if(i%2==0)
		{System.out.print(-i +",");}
	else
	{System.out.print(i+",");}
	}
	
}
}