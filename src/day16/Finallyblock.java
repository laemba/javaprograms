package day16;

public class Finallyblock {

	
	public static void main(String[] args)
	{
		try 
		{
			//System.out.println(3/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e1)
		{
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
		finally
		{
			System.out.println("dont panic optional field is not mandatory");
		}
		
		System.out.println("proram ended");
	
	}
}
