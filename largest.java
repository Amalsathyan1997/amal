import java.util.*;
class largest
	{public static void main(String[] args)
{Scanner obj = new Scanner(System.in);
System.out.println("enter numbers");
int num1=obj.nextInt();
int num2=obj.nextInt();
int num3=obj.nextInt();
int temp=(num1>num2)?num1:num2;
int max=(temp>num3)?temp:num3;
System.out.println("largest no is" +max);
}

}