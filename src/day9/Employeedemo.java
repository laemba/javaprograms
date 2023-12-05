package day9;

public class Employeedemo {

	int empid;
	String ename;
	int empsal;
	String dept="Electricity";
	
	public void display()
	{
		System.out.println();
		System.out.println(empid +" "+ ename +" "+ empsal +" "+ dept);
		
	}
	
	public static void main(String[] args)
	{
		System.out.println();
		Employeedemo emp1=new Employeedemo();
//		emp1.empid=105;
//		emp1.ename="Ram";
//		emp1.empsal=5000;
		emp1.display();
		
		Employeedemo emp2=new Employeedemo();
//		emp2.empid=102;
//		emp2.ename="sam";
//		emp2.empsal=10000;
		emp2.display();
		
		
		Employeedemo emp3=new Employeedemo();
		emp3.display();
		
				
		
	}
}
