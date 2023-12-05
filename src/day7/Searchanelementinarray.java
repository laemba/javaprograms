package day7;

public class Searchanelementinarray {
	
	public static void main(String[] args)
	{
		boolean status=false;
		int a[]= {100,300,500,600,200};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==500)
			{
				status=true;
				System.out.println("Element is found");
				break;
			}
			
			
		}
		
		if(status==false)
		{
			System.out.println("Element is not found");
		}
		
		
	}

}
