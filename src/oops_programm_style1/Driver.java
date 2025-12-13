package oops_programm_style1;

public class Driver {
	public static void main(String[] args)
	{
		Circle circle1=new Circle();
		Circle circle2=new Circle();
		circle1.radius=10;
		circle2.radius=15;
		double area1=Circle.pi*circle1.radius*circle2.radius;
		double area2=Circle.pi*circle2.radius*circle2.radius;
		double circumference1=2*Circle.pi*circle1.radius;
		double circumference2=2*Circle.pi*circle2.radius;
		System.out.println("---------Circle1deatails---------------------------");
		System.out.println("pi:"+Circle.pi);
		System.out.println("radius:"+circle1.radius);
		System.out.println("Area:"+area1);
		System.out.println("circumference:"+circumference1);
		System.out.println("----------------------circle2details-----------------");
		System.out.println("pi:"+Circle.pi);
		System.out.println("radius:"+circle2.radius);
		System.out.println("Area:"+area2);
		System.out.println("circumference:"+circumference2);
		
	}

}
