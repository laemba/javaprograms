package day14;

public interface I2 {

	int b=20;
	void m2();
	void m();
	default void m5()
	{
		System.out.println("i am in m5");
	}
}
