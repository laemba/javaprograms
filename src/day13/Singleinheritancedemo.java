package day13;


class abc
{
	int a=10;
	
	void show()
	{
		System.out.println(a);
	}
	
}

class xyz extends abc
{
	int b=20;
	
	void display()
	{
		System.out.println(a+b);
	}
	
}


public class Singleinheritancedemo 
{	
	
	public static void main(String[] args)
	{
		xyz obj=new xyz();
		obj.show();
		obj.display();
		abc obj1=new abc();
		obj1.show();
		
		
		
		
	}
}
