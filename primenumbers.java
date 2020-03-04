import java.util.*;
class primenumbers{
	public static void main(String[] args)


	{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the first number");

	int noone=sc.nextInt();	
	System.out.println("enter the second number");
	int notwo=sc.nextInt();
	int i,count;
	int sum=0;
	
	for(i=noone;i<=notwo;i++)
		{count=0;
		for(int j=2;j<i;j++)
			{
			if(i%j==0)
			count=1;
			}
			if (count==0)
				{
				System.out.println(i);
				sum=sum+i;
				
				}
	
	}
        System.out.println(sum );


	
}
}