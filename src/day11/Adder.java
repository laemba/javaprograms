package day11;

public class Adder {
	
	//Rules for method overloading
	
	//Method name should be same
	//Number of datatype of parameters should be different 
	//Order of datatype of paramerters should be different
	//
	
	int a=10,b=20;
	
	void add()
	{
		System.out.println(a+b);
	}
	
	void add(int x, int y)
	{
		System.out.println("addition of two nums:"+(x+y));
	}
	
	void add(int x, int y, int z)
	{
		System.out.println("addition of three nums: "+(x+y+z));
	}
	
	void add(double x, double y)
	{
		System.out.println(x+y);
	}
	void add(int x,double y)
	{
		System.out.println(x+y);
	}
	
	void add(double y, int x)
	{
		System.out.println(y+x);
	}

	
}
