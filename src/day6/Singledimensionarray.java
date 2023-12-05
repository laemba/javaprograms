package day6;

public class Singledimensionarray 
{

	public static void main(String[] args)
	{
		
	//	int a[]= {10,20,30};
		
		//System.out.println(a[2]);
		//java.lang.ArrayIndexOutOfBoundsException
		
//		for(int i=0;i<3;i++)
//		{
//			System.out.println(a[i]);
//		}
		
	//	System.out.println("Length of the arrray is:"+a.length);
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);//10,20,30
//		}

//		for(int i=0;i<=(a.length)-1;i++)
//		{
//			System.out.println(a[i]);//10,20,30
//		}
				
		//Enhanced for loop or for each loop
		int a[]= {10,20,30};
		
		
		for(int arr:a)
		{
			System.out.println(arr);
		}

	

	}

}
