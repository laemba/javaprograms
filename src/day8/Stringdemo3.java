package day8;

public class Stringdemo3
{
	public static void main(String[] args)
	{		
		String str="WelcomeTo Java";
//		
//		System.out.println(str.indexOf("k"));//7
//		System.out.println(str.lastIndexOf("o"));//8 increase by 1
//		System.out.println(str.substring(15));

		int startindex=str.indexOf("T");
		int endindex=str.indexOf("J");
		
		System.out.println("Startindex:"+ startindex +" "+ "Endindex: "+endindex);
		System.out.println(str.substring(startindex,endindex+1));
			
	}

}
