import java.util.*;
class doublee
	{
	public static void main(String[] args)

	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	double num=sc.nextDouble();
	int num1=(int)num;
	double num2=num-num1;
	System.out.println("inputed number is:" +num);
	System.out.println("whole value:" +num1);
	System.out.println("fractional part:" +num2);	
	}

	}