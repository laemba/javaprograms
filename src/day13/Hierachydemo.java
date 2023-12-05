package day13;

class P1
{
	void show()
	{
		System.out.println("Hello");
	}
}

class C1 extends P1
{
	void display()
	{
		System.out.println("Selenium");
	}
}

class C2 extends P1
{
	void print()
	{
		System.out.println("Java");
	}
}

public class Hierachydemo {

	public static void main(String[] args) {

		C1 obj1=new C1();
		obj1.show();
		obj1.display();
		P1 obj2=new P1();
		obj2.show();
		C2 obj3=new C2();
		obj3.show();
		obj3.print();
		

	}

}
