package oops_programm_style4;

public class Pentagon {
	private String color;
	private int outline;
	private int nOfSides;
	public Pentagon(String color,int outline)
	{
		if(PentagonValidation.verifyColor( color))
		{
			this.color=color;
			
		}
		else
		{
			System.err.println("invalid color");
		}
		if(PentagonValidation .verifythickness(outline))
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
		System.out.println("pentagon:"+color);
		System.out.println("pentagon thickness is:"+outline);
	}


}
