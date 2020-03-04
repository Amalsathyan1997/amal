import java.util.*;
class search
	{public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a[],l,search,i,j;
	System.out.println("enter no of elements");
	l=sc.nextInt();
	a=new int[l];
	System.out.println("enter the numbers");
	for(i=0;i<l;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println("enter the number to search");
	search=sc.nextInt();
	for(i=0;i<l;i++)
	{if(a[i]==search)
	{
	System.out.println("search is succesfull and position is"+(i+1));
	break;}}


}

}