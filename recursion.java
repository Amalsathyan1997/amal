import java.util.*;
class recursion{
	public static void main(String[] args)


	{int a,i,f;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	a=sc.nextInt();
	f=fact(a);
	System.out.println("factorial value is" +f);
	}
	static int fact(int n){
	int p;
	if(n==1){
	return 1;
	}
	p=fact(n-1)*n;
	return p;
}
}