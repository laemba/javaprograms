package day8;

public class Characterrepeated {

	public static void main(String[] args) {
			
		String str="abafbdabacdedabcde";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='d')
			{
				count++;
			}
			
		}
		
		System.out.println("d is repetead :"+count);
		
	}

}
