package day4;

public class Switchcasedemo2 
{

	public static void main(String[] args)
	{
		String day="mon";
		
		switch(day)
		{
			
				 case "mon":System.out.println("Weekday");
				 			break;
				 case "tue":System.out.println("Weekday");
				 			break;
		       	 case "wed":System.out.println("Weekday");
		       	 			break;	
				 case "thu":System.out.println("Weekday");
				 			break;
		      	 case "fri":System.out.println("Weekday");
		      	 			break;     		         
		      	 case "sat": System.out.println("Weekend");
		      	 			 break;	
		      	 case "sun": System.out.println("Weekend");
		      	 			break;		         
		         default:System.out.println("Invalid input");
				 	
		}

	}

}
