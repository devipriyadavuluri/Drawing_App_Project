 package oops_programm_style7;

abstract class Shape {
	protected String color;
	protected Outline outline; 
	public Shape(String color, Outline outline)
	{
		boolean colours=GenericValidation.verifyColor(color);
		if(colours)
		this.color=color;
		else
			System.err.println("invalid color");
		this.outline=outline;
		
	}
		public  void shapeDetails() 
	
	{
		System.out.println("Shape color :"+color);
		outline.showDetails();
	}
	
	abstract public void view();
	abstract public void findArea();

}
