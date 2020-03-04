package john;

import java.util.Scanner;

class Student
{
String name;
Student(String s)
	{name=s;}
String getName()
{return name;}
}
class mary {
	 
	 public static void main(String args[]) {
		//Student s1[]=new Student[2];
		//s1[0]=new Student("Mary");
		//s1[1]=new Student("john");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		int ele=sc.nextInt();
		Student s1[]=new Student[ele];
		
		for(int i=0;i<s1.length;i++) {
			s1[i]=new Student(sc.next());
		}
		for(int i=0;i<s1.length;i++) {
			System.out.println("name:"+s1[i].getName());
		}
	 }
}
