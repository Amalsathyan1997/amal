package overload;

 class overloaddd {
	 public static overloaddd{
	void disp(float x)
	 			{
		 		System.out.println("hello");
	 			}
	 void disp()
	 {
		 System.out.println("world");
	 }
 }
 
	 class exec 
	 {
		 public static void main(String[] args) {
			 overloaddd obj1;
		obj1=new overloaddd();
		 obj1.disp();
	 }
	 }

