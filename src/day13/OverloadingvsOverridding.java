package day13;

//Method Overridding
//1.Possible only in inheritance concept
//2.Signature should be same
//3.Method name should be same
//
//Method Overloading
//1.Possible in single class and inheritance 
//2.Signature should different
//3.Method name should be same




class Animal
{
	void eat()
	{
		System.out.println("eating");
	}
		
}

class dog extends Animal
{
	void eat()
	{
		System.out.println("eating bread");
	}
	
	void eat(String food)
	{
		System.out.println(food);
	}
}

public class OverloadingvsOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.eat();
		obj.eat("meat");
	}

}
