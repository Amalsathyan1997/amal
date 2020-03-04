package mainassignment;
import java.util.*;

class UserMainCod {
	static int sumOfDigits(String str) {
		int j,sum=0;
		 for(int k = 0; k < str.length(); k++)  
	        {  
	            char ch = str.charAt(k); 
	            
	            if(Character.isDigit(ch))
	            {
	            	sum+=ch;
	            }
	}
		 return sum;
	}
}


public class sum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ch=sc.next();
		int y;
		 y=UserMainCod.sumOfDigits(ch);
		 if(y==0){
		 System.out.println(-1);
		 }
		 else
		 {
			 System.out.println(y);
		 }
	}
}