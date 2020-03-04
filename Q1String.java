package Assignment;
import java.util.Scanner;
public class Q1String 
{
public static void main(String[] args)
{
	Scanner ob=new Scanner(System.in);
	System.out.println("the two strings are 'The quick brown fox jumps over the lazy dog'and 'and killed it' ");
	String str1="The quick brown fox jumps over the lazy dog", str2="and killed it",str5;
	System.out.println("the character at index 12="+ str1.charAt(12));
	if(str1.indexOf("is")==-1)
	{
		System.out.println("character 'is' not present");
	}
	else
	{
		System.out.println("the character 'is' is present in the string");
	}
	String str3=str1.concat(str2);
	System.out.println("the two strings after merging is= "+str3);
	if((str1.lastIndexOf("dogs"))==(str1.length()-3))
			{
		System.out.println("the string ends with 'dogs'");
			}
	else
	{
		System.out.println("the string does not end with dogs");
	}
	System.out.println("comparing our string with string 'The quick brown Fox jumps over the lazy Dog'");
	
		if(str1.equals("The quick brown Fox jumps over the lazy Dog"))
		{
			System.out.println("strings are equal");
	}
		else 
		{
			System.out.println("not equal");
		}
		
		System.out.println("comparing our string with string 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'");
				
		
		if(str1.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"))
		{
			System.out.println("strings are equal");
	}
		else 
		{
			System.out.println("not equal");
		}
		System.out.println("the index position of 'a' is = "+ str1.indexOf("a"));
		System.out.println("the last index of 'e' is ="+str1.lastIndexOf("e"));
		System.out.println("length of string is"+str1.length());
		String str4=str1.replace("The", "A");
		System.out.println("replaced string= "+str4);
		String str[]=str1.split(" ",2);
		 for (String a : str)
		System.out.println(a);
		for(int i=16;i<=18;i++)
			{
				System.out.print(str1.charAt(i));
			}
		System.out.println("\n");
		for(int i=40;i<=42;i++)
		{
			System.out.print(str1.charAt(i));
		}
		String str6=str1.toLowerCase();
		String str7=str1.toUpperCase();
		System.out.println("\nSTRING IN LOWER CASE"+str6);
		System.out.println("string in upper case"+str7);
	}
}
