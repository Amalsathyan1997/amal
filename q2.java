package myjava;
import java.util.*;
public class q2 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int [] arr=new int[8];
		int [] arr1=new int[8];
		int i;
        System.out.println("Enter any 8 elements");
		
		for(i=0;i<8;i++)
		{
			arr[i]=obj.nextInt();
		}
			for(i=0;i<8;i++)
				arr1[i]=arr[i];
		
		
		System.out.println("Entered elements are");
		
			for(i=0;i<8;i++)
			{
				System.out.println(arr1[i]); 
			}
			
	}

}
