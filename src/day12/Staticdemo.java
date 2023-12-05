package day12;

public class Staticdemo {
	
	int empid;
	String ename;
	int dept_num;//non static variable
	static int dept=500;//static vaiable
	
	//static methods directly access static stuff without creating object
	//Non static methods access everything
	
	static void show()
	{
		System.out.println(dept);
		System.out.println();
	}
	
	void display()
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(dept);
		System.out.println();
		show();
	}
	
	
	public static void main(String ar[])
	{
		
		System.out.println(dept);
		show();
		
		
		
		
		
//		Staticdemo st1=new Staticdemo();
//		st1.empid=10;
//		st1.ename="john";
//		st1.dept=5000;
//		st1.display();
//		
//		Staticdemo st2=new Staticdemo();
//		st2.empid=11;
//		st2.ename="Dan";
//		//st2.dept=10;
//		st2.display();
//		
//		Staticdemo st3=new Staticdemo();
//		st3.empid=12;
//		st3.ename="Sam";
//		//st3.dept=10;
//		st3.display();			
//		
		
	}
	
	

}
