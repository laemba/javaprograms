package day6;

public class Twodimensionarray2 
{

	public static void main(String[] args)
	{
		int a[][]= new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println(a[2][0]);
		System.out.println("Length of the row:"+a.length);
		System.out.println("Length of the col:"+ a[2].length);
		
		for(int r=0;r<a.length;r++)//1,2,3
		{
			
			for(int c=0;c<a[r].length;c++)
			{
				System.out.println(a[r][c]);//100,200,300,400,500,600
			}
			
		}
	
	}

}
