package day14;


public class Superdemo {

	void print()
	{
		System.out.println("I am in parent");
	}
	public static void main(String[] args) 
	{
		superdemo1 sp=new superdemo1();
		sp.print();// iam in child

	}

}

class superdemo1 extends Superdemo
{
	void print()
	{
		super.print();
		System.out.println("Iam in child");
	}
}
