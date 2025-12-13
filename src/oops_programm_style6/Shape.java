 package oops_programm_style6;

abstract class Shape {
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
	public  void shapeDetails() 
	
	{
		System.out.println("Shape color :"+color);
		System.out.println("shape outline :"+outline);
	}
	
	abstract public void view();
	abstract public void findArea();

}
