package day8;

public class Urlexample {

	public static void main(String[] args) {
		
		String str="lkajfldkmmmhttps:\\www.google.comlkjlkhttp:\\yahoo.com";
		
		int fi=str.indexOf("h");
		int li=str.lastIndexOf("m");
		
		System.out.println(fi+" "+li);
		
		String str1=str.substring(fi,li+1);
		
		System.out.println(str1);		
	
		System.out.println(str1.contains("https"));

	}

}
