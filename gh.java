package enmm;

 class gh 
 {
	 int eno=101;
	 void display()
	 {
		 System.out.println(eno);
	 }
 }
 class manager extends gh
 {
	 void display()
	 {
		 System.out.println("manager class");
	 }
 
 }
class ghh
 {
	public static void main(String[] args)
	{
		manager obj1=new manager();
		obj1.display();
	}
 }

 