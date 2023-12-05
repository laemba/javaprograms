package day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) throws InterruptedException, IOException 
	{

//syntax error
		
//System.out.println("Hello")
		
//Exception >> checked and unchecked
//compile time exception and runtime exception		
		
//Checked exceptions	
//1.InterruptedException
//2.Filenotfound exception
//3.IO exception
//Java compiler identifies checked exception and you add to method by using throws keyword
		
		/*File f=new File("D:\\data.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String x=br.readLine();	
		System.out.println();
		
		System.out.println("1");
		System.out.println("2");
		
		Thread.sleep(5000);
		
		System.out.println("3");
		System.out.println("4");*/
		
		
		
//Un-checked exception
//Arithmetic exception
//Arrayindexoutofbounds exception
//Number format exception
//Null pointer excepion		
		
		
		System.out.println("program started");
		/*int[] a=new int[5];
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter postion(0-4)");		
		int pos=sc.nextInt();
		System.out.println("Enter the value");
		int val=sc.nextInt();*/	
		
		/*int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;*/
		
		//a[pos]=val;
		
		//System.out.println(a[pos]);
		
		/*System.out.println("1");
		System.out.println("2");
		System.out.println(100/0);
		System.out.println("3");
		System.out.println("4");*/
		
		System.out.println("program ended");
		
		String s="welcome";
		int num=Integer.parseInt(s);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
