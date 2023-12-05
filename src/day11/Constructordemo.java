package day11;

public class Constructordemo {

	int width,height,depth;
	
	
	Constructordemo()
	{
		width=height=depth=0;
		System.out.println(width+height+depth);
	}
	
	Constructordemo(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
		System.out.println(width+height+depth);
	}
	
	Constructordemo(int len)
	{
		width=height=depth=len;
		System.out.println(width+height+depth);
	}
	
	
}
