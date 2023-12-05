package day8;

public class Stringimutable {

	public static void main(String[] args) {
		
		int a=10;
		//a++;
		a=a+1;
		System.out.println(a);
		
		String name="Welcome ";			   		   
		name.concat("To Java");		
		System.out.println(name);//Welcome
		
		StringBuffer s=new StringBuffer("Welcome ");
		s.append("To Java");
		System.out.println(s);//Welcome to java
		
		StringBuilder s1=new StringBuilder("Selenium ");
		s1.append("To java");
		System.out.println(s1);//Selenium to java
		
		
	}

}
