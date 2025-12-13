package oops_programm_style3;

public class Circle {

	private static double pi=3.14;
	private int r;
	public void giveRadius(int a)
	{
		boolean radiusValue=CircleValidation.checkStatus(a);
		if(radiusValue)
		{
			r=a;
		}
		else
		{
			System.err.println("invalid value...");
		}
				
	}
	public void findArea()
	{
		double area=pi*r*r;
		System.out.println("area of circle:"+area);
	}
	public void  calCircumference()
	{
		double circumference=2*pi*r;
		System.out.println(" circumference :"+circumference);
	}
	public void display()
	{
		System.out.println("pi"+pi);
		System.out.println("radius:"+r);
		findArea();
		calCircumference();
	}
	
	
}
