package oops_programm_style4;

public class Triangle {
	private String color;
	private int outline;
	private int nOfSides;
	public Triangle(String color,int outline)
	{
		if(TriangleValidation.verifyColor( color))
		{
			this.color=color;
			
		}
		else
		{
			System.err.println("invalid color");
		}
		if(TriangleValidation .verifythickness(outline))
		{
		this.outline=outline;
		}
		else
		{
			System.err.println("invald thickness");
		}
	}
	public void display()
	{
		System.out.println("traingle:"+color);
		System.out.println("triangle thickness is:"+outline);
	}

}
