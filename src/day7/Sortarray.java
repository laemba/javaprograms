package day7;

import java.util.Arrays;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {200,300,500,100,50};
		
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
