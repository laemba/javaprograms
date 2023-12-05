package day12;

public class Thiskeyword {

	int a,b;
	static int c;
	
	Thiskeyword(int a, int b)
	{
		this.a=a;
		this.b=b;
	
	}
	
	void show()
	{
		System.out.println(a +" "+ b);
	
	}
	
	public static void main(String[] args) 
	{
				
		Thiskeyword th=new Thiskeyword(10,20);
		th.show();
		

	}

}
