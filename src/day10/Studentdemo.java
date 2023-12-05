package day10;

public class Studentdemo {
	
	//Assign values
	
	//By using obj ref -- done
	//By using method
	//By using constructor
	
	int sid;
	String sname;
	
	Studentdemo(int id,String name)
	{
		sid=id;
		sname=name;
	}
	
		
	void setData(int id,String name)
	{
		sid=id;
		sname=name;
	}
	
	public void studentData()
	{
				 
		System.out.println(sid);
		System.out.println(sname);
	}

}
