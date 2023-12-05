package day7;

import java.util.Scanner;

public class Takinginputfromkeyboard {

	public static void main(String[] args) {
		
		//int a=10;
		//Scanner class is a predefined class
		//pre defined methods
			
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();			
		System.out.println("Enter a second number");
		int num2=sc.nextInt();
		System.out.println("Addition of numbers :"+ (num1+num2));
		
			
		
	}

}
