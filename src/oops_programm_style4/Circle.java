package oops_programm_style4;

public class Circle {

	private static double pi=3.14;
	private int r;
	private String color;
	
	
	public Circle(int r)
	{
		boolean radiusValue=CircleValidation.checkStatus(r);
		if(radiusValue)
		{
			this.r=r;
		}
		else
		{
			System.err.println("invalid value...");
		}
		
	}
		public  Circle()
		{
		      this(7);
		}
		public Circle(double diameter)
		{
			this((int) diameter/2);
		}
		public Circle(int r,String color)
		{
			this(r);
			if(CircleValidation.verifyColour(color))
			{
				this.color=color;
			}
			else
			{
				System.err.println("invalid colour");
			}
			
		}
	public void findArea()
	{
		double area=pi*r*r;
		System.out.println("area of circle:" + area);
	}
	public void  calCircumference()
	{
		double circumference=2*pi*r;
		System.out.println(" circumference :" +circumference);
	}
	public void display()
	{
		System.out.println("pi"+pi);
		System.out.println("radius:"+r);
		System.out.println("color:"+color);
		findArea();
		calCircumference();
	}
	
	
}
