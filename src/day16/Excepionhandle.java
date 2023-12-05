package day16;

public class Excepionhandle {

	
	public static void main(String args[])
	{
		String s=null;
		
		System.out.println("program started");
		System.out.println(1);
		System.out.println(2);
		try 
		{
			try {
				
			}
			catch(Exception e)
			{
				
			}
			//System.out.println(3/0);
			System.out.println(s.length());
			
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Invalid diviser ,hey you can't divide value by zero ");
//			System.out.println(e.getMessage());
//		}
		
		catch(Exception e)
		{
			System.out.println("Invalid input");
			System.out.println(e.getMessage());
			try {
				
			}
			catch(Exception e1)
			{
				
			}
		}
		
		
		System.out.println(4);
		System.out.println(5);
		System.out.println("program ended");
		
	}
}
