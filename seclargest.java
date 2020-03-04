import java.util.*;
class seclargest
	{public static void main(String[] args)
{Scanner obj = new Scanner(System.in);
System.out.println("enter numbers");
int num1=obj.nextInt();
int num2=obj.nextInt();
int num3=obj.nextInt();
if(num1>num2 && num1>num3)
	{System.out.println("largest no is" +num1);
	if(num2>num3){System.out.println("second largest number is:" +num2);}
	else
	System.out.println("second largest number is:" +num3);
	
	}

if(num2>num1 && num2>num3)
	{System.out.println("largest no is" +num2);
	if(num1>num3){System.out.println("second largest number is:" +num1);}
	else
	System.out.println("second largest number is:" +num3);
	
	}
if(num3>num2 && num3>num1)
	{System.out.println("largest no is" +num3);
	if(num2>num1){System.out.println("second largest number is:" +num2);}
	else
	System.out.println("second largest number is:" +num1);
	
	}

}

}