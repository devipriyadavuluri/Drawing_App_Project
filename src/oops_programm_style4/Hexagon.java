package oops_programm_style4;

public class Hexagon {
	private String color;
	private int outline;
	private int nOfSides;
	public Hexagon(String color,int outline)
	{
		if(HexagonValidation.verifyColor( color))
		{
			this.color=color;
			
		}
		else
		{
			System.err.println("invalid color");
		}
		if(HexagonValidation .verifythickness(outline))
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
		System.out.println("hexagon:"+color);
		System.out.println("hexagon thickness is:"+outline);
	}

}



