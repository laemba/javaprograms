package day14;

public interface I1 
{
	
	int a=10;
	void m1();
	void m();
	default void m5()
	{
		System.out.println("i am in m6");
	}

}
