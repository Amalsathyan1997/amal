import java.util.*;
class reverse{
	public static void main(String[] args)
	{Scanner sc =new Scanner(System.in);
	System.out.println("enter no to be reversed");
	int num=sc.nextInt();
	int rem;
	int rev=0;
	while(num!=0)
	{rem=num%10;
	rev=rev*10+rem;
	num=num/10;}
	System.out.println("reverse of the number :" +rev);




}


}