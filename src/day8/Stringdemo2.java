package day8;

import java.util.Scanner;

public class Stringdemo2 
{

	public static void main(String[] args) 
	{
		
		String name="Welcome";
		int len=name.length();
		System.out.println("The len of the string :"+len);//7
		
		//length,concat,trim,charAt,contains,equal,equalignorecase
		//substring,replace,split,ToLowercase,Touppercase and indexof
		
		String college="JBIT  ";
		String university="Osmania";		
		//String s=college.concat(university);
	//	System.out.println(s);
		System.out.println(college.concat(university));
		
		System.out.println(college+university);
		
		System.out.println("Welcome "+123);
		
		System.out.println(12+12);
		
		
	//Trim
		
		name=" Welcome ";
		System.out.println(name.trim());
		
		
	//charAt-- to retrieve the characters from a string
		
		name="Welcome";
//		
//		char ch=name.charAt(5);
//		
//		System.out.println(ch);
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			System.out.println(ch);
		}
		
	//contains--returns true/false - depends on substring
		
		name ="Welcome to india";
		boolean bo=name.contains("Wel");
		System.out.println(bo);
		
		
	//equal and equalignorecase --returns boolean
		
		name="Welcome";
		boolean b=name.equals("welcome");
		System.out.println(b);
		
		System.out.println(name.equalsIgnoreCase("welcome"));
		
		
	//replace -- returns string
		name="WelcomeWelcome";
		String s=name.replace("We", "a");
		System.out.println(s);
		
	//Substring -- returns string
		
		name="Welcome";
		//System.out.println(name.substring(1));
		System.out.println(name.substring(1,5));
		
	//Tolower uppercase
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
	name="Welcome";
	System.out.println(name.toLowerCase());
	
	//split
	name="Selenium to java";
	
	String arr[]=name.split(" ");
	
	for(int i=0;i<arr.length;i++)
	{
//		for(int j=0;j<arr[i].length();j++)
//		{
//			//arr[i].replace(arr[i].charAt(0),'W' );
//			//System.out.println(arr[i].replace(arr[i].charAt(0),'W'));
//			
//		}
//		
					
	}
	
	
	

	

	
	
	
	
	
		
		
	}

}
