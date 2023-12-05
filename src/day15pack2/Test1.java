package day15pack2;

import day15pack1.Sample;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample obj=new Sample();
		System.out.println(obj.a);
		
		
		
	}

}

class Test2 extends Sample
{
	public static void main(String args[])
	{
		Test2 obj1=new Test2();
		System.out.println(obj1.a);//sample class variable
	}
}