package oops_programm_style2;

public class Driver {
	public static void main(String[] args)
	{
		Circle circle1=new Circle();
		Circle circle2=new Circle();
		circle1.giveRadius(6);
		circle1.display();
		circle2.giveRadius(9);
		circle2.display();
		circle1.findArea();
		circle1.calCircumference();
	}
}

