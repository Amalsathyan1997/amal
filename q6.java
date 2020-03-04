import java.util.*;
public class EXCEPTIONN extends Exception
{
public static void main(String[] args) {
	
	try{
		int[] array1= new int[-10];
		array1[5]=7;
		
		System.out.println(array1[5]);}
	catch(NegativeArraySizeException e)
	{
		System.out.println("Negative Array Size Exception");
	}
	
	try {
		int[]array2=new int[5];
		array2[8]=4;
	}
	catch(IndexOutOfBoundsException ea)
	{
		System.out.println("ArrayIndexOutofBoundException");
	}

	try {
		  String str = "Hello how are you";
	  
	     
	      System.out.println(str.charAt(40));
	}
	catch(IndexOutOfBoundsException eas) {
		System.out.println("StringIndexOutOfBoundsException");
	}
	try {
		String str=null;
		System.out.println(str.toUpperCase());
	}
	catch(NullPointerException easr) {
		System.out.println("NullPointerException");
	}
	try{int y=10;
	int b;
	b=y/0;
	System.out.println(b);}
	catch(ArithmeticException easer) {
		System.out.println("arithmetic exception");
		
	}
}
}
