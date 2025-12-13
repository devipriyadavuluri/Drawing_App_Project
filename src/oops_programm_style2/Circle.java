package oops_programm_style2;

public class Circle {

	public static double pi=3.14;
	public int r;
	public void giveRadius(int a)
	{
		r=a;
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
