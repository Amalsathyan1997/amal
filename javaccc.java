package javacc;

public class javaccc {
	public static void main(String ar[])
{
	//int arr[]= {4,6,3,2,10,8,5,9,12,7};
	int gr=Integer.parseInt(ar[0]);
	
	for(int i=1;i<ar.length;i++)
	{
		if(Integer.parseInt(ar[i])>gr)
		{
			gr=Integer.parseInt(ar[i]);
		}
		}
	System.out.println(gr);
}



}


	
