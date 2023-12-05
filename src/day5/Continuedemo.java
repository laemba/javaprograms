package day5;

public class Continuedemo {

	public static void main(String[] args)
	{
		
		for(int i=1;i<=10;i++)			
		{
			if(i==2||i==3||i==5)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
