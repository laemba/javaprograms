package day11;

public class Encapsulationdemo 
{
	//Wrapping the variables and methods in single unit is called as encapsulation
	
	//Rules for encpasulation
	//Class variable should be private
	//must have two methods for each variable as getters and setters
	//We can invoke/call or assign values to the class variable through method only
	
	private int accno;
	private String accname;
	private int accbal;
	
	
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAccno() {
		return accno;
	}
	
	
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	
	
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	
	
	
	
}
