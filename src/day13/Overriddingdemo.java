package day13;


class Bike
{
	void horn()
	{
		System.out.println("sound");
	}
	
}

class Honda extends Bike
{
	void horn()
	{
		System.out.println("Loud sound");
	}
}



public class Overriddingdemo {
	
	void print()
	{
		System.out.println("main class");
	}
	public static void main(String[] args) 
	{
		Honda obj=new Honda();
		obj.horn();
		Bike obj1=new Bike();
		obj1.horn();
		Overriddingdemo obj3=new Overriddingdemo();
		obj3.print();
	}

}
