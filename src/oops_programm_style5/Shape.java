 package oops_programm_style5;

public class Shape {
	public String color;
	public int outline;
	public Shape(String color, int outline)
	{
		boolean colours=GenericValidation.verifyColor(color);
		boolean outlineValue=GenericValidation.verifythickness(outline);
		if(colours)
		{
		this.color=color;
		}
		else
		{
			System.err.println("invalid color");
		}
		if(outlineValue)
		{
		this.outline=outline;
		}
		else
		{
			System.err.println("invalid value");
		}
	}
	public void display()
	{
		System.out.println("color:"  +color);
		System.out.println("outline :"+outline +" cm");
	}

}
