package mainassignment;

import java.util.*;

class UserMainCode{

 static int sumOfDigits(String str) {
	
  int j,sum=0;
   for(int k = 0; k < str.length(); k++)  
         {  
             char ch = str.charAt(k); 
            
             if(Character.isDigit(ch))
            	  {j = Integer.parseInt(String.valueOf(ch));
            
                  sum=sum+j;
                  }
            
         }
   return sum;
 }
}

 class sumw {

 public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String ch=sc.next();

      int y=UserMainCode.sumOfDigits(ch);
      if(y==0){
      System.out.println(-1);
      }
      else
      {
      System.out.println(y);
      }
 }
}