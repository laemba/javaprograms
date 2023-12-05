package day15;

public class Dataconversiondemo {

	//primitive data to String format data
	//String format data to primitive data
	
	//How can we achieve String format data to primitive data
	//using Wrapper class
	
	//int ------ Integer --converstion possible
	//double --- Double -- possible
	//float ---Float-- possible
	//long --Long-- possible
	//char--Character-- No
	//boolean-Boolean-- Possbile
	public static void main(String args[])
	{
		String price1="125";
		String price2="125";
//		
//		int a=Integer.parseInt(price1);
//		int b=Integer.parseInt(price2);
		
		System.out.println(Integer.parseInt(price1)+Integer.parseInt(price2));
		
		
		
		String price3="125.25";
		String price4="125.25";
		
		System.out.println(Double.parseDouble(price3)+Double.parseDouble(price4));
		
		
		String bo="true";
		boolean var=Boolean.parseBoolean(bo);
		System.out.println(var);
		
		String character="A";
		

		int[] a=new int[25];
		int [] aa= {10,20};
		
		//Premitive data to string
		
//		int x=125;
//		int y=125;
		
		
		double x=125.25;
		double y=125.25;
		double phone=1234567892;
		
		
		String x1=String.valueOf(x);
		String y1=String.valueOf(y);
		String phone1=String.valueOf(phone);
		
		System.out.println(x1+y1);
		
	}
	

}
