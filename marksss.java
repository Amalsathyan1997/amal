package marks;
import java.util.*;
public class marksss {
	
	public static void main(String[] args)

{
Scanner sc=new Scanner(System.in);
int tot=0;
int a[];
String name;
System.out.println("enter name");
name=sc.next();
System.out.println("enter no of subjects");
a=new int[sc.nextInt()];
for(int i=0;i<a.length;i++) {
	System.out.println("enter marks in subject"+(i+1)+":");
	a[i]=sc.nextInt();
	tot=tot+a[i];
	
}
System.out.println("students name\t"+name);
for(int i=0;i<a.length;i++) {
	System.out.println("marks in sub"+(i+1)+"is\t"+a[i]);
	
}
System.out.println("total\t"+tot);
}
}


	

