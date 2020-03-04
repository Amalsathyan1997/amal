package dfdf;
public class exep {
	
		public static void main(String ar[])
		{
			int a=10,b=0;
			int c[]=new int[5];
			
			try
			{
			
			System.out.println(a/b);
			}
		catch(ArithmeticException aie)
			{
			System.out.println(aie);
			}
		catch(Exception aie)
			{
			System.out.println(aie);
			}
			
		}
			
}