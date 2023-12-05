package day14;

interface shape
{
	public static final int len=10 ;
	public static final int widt=20 ;
	public abstract void circle();
	
	default void triangle()
	{
		System.out.println("I am in triangle");
	}
	
	static void rectangle()
	{
		System.out.println("I am in rectangle");
	}
	
}



public class Interfacedemo implements shape
{

	public void circle() 
	{
		
		System.out.println("Iam in circle");
	}
	
	public void square()
	{
		System.out.println("I am in square");
	}
	
	public static void main(String[] args) 
	{
		
		Interfacedemo id=new Interfacedemo();
		id.circle();
		id.triangle();
		id.square();
		shape.rectangle();
		System.out.println(id.len);
		System.out.println(id.widt);
		
		
	}


	
	

}

