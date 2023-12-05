package day14;

//final variable can't be changed 
//final methods can't be overridden
//final class can't be inherited

 public class Finalkeyworddemo {

	 final int a=10;
	 
	final void show()
	 {
		 System.out.println("Hello");
	 }
	
	public static void main(String[] args) {
		
		Finalkeyworddemo obj=new Finalkeyworddemo();
		System.out.println(obj.a);
		Finalkeyword2 obj1=new Finalkeyword2();
		obj1.show();

	}

}

class Finalkeyword2 extends Finalkeyworddemo
{
//	void show()
//	{
//		System.out.println("Hey");
//	}
	// we can't override when methods declared as final in parent class
}
