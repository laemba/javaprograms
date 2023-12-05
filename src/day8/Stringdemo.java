package day8;

import java.util.Scanner;

public class Stringdemo 
{

	public static void main(String[] args) 
	{
		
		//length,concat,trim,charAt,contains,equal,equalignorecase
		//substring,replace,split,ToLowercase,Touppercase and indexof
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String value");
		
		String name =sc.next();
		
		int length=name.length();
		
		//System.out.println("The len of the string: "+name.length());
		
		System.out.println("The len of the string: "+ length);
	}

}
