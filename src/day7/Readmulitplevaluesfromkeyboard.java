package day7;

import java.util.Scanner;

public class Readmulitplevaluesfromkeyboard {

	public static void main(String[] args) 
	{
		int num = 0;
		System.out.println("Please enter the values");		
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			
			a[i]= scan.nextInt();//
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println("Given values: "+a[i]);
		}
		
	}

}
