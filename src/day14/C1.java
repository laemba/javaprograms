package day14;

public class C1 implements I1,I2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 obj=new C1();
		obj.m1();
		obj.m2();
		obj.m5();
		
	}

	@Override
	public void m1() 
	{
	
		System.out.println("Iam in m1");
		
	}

	@Override
	public void m2() {
		
		System.out.println("Iam in m2");
		
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
		System.out.println("i am in defult method");
		I2.super.m5();
		I1.super.m5();
	}

	
	

}
