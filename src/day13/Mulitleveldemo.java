package day13;



class wx extends xyz
{
	
	int c=50;
	void print()
	{
		System.out.println(c);
	}
}
public class Mulitleveldemo {

	public static void main(String[] args) {
		
		xyz obj=new xyz();
		obj.show();
		obj.display();
		wx obj2=new wx();
		obj2.show();
		obj2.display();
		obj2.print();
		
		 	

	}

}
