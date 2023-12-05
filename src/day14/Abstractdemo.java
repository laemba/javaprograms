package day14;

// We can't instantiate/create object for abstract class
public abstract class Abstractdemo extends A implements I5
{

	public abstract void show();
	
	void display()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{		
	
		
	}

}

class A
{
	void show()
	{
		
	}
} 

interface I5
{
	void display5();
}
