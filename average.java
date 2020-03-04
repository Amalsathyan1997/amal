import java.util.*;
class average
	{public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String name= sc.nextLine();
	System.out.println("enter mark1");
	int mark1= sc.nextInt();
	System.out.println("enter mark2");
	int mark2= sc.nextInt();
	System.out.println("enter mark3");
	int mark3= sc.nextInt();
	
	int total= mark1 +mark2 +mark3;
	int average= (mark1 +mark2 +mark3)/3;
	
	if(total>=250){System.out.println("first class");}
	else if(total>=200 && total<=249){System.out.println("second class");}
	else if(total>=150 && total<=199){System.out.println("pass class");}
	else{System.out.println("fail");}
	}	


	












}